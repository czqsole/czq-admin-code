package czq.czqsole.domain;

import java.util.ArrayList;
import java.util.List;

public class BuffExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuffExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andSpecialOrClassIsNull() {
            addCriterion("special_or_class is null");
            return (Criteria) this;
        }

        public Criteria andSpecialOrClassIsNotNull() {
            addCriterion("special_or_class is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialOrClassEqualTo(String value) {
            addCriterion("special_or_class =", value, "specialOrClass");
            return (Criteria) this;
        }

        public Criteria andSpecialOrClassNotEqualTo(String value) {
            addCriterion("special_or_class <>", value, "specialOrClass");
            return (Criteria) this;
        }

        public Criteria andSpecialOrClassGreaterThan(String value) {
            addCriterion("special_or_class >", value, "specialOrClass");
            return (Criteria) this;
        }

        public Criteria andSpecialOrClassGreaterThanOrEqualTo(String value) {
            addCriterion("special_or_class >=", value, "specialOrClass");
            return (Criteria) this;
        }

        public Criteria andSpecialOrClassLessThan(String value) {
            addCriterion("special_or_class <", value, "specialOrClass");
            return (Criteria) this;
        }

        public Criteria andSpecialOrClassLessThanOrEqualTo(String value) {
            addCriterion("special_or_class <=", value, "specialOrClass");
            return (Criteria) this;
        }

        public Criteria andSpecialOrClassLike(String value) {
            addCriterion("special_or_class like", value, "specialOrClass");
            return (Criteria) this;
        }

        public Criteria andSpecialOrClassNotLike(String value) {
            addCriterion("special_or_class not like", value, "specialOrClass");
            return (Criteria) this;
        }

        public Criteria andSpecialOrClassIn(List<String> values) {
            addCriterion("special_or_class in", values, "specialOrClass");
            return (Criteria) this;
        }

        public Criteria andSpecialOrClassNotIn(List<String> values) {
            addCriterion("special_or_class not in", values, "specialOrClass");
            return (Criteria) this;
        }

        public Criteria andSpecialOrClassBetween(String value1, String value2) {
            addCriterion("special_or_class between", value1, value2, "specialOrClass");
            return (Criteria) this;
        }

        public Criteria andSpecialOrClassNotBetween(String value1, String value2) {
            addCriterion("special_or_class not between", value1, value2, "specialOrClass");
            return (Criteria) this;
        }

        public Criteria andBuffTypeIsNull() {
            addCriterion("buff_type is null");
            return (Criteria) this;
        }

        public Criteria andBuffTypeIsNotNull() {
            addCriterion("buff_type is not null");
            return (Criteria) this;
        }

        public Criteria andBuffTypeEqualTo(String value) {
            addCriterion("buff_type =", value, "buffType");
            return (Criteria) this;
        }

        public Criteria andBuffTypeNotEqualTo(String value) {
            addCriterion("buff_type <>", value, "buffType");
            return (Criteria) this;
        }

        public Criteria andBuffTypeGreaterThan(String value) {
            addCriterion("buff_type >", value, "buffType");
            return (Criteria) this;
        }

        public Criteria andBuffTypeGreaterThanOrEqualTo(String value) {
            addCriterion("buff_type >=", value, "buffType");
            return (Criteria) this;
        }

        public Criteria andBuffTypeLessThan(String value) {
            addCriterion("buff_type <", value, "buffType");
            return (Criteria) this;
        }

        public Criteria andBuffTypeLessThanOrEqualTo(String value) {
            addCriterion("buff_type <=", value, "buffType");
            return (Criteria) this;
        }

        public Criteria andBuffTypeLike(String value) {
            addCriterion("buff_type like", value, "buffType");
            return (Criteria) this;
        }

        public Criteria andBuffTypeNotLike(String value) {
            addCriterion("buff_type not like", value, "buffType");
            return (Criteria) this;
        }

        public Criteria andBuffTypeIn(List<String> values) {
            addCriterion("buff_type in", values, "buffType");
            return (Criteria) this;
        }

        public Criteria andBuffTypeNotIn(List<String> values) {
            addCriterion("buff_type not in", values, "buffType");
            return (Criteria) this;
        }

        public Criteria andBuffTypeBetween(String value1, String value2) {
            addCriterion("buff_type between", value1, value2, "buffType");
            return (Criteria) this;
        }

        public Criteria andBuffTypeNotBetween(String value1, String value2) {
            addCriterion("buff_type not between", value1, value2, "buffType");
            return (Criteria) this;
        }

        public Criteria andBuffNumIsNull() {
            addCriterion("buff_num is null");
            return (Criteria) this;
        }

        public Criteria andBuffNumIsNotNull() {
            addCriterion("buff_num is not null");
            return (Criteria) this;
        }

        public Criteria andBuffNumEqualTo(Integer value) {
            addCriterion("buff_num =", value, "buffNum");
            return (Criteria) this;
        }

        public Criteria andBuffNumNotEqualTo(Integer value) {
            addCriterion("buff_num <>", value, "buffNum");
            return (Criteria) this;
        }

        public Criteria andBuffNumGreaterThan(Integer value) {
            addCriterion("buff_num >", value, "buffNum");
            return (Criteria) this;
        }

        public Criteria andBuffNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("buff_num >=", value, "buffNum");
            return (Criteria) this;
        }

        public Criteria andBuffNumLessThan(Integer value) {
            addCriterion("buff_num <", value, "buffNum");
            return (Criteria) this;
        }

        public Criteria andBuffNumLessThanOrEqualTo(Integer value) {
            addCriterion("buff_num <=", value, "buffNum");
            return (Criteria) this;
        }

        public Criteria andBuffNumIn(List<Integer> values) {
            addCriterion("buff_num in", values, "buffNum");
            return (Criteria) this;
        }

        public Criteria andBuffNumNotIn(List<Integer> values) {
            addCriterion("buff_num not in", values, "buffNum");
            return (Criteria) this;
        }

        public Criteria andBuffNumBetween(Integer value1, Integer value2) {
            addCriterion("buff_num between", value1, value2, "buffNum");
            return (Criteria) this;
        }

        public Criteria andBuffNumNotBetween(Integer value1, Integer value2) {
            addCriterion("buff_num not between", value1, value2, "buffNum");
            return (Criteria) this;
        }

        public Criteria andAbilityNameIsNull() {
            addCriterion("ability_name is null");
            return (Criteria) this;
        }

        public Criteria andAbilityNameIsNotNull() {
            addCriterion("ability_name is not null");
            return (Criteria) this;
        }

        public Criteria andAbilityNameEqualTo(String value) {
            addCriterion("ability_name =", value, "abilityName");
            return (Criteria) this;
        }

        public Criteria andAbilityNameNotEqualTo(String value) {
            addCriterion("ability_name <>", value, "abilityName");
            return (Criteria) this;
        }

        public Criteria andAbilityNameGreaterThan(String value) {
            addCriterion("ability_name >", value, "abilityName");
            return (Criteria) this;
        }

        public Criteria andAbilityNameGreaterThanOrEqualTo(String value) {
            addCriterion("ability_name >=", value, "abilityName");
            return (Criteria) this;
        }

        public Criteria andAbilityNameLessThan(String value) {
            addCriterion("ability_name <", value, "abilityName");
            return (Criteria) this;
        }

        public Criteria andAbilityNameLessThanOrEqualTo(String value) {
            addCriterion("ability_name <=", value, "abilityName");
            return (Criteria) this;
        }

        public Criteria andAbilityNameLike(String value) {
            addCriterion("ability_name like", value, "abilityName");
            return (Criteria) this;
        }

        public Criteria andAbilityNameNotLike(String value) {
            addCriterion("ability_name not like", value, "abilityName");
            return (Criteria) this;
        }

        public Criteria andAbilityNameIn(List<String> values) {
            addCriterion("ability_name in", values, "abilityName");
            return (Criteria) this;
        }

        public Criteria andAbilityNameNotIn(List<String> values) {
            addCriterion("ability_name not in", values, "abilityName");
            return (Criteria) this;
        }

        public Criteria andAbilityNameBetween(String value1, String value2) {
            addCriterion("ability_name between", value1, value2, "abilityName");
            return (Criteria) this;
        }

        public Criteria andAbilityNameNotBetween(String value1, String value2) {
            addCriterion("ability_name not between", value1, value2, "abilityName");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeIsNull() {
            addCriterion("ability_type is null");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeIsNotNull() {
            addCriterion("ability_type is not null");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeEqualTo(String value) {
            addCriterion("ability_type =", value, "abilityType");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeNotEqualTo(String value) {
            addCriterion("ability_type <>", value, "abilityType");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeGreaterThan(String value) {
            addCriterion("ability_type >", value, "abilityType");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ability_type >=", value, "abilityType");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeLessThan(String value) {
            addCriterion("ability_type <", value, "abilityType");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeLessThanOrEqualTo(String value) {
            addCriterion("ability_type <=", value, "abilityType");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeLike(String value) {
            addCriterion("ability_type like", value, "abilityType");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeNotLike(String value) {
            addCriterion("ability_type not like", value, "abilityType");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeIn(List<String> values) {
            addCriterion("ability_type in", values, "abilityType");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeNotIn(List<String> values) {
            addCriterion("ability_type not in", values, "abilityType");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeBetween(String value1, String value2) {
            addCriterion("ability_type between", value1, value2, "abilityType");
            return (Criteria) this;
        }

        public Criteria andAbilityTypeNotBetween(String value1, String value2) {
            addCriterion("ability_type not between", value1, value2, "abilityType");
            return (Criteria) this;
        }

        public Criteria andAbilityActionRangeIsNull() {
            addCriterion("ability_action_range is null");
            return (Criteria) this;
        }

        public Criteria andAbilityActionRangeIsNotNull() {
            addCriterion("ability_action_range is not null");
            return (Criteria) this;
        }

        public Criteria andAbilityActionRangeEqualTo(String value) {
            addCriterion("ability_action_range =", value, "abilityActionRange");
            return (Criteria) this;
        }

        public Criteria andAbilityActionRangeNotEqualTo(String value) {
            addCriterion("ability_action_range <>", value, "abilityActionRange");
            return (Criteria) this;
        }

        public Criteria andAbilityActionRangeGreaterThan(String value) {
            addCriterion("ability_action_range >", value, "abilityActionRange");
            return (Criteria) this;
        }

        public Criteria andAbilityActionRangeGreaterThanOrEqualTo(String value) {
            addCriterion("ability_action_range >=", value, "abilityActionRange");
            return (Criteria) this;
        }

        public Criteria andAbilityActionRangeLessThan(String value) {
            addCriterion("ability_action_range <", value, "abilityActionRange");
            return (Criteria) this;
        }

        public Criteria andAbilityActionRangeLessThanOrEqualTo(String value) {
            addCriterion("ability_action_range <=", value, "abilityActionRange");
            return (Criteria) this;
        }

        public Criteria andAbilityActionRangeLike(String value) {
            addCriterion("ability_action_range like", value, "abilityActionRange");
            return (Criteria) this;
        }

        public Criteria andAbilityActionRangeNotLike(String value) {
            addCriterion("ability_action_range not like", value, "abilityActionRange");
            return (Criteria) this;
        }

        public Criteria andAbilityActionRangeIn(List<String> values) {
            addCriterion("ability_action_range in", values, "abilityActionRange");
            return (Criteria) this;
        }

        public Criteria andAbilityActionRangeNotIn(List<String> values) {
            addCriterion("ability_action_range not in", values, "abilityActionRange");
            return (Criteria) this;
        }

        public Criteria andAbilityActionRangeBetween(String value1, String value2) {
            addCriterion("ability_action_range between", value1, value2, "abilityActionRange");
            return (Criteria) this;
        }

        public Criteria andAbilityActionRangeNotBetween(String value1, String value2) {
            addCriterion("ability_action_range not between", value1, value2, "abilityActionRange");
            return (Criteria) this;
        }

        public Criteria andAbilityDescIsNull() {
            addCriterion("ability_desc is null");
            return (Criteria) this;
        }

        public Criteria andAbilityDescIsNotNull() {
            addCriterion("ability_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAbilityDescEqualTo(String value) {
            addCriterion("ability_desc =", value, "abilityDesc");
            return (Criteria) this;
        }

        public Criteria andAbilityDescNotEqualTo(String value) {
            addCriterion("ability_desc <>", value, "abilityDesc");
            return (Criteria) this;
        }

        public Criteria andAbilityDescGreaterThan(String value) {
            addCriterion("ability_desc >", value, "abilityDesc");
            return (Criteria) this;
        }

        public Criteria andAbilityDescGreaterThanOrEqualTo(String value) {
            addCriterion("ability_desc >=", value, "abilityDesc");
            return (Criteria) this;
        }

        public Criteria andAbilityDescLessThan(String value) {
            addCriterion("ability_desc <", value, "abilityDesc");
            return (Criteria) this;
        }

        public Criteria andAbilityDescLessThanOrEqualTo(String value) {
            addCriterion("ability_desc <=", value, "abilityDesc");
            return (Criteria) this;
        }

        public Criteria andAbilityDescLike(String value) {
            addCriterion("ability_desc like", value, "abilityDesc");
            return (Criteria) this;
        }

        public Criteria andAbilityDescNotLike(String value) {
            addCriterion("ability_desc not like", value, "abilityDesc");
            return (Criteria) this;
        }

        public Criteria andAbilityDescIn(List<String> values) {
            addCriterion("ability_desc in", values, "abilityDesc");
            return (Criteria) this;
        }

        public Criteria andAbilityDescNotIn(List<String> values) {
            addCriterion("ability_desc not in", values, "abilityDesc");
            return (Criteria) this;
        }

        public Criteria andAbilityDescBetween(String value1, String value2) {
            addCriterion("ability_desc between", value1, value2, "abilityDesc");
            return (Criteria) this;
        }

        public Criteria andAbilityDescNotBetween(String value1, String value2) {
            addCriterion("ability_desc not between", value1, value2, "abilityDesc");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andTagIsNull() {
            addCriterion("tag is null");
            return (Criteria) this;
        }

        public Criteria andTagIsNotNull() {
            addCriterion("tag is not null");
            return (Criteria) this;
        }

        public Criteria andTagEqualTo(String value) {
            addCriterion("tag =", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotEqualTo(String value) {
            addCriterion("tag <>", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThan(String value) {
            addCriterion("tag >", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagGreaterThanOrEqualTo(String value) {
            addCriterion("tag >=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThan(String value) {
            addCriterion("tag <", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLessThanOrEqualTo(String value) {
            addCriterion("tag <=", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagLike(String value) {
            addCriterion("tag like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotLike(String value) {
            addCriterion("tag not like", value, "tag");
            return (Criteria) this;
        }

        public Criteria andTagIn(List<String> values) {
            addCriterion("tag in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotIn(List<String> values) {
            addCriterion("tag not in", values, "tag");
            return (Criteria) this;
        }

        public Criteria andTagBetween(String value1, String value2) {
            addCriterion("tag between", value1, value2, "tag");
            return (Criteria) this;
        }

        public Criteria andTagNotBetween(String value1, String value2) {
            addCriterion("tag not between", value1, value2, "tag");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
}