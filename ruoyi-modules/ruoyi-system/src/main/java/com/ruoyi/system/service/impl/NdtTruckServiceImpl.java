package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import com.ruoyi.common.security.utils.SecurityUtils;
import com.ruoyi.system.domain.NdtTruckType;
import com.ruoyi.system.mapper.NdtTruckTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.NdtTruckMapper;
import com.ruoyi.system.domain.NdtTruck;
import com.ruoyi.system.service.INdtTruckService;

/**
 * 车辆管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-01-04
 */
@Service
public class NdtTruckServiceImpl implements INdtTruckService 
{
    @Autowired
    private NdtTruckMapper ndtTruckMapper;

    @Autowired
    private NdtTruckTypeMapper ndtTruckTypeMapper;

    /**
     * 查询车辆管理
     * 
     * @param id 车辆管理主键
     * @return 车辆管理
     */
    @Override
    public NdtTruck selectNdtTruckById(Long id)
    {
        return ndtTruckMapper.selectNdtTruckById(id);
    }

    /**
     * 查询车辆管理列表
     * 
     * @param ndtTruck 车辆管理
     * @return 车辆管理
     */
    @Override
    public List<NdtTruck> selectNdtTruckList(NdtTruck ndtTruck)
    {
        return ndtTruckMapper.selectNdtTruckList(ndtTruck);
    }

    /**
     * 新增车辆管理
     * 
     * @param ndtTruck 车辆管理
     * @return 结果
     */
    @Override
    public int insertNdtTruck(NdtTruck ndtTruck)
    {
        ndtTruck.setCreateTime(DateUtils.getNowDate());
        ndtTruck.setCreateBy(SecurityUtils.getUsername());
        //查询关联的车辆类型准载重量和准载体积
        NdtTruckType ndtTruckType = ndtTruckTypeMapper.selectNdtTruckTypeById(ndtTruck.getTruckTypeId());
        ndtTruck.setAllowableLoad(ndtTruckType.getAllowableLoad());
        ndtTruck.setAllowableVolume(ndtTruckType.getAllowableVolume());
        return ndtTruckMapper.insertNdtTruck(ndtTruck);
    }

    /**
     * 修改车辆管理
     * 
     * @param ndtTruck 车辆管理
     * @return 结果
     */
    @Override
    public int updateNdtTruck(NdtTruck ndtTruck)
    {
        ndtTruck.setUpdateTime(DateUtils.getNowDate());
        ndtTruck.setUpdateBy(SecurityUtils.getUsername());
        return ndtTruckMapper.updateNdtTruck(ndtTruck);
    }

    /**
     * 批量删除车辆管理
     * 
     * @param ids 需要删除的车辆管理主键
     * @return 结果
     */
    @Override
    public int deleteNdtTruckByIds(Long[] ids)
    {
        return ndtTruckMapper.deleteNdtTruckByIds(ids);
    }

    /**
     * 删除车辆管理信息
     * 
     * @param id 车辆管理主键
     * @return 结果
     */
    @Override
    public int deleteNdtTruckById(Long id)
    {
        return ndtTruckMapper.deleteNdtTruckById(id);
    }
}
