package com.ruoyi.system.service.impl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.ruoyi.common.core.utils.DateUtils;
import com.ruoyi.common.security.utils.SecurityUtils;
import com.ruoyi.system.domain.NdtDriverInfo;
import com.ruoyi.system.domain.vo.NdtDriverVo;
import com.ruoyi.system.mapper.NdtDriverInfoMapper;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.NdtDriverMapper;
import com.ruoyi.system.domain.NdtDriver;
import com.ruoyi.system.service.INdtDriverService;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

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

    @Autowired
    private NdtDriverInfoMapper ndtDriverInfoMapper;

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

    @Override
    public List<NdtDriverVo> selectNdtDriverListVo(NdtDriver ndtDriver) {
        List<NdtDriver> ndtDrivers = ndtDriverMapper.selectNdtDriverList(ndtDriver);
        return ndtDrivers.stream()
                .map(driver->{
                    NdtDriverVo vo = new NdtDriverVo();
                    vo.setId(driver.getId());
                    vo.setDriverAccount(driver.getDriverAccount());
                    vo.setPhone(driver.getPhone());
                    vo.setWorkStatus(driver.getWorkStatus());
                    vo.setCourierName(driver.getCourierName());
                    //判断是否存在基本信息
                    NdtDriverInfo ndtDriverInfo = ndtDriverInfoMapper.selectNdtDriverInfoByDriverId(driver.getId());
                    vo.setFlag(ObjectUtils.isNotEmpty(ndtDriverInfo));
                    //需要基本信息主键id
                    vo.setDriverInfoId(ObjectUtils.isEmpty(ndtDriverInfo)?null:ndtDriverInfo.getId());
                    return vo;
                }).collect(Collectors.toList());
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
    @Transactional(rollbackFor = Exception.class)
    public int deleteNdtDriverByIds(Long[] ids)
    {
        // 如果删除司机，把司机相关的证件信息一并删除
        Long[] longs = ndtDriverInfoMapper.selectNdtDriverInfoByIds(Arrays.asList(ids)).stream()
                .map(NdtDriverInfo::getDriverId).toArray(Long[]::new);
        if (ObjectUtils.isNotEmpty(longs)){
            ndtDriverInfoMapper.deleteNdtDriverInfoByIds(longs);
        }
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
