package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.NdtDriver;
import com.ruoyi.system.domain.vo.NdtDriverVo;

/**
 * 司机管理Service接口
 * 
 * @author ruoyi
 * @date 2025-01-04
 */
public interface INdtDriverService 
{
    /**
     * 查询司机管理
     * 
     * @param id 司机管理主键
     * @return 司机管理
     */
    public NdtDriver selectNdtDriverById(Long id);

    /**
     * 查询司机管理列表
     * 
     * @param ndtDriver 司机管理
     * @return 司机管理集合
     */
    public List<NdtDriver> selectNdtDriverList(NdtDriver ndtDriver);


    /**
     * 查询司机管理列表
     *
     * @param ndtDriver 司机管理
     * @return 司机管理集合
     */
    public List<NdtDriverVo> selectNdtDriverListVo(NdtDriver ndtDriver);

    /**
     * 新增司机管理
     * 
     * @param ndtDriver 司机管理
     * @return 结果
     */
    public int insertNdtDriver(NdtDriver ndtDriver);

    /**
     * 修改司机管理
     * 
     * @param ndtDriver 司机管理
     * @return 结果
     */
    public int updateNdtDriver(NdtDriver ndtDriver);

    /**
     * 批量删除司机管理
     * 
     * @param ids 需要删除的司机管理主键集合
     * @return 结果
     */
    public int deleteNdtDriverByIds(Long[] ids);

    /**
     * 删除司机管理信息
     * 
     * @param id 司机管理主键
     * @return 结果
     */
    public int deleteNdtDriverById(Long id);
}
