package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.NdtTruckType;
import com.ruoyi.system.domain.vo.NdtTruckTypeCheckVo;
import com.ruoyi.system.domain.vo.NdtTruckTypeVo;

/**
 * 车型管理Service接口
 * 
 * @author ruoyi
 * @date 2025-01-04
 */
public interface INdtTruckTypeService 
{
    /**
     * 查询车型管理
     * 
     * @param id 车型管理主键
     * @return 车型管理
     */
    public NdtTruckType selectNdtTruckTypeById(Long id);

    /**
     * 查询车型管理列表
     *
     * @param ndtTruckType 车型管理
     * @return 车型管理集合
     */
    public List<NdtTruckType> selectNdtTruckTypeList(NdtTruckType ndtTruckType);
    /**
     * 查询车型管理列表
     * 
     * @param ndtTruckType 车型管理
     * @return 车型管理集合
     */
    public List<NdtTruckTypeVo> selectNdtTruckTypeListVo(NdtTruckType ndtTruckType);

    /**
     * 新增车型管理
     * 
     * @param ndtTruckType 车型管理
     * @return 结果
     */
    public int insertNdtTruckType(NdtTruckType ndtTruckType);

    /**
     * 修改车型管理
     * 
     * @param ndtTruckType 车型管理
     * @return 结果
     */
    public int updateNdtTruckType(NdtTruckType ndtTruckType);

    /**
     * 批量删除车型管理
     * 
     * @param ids 需要删除的车型管理主键集合
     * @return 结果
     */
    public int deleteNdtTruckTypeByIds(Long[] ids);

    /**
     * 删除车型管理信息
     * 
     * @param id 车型管理主键
     * @return 结果
     */
    public int deleteNdtTruckTypeById(Long id);


    /**
     * 车辆类型下拉选择
     *
     * @return the ndt truck type
     */
    public List<NdtTruckTypeCheckVo> listCheck();
}
