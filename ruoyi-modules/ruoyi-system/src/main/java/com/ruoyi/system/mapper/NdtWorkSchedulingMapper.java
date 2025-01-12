package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.NdtWorkScheduling;

/**
 * 排班管理Mapper接口
 *
 * @author ruoyi
 * @date 2025-01-12
 */
public interface NdtWorkSchedulingMapper
{
    /**
     * 查询排班管理
     *
     * @param id 排班管理主键
     * @return 排班管理
     */
    public NdtWorkScheduling selectNdtWorkSchedulingById(Long id);

    /**
     * 查询排班管理列表
     *
     * @param ndtWorkScheduling 排班管理
     * @return 排班管理集合
     */
    public List<NdtWorkScheduling> selectNdtWorkSchedulingList(NdtWorkScheduling ndtWorkScheduling);

    /**
     * 新增排班管理
     *
     * @param ndtWorkScheduling 排班管理
     * @return 结果
     */
    public int insertNdtWorkScheduling(NdtWorkScheduling ndtWorkScheduling);

    /**
     * 修改排班管理
     *
     * @param ndtWorkScheduling 排班管理
     * @return 结果
     */
    public int updateNdtWorkScheduling(NdtWorkScheduling ndtWorkScheduling);

    /**
     * 删除排班管理
     *
     * @param id 排班管理主键
     * @return 结果
     */
    public int deleteNdtWorkSchedulingById(Long id);

    /**
     * 批量删除排班管理
     *
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNdtWorkSchedulingByIds(Long[] ids);

    // 批量插入方法
    int batchInsert(List<NdtWorkScheduling> list);
}
