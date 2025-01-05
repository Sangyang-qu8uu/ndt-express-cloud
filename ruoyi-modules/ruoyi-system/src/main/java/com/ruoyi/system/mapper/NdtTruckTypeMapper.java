package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.NdtTruckType;
import com.ruoyi.system.domain.vo.NdtTruckTypeCheckVo;

/**
 * 车型管理Mapper接口
 * 
 * @author ruoyi
 * @date 2025-01-04
 */
public interface NdtTruckTypeMapper 
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
     * 删除车型管理
     * 
     * @param id 车型管理主键
     * @return 结果
     */
    public int deleteNdtTruckTypeById(Long id);

    /**
     * 批量删除车型管理
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNdtTruckTypeByIds(Long[] ids);


    /**
     * 通过车型类型查询
     *
     * @param name the name
     * @return the ndt truck type
     */
    public NdtTruckType selectNdtTruckTypeByName(String name);


    /**
     * 查询车辆类型下拉
     *
     * @return the list
     */
    List<NdtTruckTypeCheckVo> listCheck();
}
