package com.zfgc.zfgbb.migrator.db;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserDboExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table zfgbb.user
	 * @mbg.generated  Mon Feb 10 18:16:10 EST 2025
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table zfgbb.user
	 * @mbg.generated  Mon Feb 10 18:16:10 EST 2025
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table zfgbb.user
	 * @mbg.generated  Mon Feb 10 18:16:10 EST 2025
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.user
	 * @mbg.generated  Mon Feb 10 18:16:10 EST 2025
	 */
	public UserDboExample() {
		oredCriteria = new ArrayList<>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.user
	 * @mbg.generated  Mon Feb 10 18:16:10 EST 2025
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.user
	 * @mbg.generated  Mon Feb 10 18:16:10 EST 2025
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.user
	 * @mbg.generated  Mon Feb 10 18:16:10 EST 2025
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.user
	 * @mbg.generated  Mon Feb 10 18:16:10 EST 2025
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.user
	 * @mbg.generated  Mon Feb 10 18:16:10 EST 2025
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.user
	 * @mbg.generated  Mon Feb 10 18:16:10 EST 2025
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.user
	 * @mbg.generated  Mon Feb 10 18:16:10 EST 2025
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.user
	 * @mbg.generated  Mon Feb 10 18:16:10 EST 2025
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.user
	 * @mbg.generated  Mon Feb 10 18:16:10 EST 2025
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table zfgbb.user
	 * @mbg.generated  Mon Feb 10 18:16:10 EST 2025
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table zfgbb.user
	 * @mbg.generated  Mon Feb 10 18:16:10 EST 2025
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andUserIdIsNull() {
			addCriterion("user_id is null");
			return (Criteria) this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("user_id is not null");
			return (Criteria) this;
		}

		public Criteria andUserIdEqualTo(Integer value) {
			addCriterion("user_id =", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotEqualTo(Integer value) {
			addCriterion("user_id <>", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThan(Integer value) {
			addCriterion("user_id >", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("user_id >=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThan(Integer value) {
			addCriterion("user_id <", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdLessThanOrEqualTo(Integer value) {
			addCriterion("user_id <=", value, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdIn(List<Integer> values) {
			addCriterion("user_id in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotIn(List<Integer> values) {
			addCriterion("user_id not in", values, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdBetween(Integer value1, Integer value2) {
			addCriterion("user_id between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
			addCriterion("user_id not between", value1, value2, "userId");
			return (Criteria) this;
		}

		public Criteria andCreatedTsIsNull() {
			addCriterion("created_ts is null");
			return (Criteria) this;
		}

		public Criteria andCreatedTsIsNotNull() {
			addCriterion("created_ts is not null");
			return (Criteria) this;
		}

		public Criteria andCreatedTsEqualTo(LocalDateTime value) {
			addCriterion("created_ts =", value, "createdTs");
			return (Criteria) this;
		}

		public Criteria andCreatedTsNotEqualTo(LocalDateTime value) {
			addCriterion("created_ts <>", value, "createdTs");
			return (Criteria) this;
		}

		public Criteria andCreatedTsGreaterThan(LocalDateTime value) {
			addCriterion("created_ts >", value, "createdTs");
			return (Criteria) this;
		}

		public Criteria andCreatedTsGreaterThanOrEqualTo(LocalDateTime value) {
			addCriterion("created_ts >=", value, "createdTs");
			return (Criteria) this;
		}

		public Criteria andCreatedTsLessThan(LocalDateTime value) {
			addCriterion("created_ts <", value, "createdTs");
			return (Criteria) this;
		}

		public Criteria andCreatedTsLessThanOrEqualTo(LocalDateTime value) {
			addCriterion("created_ts <=", value, "createdTs");
			return (Criteria) this;
		}

		public Criteria andCreatedTsIn(List<LocalDateTime> values) {
			addCriterion("created_ts in", values, "createdTs");
			return (Criteria) this;
		}

		public Criteria andCreatedTsNotIn(List<LocalDateTime> values) {
			addCriterion("created_ts not in", values, "createdTs");
			return (Criteria) this;
		}

		public Criteria andCreatedTsBetween(LocalDateTime value1, LocalDateTime value2) {
			addCriterion("created_ts between", value1, value2, "createdTs");
			return (Criteria) this;
		}

		public Criteria andCreatedTsNotBetween(LocalDateTime value1, LocalDateTime value2) {
			addCriterion("created_ts not between", value1, value2, "createdTs");
			return (Criteria) this;
		}

		public Criteria andUpdatedTsIsNull() {
			addCriterion("updated_ts is null");
			return (Criteria) this;
		}

		public Criteria andUpdatedTsIsNotNull() {
			addCriterion("updated_ts is not null");
			return (Criteria) this;
		}

		public Criteria andUpdatedTsEqualTo(LocalDateTime value) {
			addCriterion("updated_ts =", value, "updatedTs");
			return (Criteria) this;
		}

		public Criteria andUpdatedTsNotEqualTo(LocalDateTime value) {
			addCriterion("updated_ts <>", value, "updatedTs");
			return (Criteria) this;
		}

		public Criteria andUpdatedTsGreaterThan(LocalDateTime value) {
			addCriterion("updated_ts >", value, "updatedTs");
			return (Criteria) this;
		}

		public Criteria andUpdatedTsGreaterThanOrEqualTo(LocalDateTime value) {
			addCriterion("updated_ts >=", value, "updatedTs");
			return (Criteria) this;
		}

		public Criteria andUpdatedTsLessThan(LocalDateTime value) {
			addCriterion("updated_ts <", value, "updatedTs");
			return (Criteria) this;
		}

		public Criteria andUpdatedTsLessThanOrEqualTo(LocalDateTime value) {
			addCriterion("updated_ts <=", value, "updatedTs");
			return (Criteria) this;
		}

		public Criteria andUpdatedTsIn(List<LocalDateTime> values) {
			addCriterion("updated_ts in", values, "updatedTs");
			return (Criteria) this;
		}

		public Criteria andUpdatedTsNotIn(List<LocalDateTime> values) {
			addCriterion("updated_ts not in", values, "updatedTs");
			return (Criteria) this;
		}

		public Criteria andUpdatedTsBetween(LocalDateTime value1, LocalDateTime value2) {
			addCriterion("updated_ts between", value1, value2, "updatedTs");
			return (Criteria) this;
		}

		public Criteria andUpdatedTsNotBetween(LocalDateTime value1, LocalDateTime value2) {
			addCriterion("updated_ts not between", value1, value2, "updatedTs");
			return (Criteria) this;
		}

		public Criteria andSsoKeyIsNull() {
			addCriterion("sso_key is null");
			return (Criteria) this;
		}

		public Criteria andSsoKeyIsNotNull() {
			addCriterion("sso_key is not null");
			return (Criteria) this;
		}

		public Criteria andSsoKeyEqualTo(String value) {
			addCriterion("sso_key =", value, "ssoKey");
			return (Criteria) this;
		}

		public Criteria andSsoKeyNotEqualTo(String value) {
			addCriterion("sso_key <>", value, "ssoKey");
			return (Criteria) this;
		}

		public Criteria andSsoKeyGreaterThan(String value) {
			addCriterion("sso_key >", value, "ssoKey");
			return (Criteria) this;
		}

		public Criteria andSsoKeyGreaterThanOrEqualTo(String value) {
			addCriterion("sso_key >=", value, "ssoKey");
			return (Criteria) this;
		}

		public Criteria andSsoKeyLessThan(String value) {
			addCriterion("sso_key <", value, "ssoKey");
			return (Criteria) this;
		}

		public Criteria andSsoKeyLessThanOrEqualTo(String value) {
			addCriterion("sso_key <=", value, "ssoKey");
			return (Criteria) this;
		}

		public Criteria andSsoKeyLike(String value) {
			addCriterion("sso_key like", value, "ssoKey");
			return (Criteria) this;
		}

		public Criteria andSsoKeyNotLike(String value) {
			addCriterion("sso_key not like", value, "ssoKey");
			return (Criteria) this;
		}

		public Criteria andSsoKeyIn(List<String> values) {
			addCriterion("sso_key in", values, "ssoKey");
			return (Criteria) this;
		}

		public Criteria andSsoKeyNotIn(List<String> values) {
			addCriterion("sso_key not in", values, "ssoKey");
			return (Criteria) this;
		}

		public Criteria andSsoKeyBetween(String value1, String value2) {
			addCriterion("sso_key between", value1, value2, "ssoKey");
			return (Criteria) this;
		}

		public Criteria andSsoKeyNotBetween(String value1, String value2) {
			addCriterion("sso_key not between", value1, value2, "ssoKey");
			return (Criteria) this;
		}

		public Criteria andActiveFlagIsNull() {
			addCriterion("active_flag is null");
			return (Criteria) this;
		}

		public Criteria andActiveFlagIsNotNull() {
			addCriterion("active_flag is not null");
			return (Criteria) this;
		}

		public Criteria andActiveFlagEqualTo(Boolean value) {
			addCriterion("active_flag =", value, "activeFlag");
			return (Criteria) this;
		}

		public Criteria andActiveFlagNotEqualTo(Boolean value) {
			addCriterion("active_flag <>", value, "activeFlag");
			return (Criteria) this;
		}

		public Criteria andActiveFlagGreaterThan(Boolean value) {
			addCriterion("active_flag >", value, "activeFlag");
			return (Criteria) this;
		}

		public Criteria andActiveFlagGreaterThanOrEqualTo(Boolean value) {
			addCriterion("active_flag >=", value, "activeFlag");
			return (Criteria) this;
		}

		public Criteria andActiveFlagLessThan(Boolean value) {
			addCriterion("active_flag <", value, "activeFlag");
			return (Criteria) this;
		}

		public Criteria andActiveFlagLessThanOrEqualTo(Boolean value) {
			addCriterion("active_flag <=", value, "activeFlag");
			return (Criteria) this;
		}

		public Criteria andActiveFlagIn(List<Boolean> values) {
			addCriterion("active_flag in", values, "activeFlag");
			return (Criteria) this;
		}

		public Criteria andActiveFlagNotIn(List<Boolean> values) {
			addCriterion("active_flag not in", values, "activeFlag");
			return (Criteria) this;
		}

		public Criteria andActiveFlagBetween(Boolean value1, Boolean value2) {
			addCriterion("active_flag between", value1, value2, "activeFlag");
			return (Criteria) this;
		}

		public Criteria andActiveFlagNotBetween(Boolean value1, Boolean value2) {
			addCriterion("active_flag not between", value1, value2, "activeFlag");
			return (Criteria) this;
		}

		public Criteria andDisplayNameIsNull() {
			addCriterion("display_name is null");
			return (Criteria) this;
		}

		public Criteria andDisplayNameIsNotNull() {
			addCriterion("display_name is not null");
			return (Criteria) this;
		}

		public Criteria andDisplayNameEqualTo(String value) {
			addCriterion("display_name =", value, "displayName");
			return (Criteria) this;
		}

		public Criteria andDisplayNameNotEqualTo(String value) {
			addCriterion("display_name <>", value, "displayName");
			return (Criteria) this;
		}

		public Criteria andDisplayNameGreaterThan(String value) {
			addCriterion("display_name >", value, "displayName");
			return (Criteria) this;
		}

		public Criteria andDisplayNameGreaterThanOrEqualTo(String value) {
			addCriterion("display_name >=", value, "displayName");
			return (Criteria) this;
		}

		public Criteria andDisplayNameLessThan(String value) {
			addCriterion("display_name <", value, "displayName");
			return (Criteria) this;
		}

		public Criteria andDisplayNameLessThanOrEqualTo(String value) {
			addCriterion("display_name <=", value, "displayName");
			return (Criteria) this;
		}

		public Criteria andDisplayNameLike(String value) {
			addCriterion("display_name like", value, "displayName");
			return (Criteria) this;
		}

		public Criteria andDisplayNameNotLike(String value) {
			addCriterion("display_name not like", value, "displayName");
			return (Criteria) this;
		}

		public Criteria andDisplayNameIn(List<String> values) {
			addCriterion("display_name in", values, "displayName");
			return (Criteria) this;
		}

		public Criteria andDisplayNameNotIn(List<String> values) {
			addCriterion("display_name not in", values, "displayName");
			return (Criteria) this;
		}

		public Criteria andDisplayNameBetween(String value1, String value2) {
			addCriterion("display_name between", value1, value2, "displayName");
			return (Criteria) this;
		}

		public Criteria andDisplayNameNotBetween(String value1, String value2) {
			addCriterion("display_name not between", value1, value2, "displayName");
			return (Criteria) this;
		}

		public Criteria andUserNameIsNull() {
			addCriterion("user_name is null");
			return (Criteria) this;
		}

		public Criteria andUserNameIsNotNull() {
			addCriterion("user_name is not null");
			return (Criteria) this;
		}

		public Criteria andUserNameEqualTo(String value) {
			addCriterion("user_name =", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotEqualTo(String value) {
			addCriterion("user_name <>", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameGreaterThan(String value) {
			addCriterion("user_name >", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameGreaterThanOrEqualTo(String value) {
			addCriterion("user_name >=", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLessThan(String value) {
			addCriterion("user_name <", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLessThanOrEqualTo(String value) {
			addCriterion("user_name <=", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameLike(String value) {
			addCriterion("user_name like", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotLike(String value) {
			addCriterion("user_name not like", value, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameIn(List<String> values) {
			addCriterion("user_name in", values, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotIn(List<String> values) {
			addCriterion("user_name not in", values, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameBetween(String value1, String value2) {
			addCriterion("user_name between", value1, value2, "userName");
			return (Criteria) this;
		}

		public Criteria andUserNameNotBetween(String value1, String value2) {
			addCriterion("user_name not between", value1, value2, "userName");
			return (Criteria) this;
		}

		public Criteria andMigrationHashIsNull() {
			addCriterion("migration_hash is null");
			return (Criteria) this;
		}

		public Criteria andMigrationHashIsNotNull() {
			addCriterion("migration_hash is not null");
			return (Criteria) this;
		}

		public Criteria andMigrationHashEqualTo(String value) {
			addCriterion("migration_hash =", value, "migrationHash");
			return (Criteria) this;
		}

		public Criteria andMigrationHashNotEqualTo(String value) {
			addCriterion("migration_hash <>", value, "migrationHash");
			return (Criteria) this;
		}

		public Criteria andMigrationHashGreaterThan(String value) {
			addCriterion("migration_hash >", value, "migrationHash");
			return (Criteria) this;
		}

		public Criteria andMigrationHashGreaterThanOrEqualTo(String value) {
			addCriterion("migration_hash >=", value, "migrationHash");
			return (Criteria) this;
		}

		public Criteria andMigrationHashLessThan(String value) {
			addCriterion("migration_hash <", value, "migrationHash");
			return (Criteria) this;
		}

		public Criteria andMigrationHashLessThanOrEqualTo(String value) {
			addCriterion("migration_hash <=", value, "migrationHash");
			return (Criteria) this;
		}

		public Criteria andMigrationHashLike(String value) {
			addCriterion("migration_hash like", value, "migrationHash");
			return (Criteria) this;
		}

		public Criteria andMigrationHashNotLike(String value) {
			addCriterion("migration_hash not like", value, "migrationHash");
			return (Criteria) this;
		}

		public Criteria andMigrationHashIn(List<String> values) {
			addCriterion("migration_hash in", values, "migrationHash");
			return (Criteria) this;
		}

		public Criteria andMigrationHashNotIn(List<String> values) {
			addCriterion("migration_hash not in", values, "migrationHash");
			return (Criteria) this;
		}

		public Criteria andMigrationHashBetween(String value1, String value2) {
			addCriterion("migration_hash between", value1, value2, "migrationHash");
			return (Criteria) this;
		}

		public Criteria andMigrationHashNotBetween(String value1, String value2) {
			addCriterion("migration_hash not between", value1, value2, "migrationHash");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table zfgbb.user
	 * @mbg.generated  Mon Feb 10 18:16:10 EST 2025
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table zfgbb.user
     *
     * @mbg.generated do_not_delete_during_merge Sun Feb 09 22:23:39 EST 2025
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }
}