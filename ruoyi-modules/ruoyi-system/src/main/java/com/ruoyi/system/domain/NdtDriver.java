package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 司机管理对象 ndt_driver
 * 
 * @author ruoyi
 * @date 2025-01-04
 */
public class NdtDriver extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 司机账号 */
    @Excel(name = "司机账号")
    private String driverAccount;

    /** 司机电话 */
    @Excel(name = "司机电话")
    private String phone;

    /** 司机名字 */
    @Excel(name = "司机名字")
    private String courierName;

    /** 工作状态 */
    @Excel(name = "工作状态")
    private Integer workStatus;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDriverAccount(String driverAccount) 
    {
        this.driverAccount = driverAccount;
    }

    public String getDriverAccount() 
    {
        return driverAccount;
    }
    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }
    public void setCourierName(String courierName) 
    {
        this.courierName = courierName;
    }

    public String getCourierName() 
    {
        return courierName;
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
            .append("driverAccount", getDriverAccount())
            .append("phone", getPhone())
            .append("courierName", getCourierName())
            .append("workStatus", getWorkStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
