package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 快递员对象 ndt_courier
 * 
 * @author ruoyi
 * @date 2025-01-02
 */
public class NdtCourier extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 快递员账号 */
    @Excel(name = "快递员账号")
    private String courierAccount;

    /** 快递员名字 */
    @Excel(name = "快递员名字")
    private String courierName;

    /** 手机号 */
    @Excel(name = "手机号")
    private String phone;

    /** 工作状态(0：上班 ，1：休息) */
    @Excel(name = "工作状态(0：上班 ，1：休息)")
    private Integer workStatus;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCourierAccount(String courierAccount) 
    {
        this.courierAccount = courierAccount;
    }

    public String getCourierAccount() 
    {
        return courierAccount;
    }
    public void setCourierName(String courierName) 
    {
        this.courierName = courierName;
    }

    public String getCourierName() 
    {
        return courierName;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setWorkStatus(Integer workStatus) 
    {
        this.workStatus = workStatus;
    }

    public Integer getWorkStatus() 
    {
        return workStatus;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("courierAccount", getCourierAccount())
            .append("courierName", getCourierName())
            .append("phone", getPhone())
            .append("workStatus", getWorkStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
