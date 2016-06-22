package org.ibase4j.model.generator;

import java.util.Date;
import org.ibase4j.core.base.BaseModel;

@SuppressWarnings("serial")
public class SysDic extends BaseModel {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dic.id_
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dic.index_id
     *
     * @mbggenerated
     */
    private Integer indexId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dic.code_
     *
     * @mbggenerated
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dic.code_text
     *
     * @mbggenerated
     */
    private String codeText;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dic.sort_no
     *
     * @mbggenerated
     */
    private Integer sortNo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dic.editable_
     *
     * @mbggenerated
     */
    private Integer editable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dic.enable_
     *
     * @mbggenerated
     */
    private Integer enable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dic.remark_
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dic.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dic.create_by
     *
     * @mbggenerated
     */
    private Integer createBy;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dic.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_dic.update_by
     *
     * @mbggenerated
     */
    private Integer updateBy;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dic.id_
     *
     * @return the value of sys_dic.id_
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dic.id_
     *
     * @param id the value for sys_dic.id_
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dic.index_id
     *
     * @return the value of sys_dic.index_id
     *
     * @mbggenerated
     */
    public Integer getIndexId() {
        return indexId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dic.index_id
     *
     * @param indexId the value for sys_dic.index_id
     *
     * @mbggenerated
     */
    public void setIndexId(Integer indexId) {
        this.indexId = indexId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dic.code_
     *
     * @return the value of sys_dic.code_
     *
     * @mbggenerated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dic.code_
     *
     * @param code the value for sys_dic.code_
     *
     * @mbggenerated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dic.code_text
     *
     * @return the value of sys_dic.code_text
     *
     * @mbggenerated
     */
    public String getCodeText() {
        return codeText;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dic.code_text
     *
     * @param codeText the value for sys_dic.code_text
     *
     * @mbggenerated
     */
    public void setCodeText(String codeText) {
        this.codeText = codeText == null ? null : codeText.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dic.sort_no
     *
     * @return the value of sys_dic.sort_no
     *
     * @mbggenerated
     */
    public Integer getSortNo() {
        return sortNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dic.sort_no
     *
     * @param sortNo the value for sys_dic.sort_no
     *
     * @mbggenerated
     */
    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dic.editable_
     *
     * @return the value of sys_dic.editable_
     *
     * @mbggenerated
     */
    public Integer getEditable() {
        return editable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dic.editable_
     *
     * @param editable the value for sys_dic.editable_
     *
     * @mbggenerated
     */
    public void setEditable(Integer editable) {
        this.editable = editable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dic.enable_
     *
     * @return the value of sys_dic.enable_
     *
     * @mbggenerated
     */
    public Integer getEnable() {
        return enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dic.enable_
     *
     * @param enable the value for sys_dic.enable_
     *
     * @mbggenerated
     */
    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dic.remark_
     *
     * @return the value of sys_dic.remark_
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dic.remark_
     *
     * @param remark the value for sys_dic.remark_
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dic.create_time
     *
     * @return the value of sys_dic.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dic.create_time
     *
     * @param createTime the value for sys_dic.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dic.create_by
     *
     * @return the value of sys_dic.create_by
     *
     * @mbggenerated
     */
    public Integer getCreateBy() {
        return createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dic.create_by
     *
     * @param createBy the value for sys_dic.create_by
     *
     * @mbggenerated
     */
    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dic.update_time
     *
     * @return the value of sys_dic.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dic.update_time
     *
     * @param updateTime the value for sys_dic.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_dic.update_by
     *
     * @return the value of sys_dic.update_by
     *
     * @mbggenerated
     */
    public Integer getUpdateBy() {
        return updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_dic.update_by
     *
     * @param updateBy the value for sys_dic.update_by
     *
     * @mbggenerated
     */
    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dic
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", indexId=").append(indexId);
        sb.append(", code=").append(code);
        sb.append(", codeText=").append(codeText);
        sb.append(", sortNo=").append(sortNo);
        sb.append(", editable=").append(editable);
        sb.append(", enable=").append(enable);
        sb.append(", remark=").append(remark);
        sb.append(", createTime=").append(createTime);
        sb.append(", createBy=").append(createBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateBy=").append(updateBy);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dic
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        SysDic other = (SysDic) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getIndexId() == null ? other.getIndexId() == null : this.getIndexId().equals(other.getIndexId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getCodeText() == null ? other.getCodeText() == null : this.getCodeText().equals(other.getCodeText()))
            && (this.getSortNo() == null ? other.getSortNo() == null : this.getSortNo().equals(other.getSortNo()))
            && (this.getEditable() == null ? other.getEditable() == null : this.getEditable().equals(other.getEditable()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getCreateBy() == null ? other.getCreateBy() == null : this.getCreateBy().equals(other.getCreateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_dic
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIndexId() == null) ? 0 : getIndexId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getCodeText() == null) ? 0 : getCodeText().hashCode());
        result = prime * result + ((getSortNo() == null) ? 0 : getSortNo().hashCode());
        result = prime * result + ((getEditable() == null) ? 0 : getEditable().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getCreateBy() == null) ? 0 : getCreateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        return result;
    }
}