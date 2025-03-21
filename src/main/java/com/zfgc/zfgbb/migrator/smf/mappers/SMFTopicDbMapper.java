package com.zfgc.zfgbb.migrator.smf.mappers;

import com.zfgc.zfgbb.migrator.smf.dbo.SMFTopicDb;
import com.zfgc.zfgbb.migrator.smf.dbo.SMFTopicDbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SMFTopicDbMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smf_1topics
     *
     * @mbg.generated Mon Feb 10 22:51:30 EST 2025
     */
    long countByExample(SMFTopicDbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smf_1topics
     *
     * @mbg.generated Mon Feb 10 22:51:30 EST 2025
     */
    int deleteByExample(SMFTopicDbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smf_1topics
     *
     * @mbg.generated Mon Feb 10 22:51:30 EST 2025
     */
    int deleteByPrimaryKey(Integer idTopic);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smf_1topics
     *
     * @mbg.generated Mon Feb 10 22:51:30 EST 2025
     */
    int insert(SMFTopicDb row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smf_1topics
     *
     * @mbg.generated Mon Feb 10 22:51:30 EST 2025
     */
    int insertSelective(SMFTopicDb row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smf_1topics
     *
     * @mbg.generated Mon Feb 10 22:51:30 EST 2025
     */
    List<SMFTopicDb> selectByExample(SMFTopicDbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smf_1topics
     *
     * @mbg.generated Mon Feb 10 22:51:30 EST 2025
     */
    SMFTopicDb selectByPrimaryKey(Integer idTopic);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smf_1topics
     *
     * @mbg.generated Mon Feb 10 22:51:30 EST 2025
     */
    int updateByExampleSelective(@Param("row") SMFTopicDb row, @Param("example") SMFTopicDbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smf_1topics
     *
     * @mbg.generated Mon Feb 10 22:51:30 EST 2025
     */
    int updateByExample(@Param("row") SMFTopicDb row, @Param("example") SMFTopicDbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smf_1topics
     *
     * @mbg.generated Mon Feb 10 22:51:30 EST 2025
     */
    int updateByPrimaryKeySelective(SMFTopicDb row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table smf_1topics
     *
     * @mbg.generated Mon Feb 10 22:51:30 EST 2025
     */
    int updateByPrimaryKey(SMFTopicDb row);
}