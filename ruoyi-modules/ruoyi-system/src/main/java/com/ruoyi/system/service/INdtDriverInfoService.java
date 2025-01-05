package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.NdtDriverInfo;

/**
 * 司机基本信息Service接口
 * 
 * @author ruoyi
 * @date 2025-01-05
 */
public interface INdtDriverInfoService 
{
    /**
     * 查询司机基本信息
     * 
     * @param id 司机基本信息主键
     * @return 司机基本信息
     */
    public NdtDriverInfo selectNdtDriverInfoById(Long id);

    /**
     * 查询司机基本信息列表
     * 
     * @param ndtDriverInfo 司机基本信息
     * @return 司机基本信息集合
     */
    public List<NdtDriverInfo> selectNdtDriverInfoList(NdtDriverInfo ndtDriverInfo);

    /**
     * 新增司机基本信息
     * 
     * @param ndtDriverInfo 司机基本信息
     * @return 结果
     */
    public int insertNdtDriverInfo(NdtDriverInfo ndtDriverInfo);

    /**
     * 修改司机基本信息
     * 
     * @param ndtDriverInfo 司机基本信息
     * @return 结果
     */
    public int updateNdtDriverInfo(NdtDriverInfo ndtDriverInfo);

    /**
     * 批量删除司机基本信息
     * 
     * @param ids 需要删除的司机基本信息主键集合
     * @return 结果
     */
    public int deleteNdtDriverInfoByIds(Long[] ids);

    /**
     * 删除司机基本信息信息
     * 
     * @param id 司机基本信息主键
     * @return 结果
     */
    public int deleteNdtDriverInfoById(Long id);
}
