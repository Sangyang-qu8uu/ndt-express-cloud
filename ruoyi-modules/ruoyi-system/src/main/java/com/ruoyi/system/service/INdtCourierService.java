package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.NdtCourier;

/**
 * 快递员Service接口
 * 
 * @author ruoyi
 * @date 2025-01-02
 */
public interface INdtCourierService 
{
    /**
     * 查询快递员
     * 
     * @param id 快递员主键
     * @return 快递员
     */
    public NdtCourier selectNdtCourierById(Long id);

    /**
     * 查询快递员列表
     * 
     * @param ndtCourier 快递员
     * @return 快递员集合
     */
    public List<NdtCourier> selectNdtCourierList(NdtCourier ndtCourier);

    /**
     * 新增快递员
     * 
     * @param ndtCourier 快递员
     * @return 结果
     */
    public int insertNdtCourier(NdtCourier ndtCourier);

    /**
     * 修改快递员
     * 
     * @param ndtCourier 快递员
     * @return 结果
     */
    public int updateNdtCourier(NdtCourier ndtCourier);

    /**
     * 批量删除快递员
     * 
     * @param ids 需要删除的快递员主键集合
     * @return 结果
     */
    public int deleteNdtCourierByIds(Long[] ids);

    /**
     * 删除快递员信息
     * 
     * @param id 快递员主键
     * @return 结果
     */
    public int deleteNdtCourierById(Long id);
}
