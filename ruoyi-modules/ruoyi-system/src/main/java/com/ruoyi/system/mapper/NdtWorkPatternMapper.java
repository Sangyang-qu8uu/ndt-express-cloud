package com.ruoyi.system.mapper;

import java.util.List;
import com.ruoyi.system.domain.NdtWorkPattern;

/**
 * 工作模式Mapper接口
 * 
 * @author ruoyi
 * @date 2025-01-08
 */
public interface NdtWorkPatternMapper 
{
    /**
     * 查询工作模式
     * 
     * @param id 工作模式主键
     * @return 工作模式
     */
    public NdtWorkPattern selectNdtWorkPatternById(Long id);

    /**
     * 查询工作模式列表
     * 
     * @param ndtWorkPattern 工作模式
     * @return 工作模式集合
     */
    public List<NdtWorkPattern> selectNdtWorkPatternList(NdtWorkPattern ndtWorkPattern);

    /**
     * 新增工作模式
     * 
     * @param ndtWorkPattern 工作模式
     * @return 结果
     */
    public int insertNdtWorkPattern(NdtWorkPattern ndtWorkPattern);

    /**
     * 修改工作模式
     * 
     * @param ndtWorkPattern 工作模式
     * @return 结果
     */
    public int updateNdtWorkPattern(NdtWorkPattern ndtWorkPattern);

    /**
     * 删除工作模式
     * 
     * @param id 工作模式主键
     * @return 结果
     */
    public int deleteNdtWorkPatternById(Long id);

    /**
     * 批量删除工作模式
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteNdtWorkPatternByIds(Long[] ids);
}
