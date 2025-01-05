package com.ruoyi.system.domain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 车型管理对象 ndt_truck_type
 * 
 * @author ruoyi
 * @date 2025-01-04
 */
public class NdtTruckType extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** id */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /** 车辆类型名称 */
    @Excel(name = "车辆类型名称")
    private String name;

    /** 准载重量 */
    @Excel(name = "准载重量")
    private String allowableLoad;

    /** 准载体积 */
    @Excel(name = "准载体积")
    private String allowableVolume;

    /** 长 */
    @Excel(name = "长")
    private String measureLong;

    /** 宽 */
    @Excel(name = "宽")
    private Long measureWidth;

    /** 高 */
    @Excel(name = "高")
    private String measureHigh;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
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
    public void setMeasureLong(String measureLong) 
    {
        this.measureLong = measureLong;
    }

    public String getMeasureLong() 
    {
        return measureLong;
    }
    public void setMeasureWidth(Long measureWidth) 
    {
        this.measureWidth = measureWidth;
    }

    public Long getMeasureWidth() 
    {
        return measureWidth;
    }
    public void setMeasureHigh(String measureHigh) 
    {
        this.measureHigh = measureHigh;
    }

    public String getMeasureHigh() 
    {
        return measureHigh;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("allowableLoad", getAllowableLoad())
            .append("allowableVolume", getAllowableVolume())
            .append("measureLong", getMeasureLong())
            .append("measureWidth", getMeasureWidth())
            .append("measureHigh", getMeasureHigh())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
