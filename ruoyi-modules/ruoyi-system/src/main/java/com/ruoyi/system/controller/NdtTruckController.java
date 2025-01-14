package com.ruoyi.system.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.system.domain.vo.NdtTruckVo;
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
import com.ruoyi.system.domain.NdtTruck;
import com.ruoyi.system.service.INdtTruckService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 车辆管理Controller
 * 
 * @author ruoyi
 * @date 2025-01-04
 */
@RestController
@RequestMapping("/truck")
public class NdtTruckController extends BaseController
{
    @Autowired
    private INdtTruckService ndtTruckService;

    /**
     * 查询车辆管理列表
     */
    @RequiresPermissions("system:truck:list")
    @GetMapping("/list")
    public TableDataInfo list(NdtTruck ndtTruck)
    {
        startPage();
        List<NdtTruckVo> list = ndtTruckService.selectNdtTruckListVo(ndtTruck);
        return getDataTable(list);
    }

    /**
     * 导出车辆管理列表
     */
    @RequiresPermissions("system:truck:export")
    @Log(title = "车辆管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NdtTruck ndtTruck)
    {
        List<NdtTruck> list = ndtTruckService.selectNdtTruckList(ndtTruck);
        ExcelUtil<NdtTruck> util = new ExcelUtil<NdtTruck>(NdtTruck.class);
        util.exportExcel(response, list, "车辆管理数据");
    }

    /**
     * 获取车辆管理详细信息
     */
    @RequiresPermissions("system:truck:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(ndtTruckService.selectNdtTruckById(id));
    }

    /**
     * 新增车辆管理
     */
    @RequiresPermissions("system:truck:add")
    @Log(title = "车辆管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NdtTruck ndtTruck)
    {
        return toAjax(ndtTruckService.insertNdtTruck(ndtTruck));
    }

    /**
     * 修改车辆管理
     */
    @RequiresPermissions("system:truck:edit")
    @Log(title = "车辆管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NdtTruck ndtTruck)
    {
        return toAjax(ndtTruckService.updateNdtTruck(ndtTruck));
    }

    /**
     * 删除车辆管理
     */
    @RequiresPermissions("system:truck:remove")
    @Log(title = "车辆管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(ndtTruckService.deleteNdtTruckByIds(ids));
    }
}
