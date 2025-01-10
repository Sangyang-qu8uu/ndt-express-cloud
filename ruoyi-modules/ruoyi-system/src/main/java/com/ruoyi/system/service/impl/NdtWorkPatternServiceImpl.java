package com.ruoyi.system.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.ruoyi.common.core.utils.DateUtils;
import com.ruoyi.common.security.utils.SecurityUtils;
import com.ruoyi.system.domain.vo.NdtWorkPatternVo;
import com.ruoyi.system.utils.WorkPatternUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.NdtWorkPatternMapper;
import com.ruoyi.system.domain.NdtWorkPattern;
import com.ruoyi.system.service.INdtWorkPatternService;

/**
 * 工作模式Service业务层处理
 *
 * @author ruoyi
 * @date 2025-01-08
 */
@Service
public class NdtWorkPatternServiceImpl implements INdtWorkPatternService
{
    @Autowired
    private NdtWorkPatternMapper ndtWorkPatternMapper;

    /**
     * 查询工作模式
     *
     * @param id 工作模式主键
     * @return 工作模式
     */
    @Override
    public NdtWorkPattern selectNdtWorkPatternById(Long id)
    {
        return ndtWorkPatternMapper.selectNdtWorkPatternById(id);
    }

    /**
     * 查询工作模式列表
     *
     * @param ndtWorkPattern 工作模式
     * @return 工作模式
     */
    @Override
    public List<NdtWorkPattern> selectNdtWorkPatternList(NdtWorkPattern ndtWorkPattern)
    {
        return ndtWorkPatternMapper.selectNdtWorkPatternList(ndtWorkPattern);
    }

    @Override
    public List<NdtWorkPatternVo> selectNdtWorkPatternListVo(NdtWorkPattern ndtWorkPattern) {
        return ndtWorkPatternMapper.selectNdtWorkPatternList(ndtWorkPattern).stream()
                .map(item->{
                    NdtWorkPatternVo ndtWorkPatternVo = new NdtWorkPatternVo();
                    ndtWorkPatternVo.setWorkDate(WorkPatternUtils.toWorkDate(item));
                    ndtWorkPatternVo.setId(item.getId());
                    ndtWorkPatternVo.setName(item.getName());
                    ndtWorkPatternVo.setWorkPatternType(item.getWorkPatternType());
                    ndtWorkPatternVo.setWorkEndMinute1(item.getWorkEndMinute1());
                    ndtWorkPatternVo.setWorkStartMinute1(item.getWorkStartMinute1());
                    return ndtWorkPatternVo;
                }).collect(Collectors.toList());
    }

    /**
     * 新增工作模式
     *
     * @param ndtWorkPattern 工作模式
     * @return 结果
     */
    @Override
    public int insertNdtWorkPattern(NdtWorkPattern ndtWorkPattern)
    {
        ndtWorkPattern.setCreateTime(DateUtils.getNowDate());
        ndtWorkPattern.setCreateBy(SecurityUtils.getUsername());
        return ndtWorkPatternMapper.insertNdtWorkPattern(ndtWorkPattern);
    }

    /**
     * 修改工作模式
     *
     * @param ndtWorkPattern 工作模式
     * @return 结果
     */
    @Override
    public int updateNdtWorkPattern(NdtWorkPattern ndtWorkPattern)
    {
        ndtWorkPattern.setUpdateTime(DateUtils.getNowDate());
        ndtWorkPattern.setUpdateBy(SecurityUtils.getUsername());
        return ndtWorkPatternMapper.updateNdtWorkPattern(ndtWorkPattern);
    }

    /**
     * 批量删除工作模式
     *
     * @param ids 需要删除的工作模式主键
     * @return 结果
     */
    @Override
    public int deleteNdtWorkPatternByIds(Long[] ids)
    {
        return ndtWorkPatternMapper.deleteNdtWorkPatternByIds(ids);
    }

    /**
     * 删除工作模式信息
     *
     * @param id 工作模式主键
     * @return 结果
     */
    @Override
    public int deleteNdtWorkPatternById(Long id)
    {
        return ndtWorkPatternMapper.deleteNdtWorkPatternById(id);
    }
}
