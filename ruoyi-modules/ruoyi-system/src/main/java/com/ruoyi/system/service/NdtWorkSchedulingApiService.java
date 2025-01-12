package com.ruoyi.system.service;

import com.ruoyi.system.dto.NdtWorkSchedulingDto;

/**
 * @Description
 * @Author SangY
 * @Date 2025/1/12 23:08
 **/
public interface NdtWorkSchedulingApiService {
    /**
     * 查询所有司机和快递员
     * @return
     */
    public NdtWorkSchedulingDto findAllPeople();

    /**
     * 初始化排班数据表
     */
    public int initWorkScheduling();
}
