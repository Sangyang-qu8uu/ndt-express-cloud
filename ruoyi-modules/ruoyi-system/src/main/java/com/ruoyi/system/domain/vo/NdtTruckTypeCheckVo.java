package com.ruoyi.system.domain.vo;

import java.io.Serializable;

/**
 * @Description
 * @Author SangY
 * @Date 2025/1/4 16:49
 **/
public class NdtTruckTypeCheckVo implements Serializable {

    private String id;

    private String name;

    public NdtTruckTypeCheckVo(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public NdtTruckTypeCheckVo() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "NdtTruckTypeVo{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
