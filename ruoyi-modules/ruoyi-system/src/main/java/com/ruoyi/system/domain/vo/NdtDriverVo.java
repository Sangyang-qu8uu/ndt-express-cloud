package com.ruoyi.system.domain.vo;


/**
 * @Description
 * @Author SangY
 * @Date 2025/1/5 20:38
 **/
public class NdtDriverVo {
    /** id */
    private Long id;

    /** 司机账号 */
    private String driverAccount;

    /** 司机电话 */
    private String phone;

    /** 司机名字 */
    private String courierName;

    /** 工作状态 */
    private Integer workStatus;

    /**
     * 是否配置了基本证件信息
     */
    private Boolean flag;

    /**
     * 基本维护信息主键id
     */
    private Long driverInfoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDriverAccount() {
        return driverAccount;
    }

    public void setDriverAccount(String driverAccount) {
        this.driverAccount = driverAccount;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCourierName() {
        return courierName;
    }

    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }

    public Integer getWorkStatus() {
        return workStatus;
    }

    public void setWorkStatus(Integer workStatus) {
        this.workStatus = workStatus;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }


    public Long getDriverInfoId() {
        return driverInfoId;
    }

    public void setDriverInfoId(Long driverInfoId) {
        this.driverInfoId = driverInfoId;
    }

    @Override
    public String toString() {
        return "NdtDriverVo{" +
                "id=" + id +
                ", driverAccount='" + driverAccount + '\'' +
                ", phone='" + phone + '\'' +
                ", courierName='" + courierName + '\'' +
                ", workStatus=" + workStatus +
                ", flag=" + flag +
                ", driverInfoId=" + driverInfoId +
                '}';
    }
}
