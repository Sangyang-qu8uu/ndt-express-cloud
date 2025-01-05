package com.ruoyi.system.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.system.domain.vo.NdtDriverVo;
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
import com.ruoyi.system.domain.NdtDriver;
import com.ruoyi.system.service.INdtDriverService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 司机管理Controller
 * 
 * @author ruoyi
 * @date 2025-01-04
 */
@RestController
@RequestMapping("/driver")
public class NdtDriverController extends BaseController
{
    @Autowired
    private INdtDriverService ndtDriverService;

    /**
     * 查询司机管理列表
     */
    @RequiresPermissions("system:driver:list")
    @GetMapping("/list")
    public TableDataInfo list(NdtDriver ndtDriver)
    {
        startPage();
        List<NdtDriverVo> list = ndtDriverService.selectNdtDriverListVo(ndtDriver);
        return getDataTable(list);
    }

    /**
     * 导出司机管理列表
     */
    @RequiresPermissions("system:driver:export")
    @Log(title = "司机管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NdtDriver ndtDriver)
    {
        List<NdtDriver> list = ndtDriverService.selectNdtDriverList(ndtDriver);
        ExcelUtil<NdtDriver> util = new ExcelUtil<NdtDriver>(NdtDriver.class);
        util.exportExcel(response, list, "司机管理数据");
    }

    /**
     * 获取司机管理详细信息
     */
    @RequiresPermissions("system:driver:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(ndtDriverService.selectNdtDriverById(id));
    }

    /**
     * 新增司机管理
     */
    @RequiresPermissions("system:driver:add")
    @Log(title = "司机管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NdtDriver ndtDriver)
    {
        return toAjax(ndtDriverService.insertNdtDriver(ndtDriver));
    }

    /**
     * 修改司机管理
     */
    @RequiresPermissions("system:driver:edit")
    @Log(title = "司机管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NdtDriver ndtDriver)
    {
        return toAjax(ndtDriverService.updateNdtDriver(ndtDriver));
    }

    /**
     * 删除司机管理
     */
    @RequiresPermissions("system:driver:remove")
    @Log(title = "司机管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(ndtDriverService.deleteNdtDriverByIds(ids));
    }
}
