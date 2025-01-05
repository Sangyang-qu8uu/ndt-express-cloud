package com.ruoyi.system.mapper;

import java.util.List;

import com.ruoyi.system.domain.NdtDriver;
import com.ruoyi.system.domain.NdtDriverInfo;
import org.apache.ibatis.annotations.Param;

/**
 * 司机基本信息Mapper接口
 * 
 * @author ruoyi
 * @date 2025-01-05
 */
public interface NdtDriverInfoMapper 
{
    // 根据ID集合查询 NdtDriver
    List<NdtDriverInfo> selectNdtDriverInfoByIds(@Param("ids") List<Long> ids);

    /**
     * 查询司机基本信息
     *
     * @param driverId 司机主表主键
     * @return 司机基本信息
     */
    public NdtDriverInfo selectNdtDriverInfoByDriverId(Long driverId);
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
     * 删除司机基本信息
     * 
     * @param id 司机基本信息主键
     * @return 结果
     */
    public int deleteNdtDriverInfoById(Long id);

    /**
     * 批量删除司机基本信息
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNdtDriverInfoByIds(Long[] ids);
}
