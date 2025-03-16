package com.zfgc.zfgbb.migrator.converters;

import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zfgc.zfgbb.migrator.db.BoardDbo;
import com.zfgc.zfgbb.migrator.mappers.BoardDboMapper;
import com.zfgc.zfgbb.migrator.smf.dbo.SMFBoardDb;
import com.zfgc.zfgbb.migrator.smf.dbo.SMFBoardDbExample;
import com.zfgc.zfgbb.migrator.smf.mappers.SMFBoardDbMapper;

@Component
public class BoardConverter {
	@Autowired
	private SMFBoardDbMapper smfBoardMapper;
	
	@Autowired
	private BoardDboMapper boardMapper;
	
	public Map<Integer,BoardDbo> convertToZfgbb() {
		List<SMFBoardDb> SMFBoards = smfBoardMapper.selectByExample(new SMFBoardDbExample());
		Map<Integer, SMFBoardDb> smf = SMFBoards.stream().collect(Collectors.toMap(SMFBoardDb::getIdBoard, Function.identity()));
		Map<Integer,BoardDbo> result = new HashMap<>();

		SMFBoards.forEach((smfBoard) -> {
			BoardDbo board = new BoardDbo();

			board.setBoardId(smfBoard.getIdBoard());
			board.setBoardName(smfBoard.getName());
			board.setCategoryId(smfBoard.getIdCat());
			board.setSeqno(smfBoard.getBoardOrder().intValue());
			
			try {
				board.setMigrationHash(board.computeHash());
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			result.put(board.getBoardId(), board);
			
			
			BoardDbo existingBoard = boardMapper.selectByPrimaryKey(board.getBoardId());
			if(existingBoard == null) {
				boardMapper.insert(board);
			}
			else if(!existingBoard.getMigrationHash().equals(board.getMigrationHash())) {
				boardMapper.updateByPrimaryKey(board);
			}
		});
		
		//run again to update parent board IDs
		result.values().forEach(board -> {
			if(smf.get(board.getBoardId()).getIdParent() == null){
				board.setParentBoardId(0);
				boardMapper.updateByPrimaryKey(board);
			}
			else if(smf.get(board.getBoardId()).getIdParent() != 0) {
				board.setParentBoardId(smf.get(board.getBoardId()).getIdParent());
				boardMapper.updateByPrimaryKey(board);
			}
		});
		
		return result;
	}
}
