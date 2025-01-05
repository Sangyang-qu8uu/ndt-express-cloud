package com.ruoyi.system.domain.vo;


/**
 * @Description
 * @Author SangY
 * @Date 2025/1/4 19:58
 **/
public class NdtTruckVo {
    /** id */
    private Long id;

    /** 车型id主键 */
    private Long truckTypeId;

    /** 车辆类型名称 */
    private String truckTypeName;

    /** 车牌号码 */
    private String licensePlate;

    /** 司机数量 */
    private Long driverNum=0L;

    /** 关联司机 */
    private String driverName;

    /** GPS设备id */
    private Long deviceGpsId;

    /** 准载重量 */
    private String allowableLoad;

    /** 准载体积 */
    private String allowableVolume;

    /** 车辆状态 */
    private Integer status;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTruckTypeId() {
        return truckTypeId;
    }

    public void setTruckTypeId(Long truckTypeId) {
        this.truckTypeId = truckTypeId;
    }

    public String getTruckTypeName() {
        return truckTypeName;
    }

    public void setTruckTypeName(String truckTypeName) {
        this.truckTypeName = truckTypeName;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Long getDriverNum() {
        return driverNum;
    }

    public void setDriverNum(Long driverNum) {
        this.driverNum = driverNum;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public Long getDeviceGpsId() {
        return deviceGpsId;
    }

    public void setDeviceGpsId(Long deviceGpsId) {
        this.deviceGpsId = deviceGpsId;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "NdtTruckVo{" +
                "id=" + id +
                ", truckTypeId=" + truckTypeId +
                ", truckTypeName='" + truckTypeName + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", driverNum=" + driverNum +
                ", driverName='" + driverName + '\'' +
                ", deviceGpsId=" + deviceGpsId +
                ", allowableLoad='" + allowableLoad + '\'' +
                ", allowableVolume='" + allowableVolume + '\'' +
                ", status=" + status +
                '}';
    }
}
