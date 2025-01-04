package com.ruoyi.system.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
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
import com.ruoyi.system.domain.NdtCourier;
import com.ruoyi.system.service.INdtCourierService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 快递员Controller
 * 
 * @author ruoyi
 * @date 2025-01-02
 */
@RestController
@RequestMapping("/courier")
public class NdtCourierController extends BaseController
{
    @Autowired
    private INdtCourierService ndtCourierService;

    /**
     * 查询快递员列表
     */
    @RequiresPermissions("system:courier:list")
    @GetMapping("/list")
    public TableDataInfo list(NdtCourier ndtCourier)
    {
        startPage();
        List<NdtCourier> list = ndtCourierService.selectNdtCourierList(ndtCourier);
        return getDataTable(list);
    }

    /**
     * 导出快递员列表
     */
    @RequiresPermissions("system:courier:export")
    @Log(title = "快递员", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NdtCourier ndtCourier)
    {
        List<NdtCourier> list = ndtCourierService.selectNdtCourierList(ndtCourier);
        ExcelUtil<NdtCourier> util = new ExcelUtil<NdtCourier>(NdtCourier.class);
        util.exportExcel(response, list, "快递员数据");
    }

    /**
     * 获取快递员详细信息
     */
    @RequiresPermissions("system:courier:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(ndtCourierService.selectNdtCourierById(id));
    }

    /**
     * 新增快递员
     */
    @RequiresPermissions("system:courier:add")
    @Log(title = "快递员", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NdtCourier ndtCourier)
    {
        return toAjax(ndtCourierService.insertNdtCourier(ndtCourier));
    }

    /**
     * 修改快递员
     */
    @RequiresPermissions("system:courier:edit")
    @Log(title = "快递员", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NdtCourier ndtCourier)
    {
        return toAjax(ndtCourierService.updateNdtCourier(ndtCourier));
    }

    /**
     * 删除快递员
     */
    @RequiresPermissions("system:courier:remove")
    @Log(title = "快递员", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(ndtCourierService.deleteNdtCourierByIds(ids));
    }
}
