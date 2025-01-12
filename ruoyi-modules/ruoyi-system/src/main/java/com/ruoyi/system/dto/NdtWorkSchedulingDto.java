package com.ruoyi.system.dto;

import com.ruoyi.system.domain.NdtCourier;
import com.ruoyi.system.domain.NdtDriver;

import java.util.List;

/**
 * @Description
 * @Author SangY
 * @Date 2025/1/12 23:16
 **/
public class NdtWorkSchedulingDto {

    private List<NdtCourier> courierList;

    private List<NdtDriver>driverList;

    public List<NdtCourier> getCourierList() {
        return courierList;
    }

    public void setCourierList(List<NdtCourier> courierList) {
        this.courierList = courierList;
    }

    public List<NdtDriver> getDriverList() {
        return driverList;
    }

    public void setDriverList(List<NdtDriver> driverList) {
        this.driverList = driverList;
    }

    @Override
    public String toString() {
        return "NdtWorkSchedulingDto{" +
                "courierList=" + courierList +
                ", driverList=" + driverList +
                '}';
    }
}
