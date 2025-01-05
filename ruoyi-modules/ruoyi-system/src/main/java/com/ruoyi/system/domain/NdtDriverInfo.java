package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 司机基本信息对象 ndt_driver_info
 * 
 * @author ruoyi
 * @date 2025-01-05
 */
public class NdtDriverInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键id */
    private Long id;

    /** ndt_driver表id */
    @Excel(name = "ndt_driver表id")
    private Long driverId;

    /** 驾驶证号 */
    @Excel(name = "驾驶证号")
    private Long licenseNumber;

    /** 准驾车型 */
    @Excel(name = "准驾车型")
    private String allowableType;

    /** 驾龄 */
    @Excel(name = "驾龄")
    private String driverAge;

    /** 驾驶证有效期限 */
    @Excel(name = "驾驶证有效期限")
    private String validPeriod;

    /** 驾驶证类型 */
    @Excel(name = "驾驶证类型")
    private String licenseType;

    /** 图片信息 */
    @Excel(name = "图片信息")
    private String picture;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setDriverId(Long driverId) 
    {
        this.driverId = driverId;
    }

    public Long getDriverId() 
    {
        return driverId;
    }
    public void setLicenseNumber(Long licenseNumber) 
    {
        this.licenseNumber = licenseNumber;
    }

    public Long getLicenseNumber() 
    {
        return licenseNumber;
    }
    public void setAllowableType(String allowableType) 
    {
        this.allowableType = allowableType;
    }

    public String getAllowableType() 
    {
        return allowableType;
    }
    public void setDriverAge(String driverAge) 
    {
        this.driverAge = driverAge;
    }

    public String getDriverAge() 
    {
        return driverAge;
    }
    public void setValidPeriod(String validPeriod)
    {
        this.validPeriod = validPeriod;
    }

    public String getValidPeriod()
    {
        return validPeriod;
    }
    public void setLicenseType(String licenseType) 
    {
        this.licenseType = licenseType;
    }

    public String getLicenseType() 
    {
        return licenseType;
    }
    public void setPicture(String picture) 
    {
        this.picture = picture;
    }

    public String getPicture() 
    {
        return picture;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("driverId", getDriverId())
            .append("licenseNumber", getLicenseNumber())
            .append("allowableType", getAllowableType())
            .append("driverAge", getDriverAge())
            .append("validPeriod", getValidPeriod())
            .append("licenseType", getLicenseType())
            .append("picture", getPicture())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
