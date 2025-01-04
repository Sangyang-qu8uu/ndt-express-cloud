package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import com.ruoyi.common.security.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.NdtCourierMapper;
import com.ruoyi.system.domain.NdtCourier;
import com.ruoyi.system.service.INdtCourierService;

/**
 * 快递员Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-01-02
 */
@Service
public class NdtCourierServiceImpl implements INdtCourierService 
{
    @Autowired
    private NdtCourierMapper ndtCourierMapper;

    /**
     * 查询快递员
     * 
     * @param id 快递员主键
     * @return 快递员
     */
    @Override
    public NdtCourier selectNdtCourierById(Long id)
    {
        return ndtCourierMapper.selectNdtCourierById(id);
    }

    /**
     * 查询快递员列表
     * 
     * @param ndtCourier 快递员
     * @return 快递员
     */
    @Override
    public List<NdtCourier> selectNdtCourierList(NdtCourier ndtCourier)
    {
        return ndtCourierMapper.selectNdtCourierList(ndtCourier);
    }

    /**
     * 新增快递员
     * 
     * @param ndtCourier 快递员
     * @return 结果
     */
    @Override
    public int insertNdtCourier(NdtCourier ndtCourier)
    {
        ndtCourier.setCreateTime(DateUtils.getNowDate());
        ndtCourier.setCreateBy(SecurityUtils.getUsername());
        return ndtCourierMapper.insertNdtCourier(ndtCourier);
    }

    /**
     * 修改快递员
     * 
     * @param ndtCourier 快递员
     * @return 结果
     */
    @Override
    public int updateNdtCourier(NdtCourier ndtCourier)
    {
        ndtCourier.setUpdateTime(DateUtils.getNowDate());
        ndtCourier.setUpdateBy(SecurityUtils.getUsername());
        return ndtCourierMapper.updateNdtCourier(ndtCourier);
    }

    /**
     * 批量删除快递员
     * 
     * @param ids 需要删除的快递员主键
     * @return 结果
     */
    @Override
    public int deleteNdtCourierByIds(Long[] ids)
    {
        return ndtCourierMapper.deleteNdtCourierByIds(ids);
    }

    /**
     * 删除快递员信息
     * 
     * @param id 快递员主键
     * @return 结果
     */
    @Override
    public int deleteNdtCourierById(Long id)
    {
        return ndtCourierMapper.deleteNdtCourierById(id);
    }
}
