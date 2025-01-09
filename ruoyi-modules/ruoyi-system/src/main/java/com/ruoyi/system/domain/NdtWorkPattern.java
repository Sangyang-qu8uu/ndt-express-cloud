package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

import java.util.HashMap;
import java.util.Map;

/**
 * 工作模式对象 ndt_work_pattern
 *
 * @author ruoyi
 * @date 2025-01-08
 */
public class NdtWorkPattern extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    private Long id;

    /**
     * 工作模式名称
     */
    @Excel(name = "工作模式名称")
    private String name;

    /**
     * 1:员工，2：快递员，3：司机
     */
    @Excel(name = "1:员工，2：快递员，3：司机")
    private String userType;

    /**
     * 工作模式类型1：礼拜制，2：连续制
     */
    @Excel(name = "工作模式类型1：礼拜制，2：连续制")
    private String workPatternType;

    /**
     * 礼拜制，周一是否上班,0：表示未填，1:代表上班，2：代表不上班
     */
    @Excel(name = "礼拜制，周一是否上班,0：表示未填，1:代表上班，2：代表不上班")
    private String monday;

    /**
     * 礼拜制，周二是否上班,0：表示未填，1:代表上班，2：代表不上班'
     */
    @Excel(name = "礼拜制，周二是否上班,0：表示未填，1:代表上班，2：代表不上班'")
    private String tuesday;

    /**
     * 礼拜制，周三是否上班,0：表示未填，1:代表上班，2：代表不上班
     */
    @Excel(name = "礼拜制，周三是否上班,0：表示未填，1:代表上班，2：代表不上班")
    private String wednesday;

    /**
     * 礼拜制，周四是否上班,0：表示未填，1:代表上班，2：代表不上班
     */
    @Excel(name = "礼拜制，周四是否上班,0：表示未填，1:代表上班，2：代表不上班")
    private String thursday;

    /**
     * 礼拜制，周五是否上班,0：表示未填，1:代表上班，2：代表不上班
     */
    @Excel(name = "礼拜制，周五是否上班,0：表示未填，1:代表上班，2：代表不上班")
    private String friday;

    /**
     * 礼拜制，周六是否上班,0：表示未填，1:代表上班，2：代表不上班
     */
    @Excel(name = "礼拜制，周六是否上班,0：表示未填，1:代表上班，2：代表不上班")
    private String saturday;

    /**
     * 礼拜制，周日是否上班,0：表示未填，1:代表上班，2：代表不上班
     */
    @Excel(name = "礼拜制，周日是否上班,0：表示未填，1:代表上班，2：代表不上班")
    private String sunday;

    /**
     * 连续制，连续工作天数
     */
    @Excel(name = "连续制，连续工作天数")
    private Integer workDayNum;

    /**
     * 连续制，休息天数
     */
    @Excel(name = "连续制，休息天数")
    private Long restDayNum;

    /**
     * 开始工作分钟数1，从凌晨开始算起
     */
    @Excel(name = "开始工作分钟数1，从凌晨开始算起")
    private Integer workStartMinute1;

    /**
     * 结束工作分钟数1，从凌晨开始算起
     */
    @Excel(name = "结束工作分钟数1，从凌晨开始算起")
    private Integer workEndMinute1;

    /**
     * 状态（默认为0）
     */
    @Excel(name = "状态", readConverterExp = "默=认为0")
    private Integer status;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserType() {
        return userType;
    }

    public void setWorkPatternType(String workPatternType) {
        this.workPatternType = workPatternType;
    }

    public String getWorkPatternType() {
        return workPatternType;
    }

    public void setMonday(String monday) {
        this.monday = monday;
    }

    public String getMonday() {
        return monday;
    }

    public void setTuesday(String tuesday) {
        this.tuesday = tuesday;
    }

    public String getTuesday() {
        return tuesday;
    }

    public void setWednesday(String wednesday) {
        this.wednesday = wednesday;
    }

    public String getWednesday() {
        return wednesday;
    }

    public void setThursday(String thursday) {
        this.thursday = thursday;
    }

    public String getThursday() {
        return thursday;
    }

    public void setFriday(String friday) {
        this.friday = friday;
    }

    public String getFriday() {
        return friday;
    }

    public void setSaturday(String saturday) {
        this.saturday = saturday;
    }

    public String getSaturday() {
        return saturday;
    }

    public void setSunday(String sunday) {
        this.sunday = sunday;
    }

    public String getSunday() {
        return sunday;
    }

    public void setWorkDayNum(Integer workDayNum) {
        this.workDayNum = workDayNum;
    }

    public Integer getWorkDayNum() {
        return workDayNum;
    }

    public void setRestDayNum(Long restDayNum) {
        this.restDayNum = restDayNum;
    }

    public Long getRestDayNum() {
        return restDayNum;
    }

    public void setWorkStartMinute1(Integer workStartMinute1) {
        this.workStartMinute1 = workStartMinute1;
    }

    public Integer getWorkStartMinute1() {
        return workStartMinute1;
    }

    public void setWorkEndMinute1(Integer workEndMinute1) {
        this.workEndMinute1 = workEndMinute1;
    }

    public Integer getWorkEndMinute1() {
        return workEndMinute1;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("name", getName())
                .append("userType", getUserType())
                .append("workPatternType", getWorkPatternType())
                .append("monday", getMonday())
                .append("tuesday", getTuesday())
                .append("wednesday", getWednesday())
                .append("thursday", getThursday())
                .append("friday", getFriday())
                .append("saturday", getSaturday())
                .append("sunday", getSunday())
                .append("workDayNum", getWorkDayNum())
                .append("restDayNum", getRestDayNum())
                .append("workStartMinute1", getWorkStartMinute1())
                .append("workEndMinute1", getWorkEndMinute1())
                .append("status", getStatus())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .toString();
    }

}
