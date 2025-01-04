package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.NdtTruck;

/**
 * 车辆管理Mapper接口
 * 
 * @author ruoyi
 * @date 2025-01-04
 */
public interface NdtTruckMapper 
{
    /**
     * 查询车辆管理
     * 
     * @param id 车辆管理主键
     * @return 车辆管理
     */
    public NdtTruck selectNdtTruckById(Long id);

    /**
     * 查询车辆管理列表
     * 
     * @param ndtTruck 车辆管理
     * @return 车辆管理集合
     */
    public List<NdtTruck> selectNdtTruckList(NdtTruck ndtTruck);

    /**
     * 新增车辆管理
     * 
     * @param ndtTruck 车辆管理
     * @return 结果
     */
    public int insertNdtTruck(NdtTruck ndtTruck);

    /**
     * 修改车辆管理
     * 
     * @param ndtTruck 车辆管理
     * @return 结果
     */
    public int updateNdtTruck(NdtTruck ndtTruck);

    /**
     * 删除车辆管理
     * 
     * @param id 车辆管理主键
     * @return 结果
     */
    public int deleteNdtTruckById(Long id);

    /**
     * 批量删除车辆管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNdtTruckByIds(Long[] ids);
}
