package com.ruoyi.system.domain.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

/**
 * @Description
 * @Author SangY
 * @Date 2025/1/4 19:38
 **/
public class NdtTruckTypeVo {
    /** id */
    @JsonSerialize(using = ToStringSerializer.class)
    private Long id;

    /** 车辆类型名称 */
    private String name;

    /** 准载重量 */
    private String allowableLoad;

    /** 准载体积 */
    private String allowableVolume;

    /** 长 */
    private String measureLong;

    /** 宽 */
    private Long measureWidth;

    /** 高 */
    private String measureHigh;

    /** 车型数量 */
    private Long num=0L;

    public NdtTruckTypeVo(Long id, String name, String allowableLoad, String allowableVolume, String measureLong, Long measureWidth, String measureHigh, Long num) {
        this.id = id;
        this.name = name;
        this.allowableLoad = allowableLoad;
        this.allowableVolume = allowableVolume;
        this.measureLong = measureLong;
        this.measureWidth = measureWidth;
        this.measureHigh = measureHigh;
        this.num = num;
    }

    public NdtTruckTypeVo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAllowableLoad() {
        return allowableLoad;
    }

    public void setAllowableLoad(String allowableLoad) {
        this.allowableLoad = allowableLoad;
    }

    public String getAllowableVolume() {
        return allowableVolume;
    }

    public void setAllowableVolume(String allowableVolume) {
        this.allowableVolume = allowableVolume;
    }

    public String getMeasureLong() {
        return measureLong;
    }

    public void setMeasureLong(String measureLong) {
        this.measureLong = measureLong;
    }

    public Long getMeasureWidth() {
        return measureWidth;
    }

    public void setMeasureWidth(Long measureWidth) {
        this.measureWidth = measureWidth;
    }

    public String getMeasureHigh() {
        return measureHigh;
    }

    public void setMeasureHigh(String measureHigh) {
        this.measureHigh = measureHigh;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "NdtTruckTypeVo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", allowableLoad='" + allowableLoad + '\'' +
                ", allowableVolume='" + allowableVolume + '\'' +
                ", measureLong='" + measureLong + '\'' +
                ", measureWidth=" + measureWidth +
                ", measureHigh='" + measureHigh + '\'' +
                ", num=" + num +
                '}';
    }
}
