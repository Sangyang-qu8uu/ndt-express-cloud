package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import com.ruoyi.common.security.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.NdtDriverMapper;
import com.ruoyi.system.domain.NdtDriver;
import com.ruoyi.system.service.INdtDriverService;

/**
 * 司机管理Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-01-04
 */
@Service
public class NdtDriverServiceImpl implements INdtDriverService 
{
    @Autowired
    private NdtDriverMapper ndtDriverMapper;

    /**
     * 查询司机管理
     * 
     * @param id 司机管理主键
     * @return 司机管理
     */
    @Override
    public NdtDriver selectNdtDriverById(Long id)
    {
        return ndtDriverMapper.selectNdtDriverById(id);
    }

    /**
     * 查询司机管理列表
     * 
     * @param ndtDriver 司机管理
     * @return 司机管理
     */
    @Override
    public List<NdtDriver> selectNdtDriverList(NdtDriver ndtDriver)
    {
        return ndtDriverMapper.selectNdtDriverList(ndtDriver);
    }

    /**
     * 新增司机管理
     * 
     * @param ndtDriver 司机管理
     * @return 结果
     */
    @Override
    public int insertNdtDriver(NdtDriver ndtDriver)
    {
        ndtDriver.setCreateTime(DateUtils.getNowDate());
        ndtDriver.setCreateBy(SecurityUtils.getUsername());
        return ndtDriverMapper.insertNdtDriver(ndtDriver);
    }

    /**
     * 修改司机管理
     * 
     * @param ndtDriver 司机管理
     * @return 结果
     */
    @Override
    public int updateNdtDriver(NdtDriver ndtDriver)
    {
        ndtDriver.setUpdateTime(DateUtils.getNowDate());
        ndtDriver.setUpdateBy(SecurityUtils.getUsername());
        return ndtDriverMapper.updateNdtDriver(ndtDriver);
    }

    /**
     * 批量删除司机管理
     * 
     * @param ids 需要删除的司机管理主键
     * @return 结果
     */
    @Override
    public int deleteNdtDriverByIds(Long[] ids)
    {
        return ndtDriverMapper.deleteNdtDriverByIds(ids);
    }

    /**
     * 删除司机管理信息
     * 
     * @param id 司机管理主键
     * @return 结果
     */
    @Override
    public int deleteNdtDriverById(Long id)
    {
        return ndtDriverMapper.deleteNdtDriverById(id);
    }
}
