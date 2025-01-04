package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 车辆管理对象 ndt_truck
 * 
 * @author ruoyi
 * @date 2025-01-04
 */
public class NdtTruck extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    private Long id;

    /** 车型id主键 */
    @Excel(name = "车型id主键")
    private Long truckTypeId;

    /** 车辆类型名称 */
    @Excel(name = "车辆类型名称")
    private String truckTypeName;

    /** 车牌号码 */
    @Excel(name = "车牌号码")
    private String licensePlate;

    /** 司机数量 */
    @Excel(name = "司机数量")
    private Long driverNum;

    /** 关联司机 */
    @Excel(name = "关联司机")
    private String driverName;

    /** GPS设备id */
    @Excel(name = "GPS设备id")
    private Long deviceGpsId;

    /** 准载重量 */
    @Excel(name = "准载重量")
    private String allowableLoad;

    /** 准载体积 */
    @Excel(name = "准载体积")
    private String allowableVolume;

    /** 车辆状态 */
    @Excel(name = "车辆状态")
    private Integer status;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setTruckTypeId(Long truckTypeId) 
    {
        this.truckTypeId = truckTypeId;
    }

    public Long getTruckTypeId() 
    {
        return truckTypeId;
    }
    public void setTruckTypeName(String truckTypeName) 
    {
        this.truckTypeName = truckTypeName;
    }

    public String getTruckTypeName() 
    {
        return truckTypeName;
    }
    public void setLicensePlate(String licensePlate) 
    {
        this.licensePlate = licensePlate;
    }

    public String getLicensePlate() 
    {
        return licensePlate;
    }
    public void setDriverNum(Long driverNum) 
    {
        this.driverNum = driverNum;
    }

    public Long getDriverNum() 
    {
        return driverNum;
    }
    public void setDriverName(String driverName) 
    {
        this.driverName = driverName;
    }

    public String getDriverName() 
    {
        return driverName;
    }
    public void setDeviceGpsId(Long deviceGpsId) 
    {
        this.deviceGpsId = deviceGpsId;
    }

    public Long getDeviceGpsId() 
    {
        return deviceGpsId;
    }
    public void setAllowableLoad(String allowableLoad) 
    {
        this.allowableLoad = allowableLoad;
    }

    public String getAllowableLoad() 
    {
        return allowableLoad;
    }
    public void setAllowableVolume(String allowableVolume) 
    {
        this.allowableVolume = allowableVolume;
    }

    public String getAllowableVolume() 
    {
        return allowableVolume;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("truckTypeId", getTruckTypeId())
            .append("truckTypeName", getTruckTypeName())
            .append("licensePlate", getLicensePlate())
            .append("driverNum", getDriverNum())
            .append("driverName", getDriverName())
            .append("deviceGpsId", getDeviceGpsId())
            .append("allowableLoad", getAllowableLoad())
            .append("allowableVolume", getAllowableVolume())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
