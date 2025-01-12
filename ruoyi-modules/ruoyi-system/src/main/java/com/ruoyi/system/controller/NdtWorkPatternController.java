package com.ruoyi.system.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.system.domain.vo.NdtWorkPatternVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.ruoyi.system.domain.NdtWorkPattern;
import com.ruoyi.system.service.INdtWorkPatternService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 工作模式Controller
 *
 * @author ruoyi
 * @date 2025-01-08
 */
@RestController
@RequestMapping("/pattern")
public class NdtWorkPatternController extends BaseController
{
    @Autowired
    private INdtWorkPatternService ndtWorkPatternService;

    /**
     * 查询工作模式列表
     */
    @RequiresPermissions("system:pattern:list")
    @GetMapping("/list")
    public TableDataInfo list(NdtWorkPattern ndtWorkPattern)
    {
        startPage();
        List<NdtWorkPatternVo> list = ndtWorkPatternService.selectNdtWorkPatternListVo(ndtWorkPattern);
        return getDataTable(list);
    }

    /**
     * 导出工作模式列表
     */
    @RequiresPermissions("system:pattern:export")
    @Log(title = "工作模式", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NdtWorkPattern ndtWorkPattern)
    {
        List<NdtWorkPattern> list = ndtWorkPatternService.selectNdtWorkPatternList(ndtWorkPattern);
        ExcelUtil<NdtWorkPattern> util = new ExcelUtil<NdtWorkPattern>(NdtWorkPattern.class);
        util.exportExcel(response, list, "工作模式数据");
    }

    /**
     * 获取工作模式详细信息
     */
    @RequiresPermissions("system:pattern:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(ndtWorkPatternService.selectNdtWorkPatternById(id));
    }

    /**
     * 新增工作模式
     */
    @RequiresPermissions("system:pattern:add")
    @Log(title = "工作模式", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NdtWorkPattern ndtWorkPattern)
    {
        return toAjax(ndtWorkPatternService.insertNdtWorkPattern(ndtWorkPattern));
    }

    /**
     * 修改工作模式
     */
    @RequiresPermissions("system:pattern:edit")
    @Log(title = "工作模式", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NdtWorkPattern ndtWorkPattern)
    {
        return toAjax(ndtWorkPatternService.updateNdtWorkPattern(ndtWorkPattern));
    }

    /**
     * 删除工作模式
     */
    @RequiresPermissions("system:pattern:remove")
    @Log(title = "工作模式", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(ndtWorkPatternService.deleteNdtWorkPatternByIds(ids));
    }

    /**
     * 工作模式列表查询
     * @return
     */
    @GetMapping("all")
    public AjaxResult all() {
        return success(ndtWorkPatternService.all());
    }
}
