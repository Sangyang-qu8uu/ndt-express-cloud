package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import com.ruoyi.common.security.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.NdtDriverInfoMapper;
import com.ruoyi.system.domain.NdtDriverInfo;
import com.ruoyi.system.service.INdtDriverInfoService;

/**
 * 司机基本信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2025-01-05
 */
@Service
public class NdtDriverInfoServiceImpl implements INdtDriverInfoService 
{
    @Autowired
    private NdtDriverInfoMapper ndtDriverInfoMapper;

    /**
     * 查询司机基本信息
     * 
     * @param id 司机基本信息主键
     * @return 司机基本信息
     */
    @Override
    public NdtDriverInfo selectNdtDriverInfoById(Long id)
    {
        return ndtDriverInfoMapper.selectNdtDriverInfoById(id);
    }

    /**
     * 查询司机基本信息列表
     * 
     * @param ndtDriverInfo 司机基本信息
     * @return 司机基本信息
     */
    @Override
    public List<NdtDriverInfo> selectNdtDriverInfoList(NdtDriverInfo ndtDriverInfo)
    {
        return ndtDriverInfoMapper.selectNdtDriverInfoList(ndtDriverInfo);
    }

    /**
     * 新增司机基本信息
     * 
     * @param ndtDriverInfo 司机基本信息
     * @return 结果
     */
    @Override
    public int insertNdtDriverInfo(NdtDriverInfo ndtDriverInfo)
    {
        ndtDriverInfo.setCreateTime(DateUtils.getNowDate());
        ndtDriverInfo.setCreateBy(SecurityUtils.getUsername());
        return ndtDriverInfoMapper.insertNdtDriverInfo(ndtDriverInfo);
    }

    /**
     * 修改司机基本信息
     * 
     * @param ndtDriverInfo 司机基本信息
     * @return 结果
     */
    @Override
    public int updateNdtDriverInfo(NdtDriverInfo ndtDriverInfo)
    {
        ndtDriverInfo.setUpdateTime(DateUtils.getNowDate());
        ndtDriverInfo.setUpdateBy(SecurityUtils.getUsername());
        return ndtDriverInfoMapper.updateNdtDriverInfo(ndtDriverInfo);
    }

    /**
     * 批量删除司机基本信息
     * 
     * @param ids 需要删除的司机基本信息主键
     * @return 结果
     */
    @Override
    public int deleteNdtDriverInfoByIds(Long[] ids)
    {
        return ndtDriverInfoMapper.deleteNdtDriverInfoByIds(ids);
    }

    /**
     * 删除司机基本信息信息
     * 
     * @param id 司机基本信息主键
     * @return 结果
     */
    @Override
    public int deleteNdtDriverInfoById(Long id)
    {
        return ndtDriverInfoMapper.deleteNdtDriverInfoById(id);
    }
}
