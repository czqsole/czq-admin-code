package czq.czqsole.domain;

public class Buff {
    private Integer id;

    private String specialOrClass;

    private String buffType;

    private Integer buffNum;

    private String abilityName;

    private String abilityType;

    private String abilityActionRange;

    private String abilityDesc;

    private String comment;

    private String remark;

    private String tag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpecialOrClass() {
        return specialOrClass;
    }

    public void setSpecialOrClass(String specialOrClass) {
        this.specialOrClass = specialOrClass == null ? null : specialOrClass.trim();
    }

    public String getBuffType() {
        return buffType;
    }

    public void setBuffType(String buffType) {
        this.buffType = buffType == null ? null : buffType.trim();
    }

    public Integer getBuffNum() {
        return buffNum;
    }

    public void setBuffNum(Integer buffNum) {
        this.buffNum = buffNum;
    }

    public String getAbilityName() {
        return abilityName;
    }

    public void setAbilityName(String abilityName) {
        this.abilityName = abilityName == null ? null : abilityName.trim();
    }

    public String getAbilityType() {
        return abilityType;
    }

    public void setAbilityType(String abilityType) {
        this.abilityType = abilityType == null ? null : abilityType.trim();
    }

    public String getAbilityActionRange() {
        return abilityActionRange;
    }

    public void setAbilityActionRange(String abilityActionRange) {
        this.abilityActionRange = abilityActionRange == null ? null : abilityActionRange.trim();
    }

    public String getAbilityDesc() {
        return abilityDesc;
    }

    public void setAbilityDesc(String abilityDesc) {
        this.abilityDesc = abilityDesc == null ? null : abilityDesc.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public String toString() {
        return specialOrClass + "[" + buffNum + "] " + abilityName + ": " + abilityDesc;
    }
}