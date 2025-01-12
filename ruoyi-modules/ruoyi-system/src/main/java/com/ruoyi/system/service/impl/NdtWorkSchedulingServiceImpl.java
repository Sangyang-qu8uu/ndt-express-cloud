package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import com.ruoyi.common.security.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.NdtWorkSchedulingMapper;
import com.ruoyi.system.domain.NdtWorkScheduling;
import com.ruoyi.system.service.INdtWorkSchedulingService;

/**
 * 排班管理Service业务层处理
 *
 * @author ruoyi
 * @date 2025-01-12
 */
@Service
public class NdtWorkSchedulingServiceImpl implements INdtWorkSchedulingService
{
    @Autowired
    private NdtWorkSchedulingMapper ndtWorkSchedulingMapper;

    /**
     * 查询排班管理
     *
     * @param id 排班管理主键
     * @return 排班管理
     */
    @Override
    public NdtWorkScheduling selectNdtWorkSchedulingById(Long id)
    {
        return ndtWorkSchedulingMapper.selectNdtWorkSchedulingById(id);
    }

    /**
     * 查询排班管理列表
     *
     * @param ndtWorkScheduling 排班管理
     * @return 排班管理
     */
    @Override
    public List<NdtWorkScheduling> selectNdtWorkSchedulingList(NdtWorkScheduling ndtWorkScheduling)
    {
        return ndtWorkSchedulingMapper.selectNdtWorkSchedulingList(ndtWorkScheduling);
    }

    /**
     * 新增排班管理
     *
     * @param ndtWorkScheduling 排班管理
     * @return 结果
     */
    @Override
    public int insertNdtWorkScheduling(NdtWorkScheduling ndtWorkScheduling)
    {
        ndtWorkScheduling.setCreateTime(DateUtils.getNowDate());
        ndtWorkScheduling.setCreateBy(SecurityUtils.getUsername());
        return ndtWorkSchedulingMapper.insertNdtWorkScheduling(ndtWorkScheduling);
    }

    /**
     * 修改排班管理
     *
     * @param ndtWorkScheduling 排班管理
     * @return 结果
     */
    @Override
    public int updateNdtWorkScheduling(NdtWorkScheduling ndtWorkScheduling)
    {
        ndtWorkScheduling.setUpdateTime(DateUtils.getNowDate());
        ndtWorkScheduling.setUpdateBy(SecurityUtils.getUsername());
        return ndtWorkSchedulingMapper.updateNdtWorkScheduling(ndtWorkScheduling);
    }

    /**
     * 批量删除排班管理
     *
     * @param ids 需要删除的排班管理主键
     * @return 结果
     */
    @Override
    public int deleteNdtWorkSchedulingByIds(Long[] ids)
    {
        return ndtWorkSchedulingMapper.deleteNdtWorkSchedulingByIds(ids);
    }

    /**
     * 删除排班管理信息
     *
     * @param id 排班管理主键
     * @return 结果
     */
    @Override
    public int deleteNdtWorkSchedulingById(Long id)
    {
        return ndtWorkSchedulingMapper.deleteNdtWorkSchedulingById(id);
    }
}
