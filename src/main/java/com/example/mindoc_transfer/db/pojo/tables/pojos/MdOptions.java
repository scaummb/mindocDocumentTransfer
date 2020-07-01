/**
 * This class is generated by jOOQ
 */
package com.example.mindoc_transfer.db.pojo.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MdOptions implements Serializable {

    private static final long serialVersionUID = 320894228;

    private Integer optionId;
    private String  optionTitle;
    private String  optionName;
    private String  optionValue;
    private String  remark;

    public MdOptions() {}

    public MdOptions(MdOptions value) {
        this.optionId = value.optionId;
        this.optionTitle = value.optionTitle;
        this.optionName = value.optionName;
        this.optionValue = value.optionValue;
        this.remark = value.remark;
    }

    public MdOptions(
        Integer optionId,
        String  optionTitle,
        String  optionName,
        String  optionValue,
        String  remark
    ) {
        this.optionId = optionId;
        this.optionTitle = optionTitle;
        this.optionName = optionName;
        this.optionValue = optionValue;
        this.remark = remark;
    }

    public Integer getOptionId() {
        return this.optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
    }

    public String getOptionTitle() {
        return this.optionTitle;
    }

    public void setOptionTitle(String optionTitle) {
        this.optionTitle = optionTitle;
    }

    public String getOptionName() {
        return this.optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public String getOptionValue() {
        return this.optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }

    public String getRemark() {
        return this.remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("MdOptions (");

        sb.append(optionId);
        sb.append(", ").append(optionTitle);
        sb.append(", ").append(optionName);
        sb.append(", ").append(optionValue);
        sb.append(", ").append(remark);

        sb.append(")");
        return sb.toString();
    }
}