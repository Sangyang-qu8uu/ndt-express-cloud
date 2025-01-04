package com.ruoyi.system.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.ruoyi.common.core.utils.DateUtils;
import com.ruoyi.common.core.utils.SnowflakeUtils;
import com.ruoyi.common.security.utils.SecurityUtils;
import com.ruoyi.system.domain.vo.NdtTruckTypeCheckVo;
import com.ruoyi.system.domain.vo.NdtTruckTypeVo;
import com.ruoyi.system.mapper.NdtTruckMapper;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.NdtTruckTypeMapper;
import com.ruoyi.system.domain.NdtTruckType;
import com.ruoyi.system.service.INdtTruckTypeService;

/**
 * 车型管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-01-04
 */
@Service
public class NdtTruckTypeServiceImpl implements INdtTruckTypeService 
{
    @Autowired
    private NdtTruckTypeMapper ndtTruckTypeMapper;

    @Autowired
    private NdtTruckMapper ndtTruckMapper;
    /**
     * 查询车型管理
     * 
     * @param id 车型管理主键
     * @return 车型管理
     */
    @Override
    public NdtTruckType selectNdtTruckTypeById(Long id)
    {
        return ndtTruckTypeMapper.selectNdtTruckTypeById(id);
    }

    @Override
    public List<NdtTruckType> selectNdtTruckTypeList(NdtTruckType ndtTruckType) {
        return ndtTruckTypeMapper.selectNdtTruckTypeList(ndtTruckType);
    }

    /**
     * 查询车型管理列表
     * 
     * @param ndtTruckType 车型管理
     * @return 车型管理
     */
    @Override
    public List<NdtTruckTypeVo> selectNdtTruckTypeListVo(NdtTruckType ndtTruckType)
    {
        //查询车型数量
        List<NdtTruckType> ndtTruckTypes = ndtTruckTypeMapper.selectNdtTruckTypeList(ndtTruckType);

        return ndtTruckTypes.stream()
                .map(truckType -> {
                    NdtTruckTypeVo vo = new NdtTruckTypeVo();
                    vo.setName(truckType.getName());
                    vo.setId(vo.getId());
                    vo.setAllowableLoad(truckType.getAllowableLoad());
                    vo.setAllowableVolume(truckType.getAllowableVolume());
                    vo.setMeasureHigh(truckType.getMeasureHigh());
                    vo.setMeasureWidth(truckType.getMeasureWidth());
                    vo.setMeasureLong(truckType.getMeasureLong());

                    // 根据需要复制其他属性
                    return vo;
                }).collect(Collectors.toList());
    }

    /**
     * 新增车型管理
     * 
     * @param ndtTruckType 车型管理
     * @return 结果
     */
    @Override
    public int insertNdtTruckType(NdtTruckType ndtTruckType)
    {
        ndtTruckType.setCreateTime(DateUtils.getNowDate());
        ndtTruckType.setCreateBy(SecurityUtils.getUsername());
        ndtTruckType.setId(SnowflakeUtils.nextId());
        //车型类型不能重复
        NdtTruckType truckType = ndtTruckTypeMapper.selectNdtTruckTypeByName(ndtTruckType.getName());
        if (ObjectUtils.isNotEmpty(truckType)){
            throw new ClassCastException("车型类型不能重复!");
        }
        return ndtTruckTypeMapper.insertNdtTruckType(ndtTruckType);
    }

    /**
     * 修改车型管理
     * 
     * @param ndtTruckType 车型管理
     * @return 结果
     */
    @Override
    public int updateNdtTruckType(NdtTruckType ndtTruckType)
    {
        ndtTruckType.setUpdateTime(DateUtils.getNowDate());
        ndtTruckType.setCreateBy(SecurityUtils.getUsername());
        return ndtTruckTypeMapper.updateNdtTruckType(ndtTruckType);
    }

    /**
     * 批量删除车型管理
     * 
     * @param ids 需要删除的车型管理主键
     * @return 结果
     */
    @Override
    public int deleteNdtTruckTypeByIds(Long[] ids)
    {
        return ndtTruckTypeMapper.deleteNdtTruckTypeByIds(ids);
    }

    /**
     * 删除车型管理信息
     * 
     * @param id 车型管理主键
     * @return 结果
     */
    @Override
    public int deleteNdtTruckTypeById(Long id)
    {
        return ndtTruckTypeMapper.deleteNdtTruckTypeById(id);
    }

    @Override
    public List<NdtTruckTypeCheckVo> listCheck() {
        return ndtTruckTypeMapper.listCheck();
    }
}
