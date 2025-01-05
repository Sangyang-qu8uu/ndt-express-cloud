package com.ruoyi.system.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.system.domain.vo.NdtTruckTypeVo;
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
import com.ruoyi.system.domain.NdtTruckType;
import com.ruoyi.system.service.INdtTruckTypeService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 车型管理Controller
 * 
 * @author ruoyi
 * @date 2025-01-04
 */
@RestController
@RequestMapping("/type")
public class NdtTruckTypeController extends BaseController
{
    @Autowired
    private INdtTruckTypeService ndtTruckTypeService;

    /**
     * 查询车型管理列表
     */
    @RequiresPermissions("system:type:list")
    @GetMapping("/list")
    public TableDataInfo list(NdtTruckType ndtTruckType)
    {
        startPage();
        List<NdtTruckTypeVo> list = ndtTruckTypeService.selectNdtTruckTypeListVo(ndtTruckType);
        return getDataTable(list);
    }

    /**
     * 导出车型管理列表
     */
    @RequiresPermissions("system:type:export")
    @Log(title = "车型管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NdtTruckType ndtTruckType)
    {
        List<NdtTruckType> list = ndtTruckTypeService.selectNdtTruckTypeList(ndtTruckType);
        ExcelUtil<NdtTruckType> util = new ExcelUtil<NdtTruckType>(NdtTruckType.class);
        util.exportExcel(response, list, "车型管理数据");
    }

    /**
     * 获取车型管理详细信息
     */
    @RequiresPermissions("system:type:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(ndtTruckTypeService.selectNdtTruckTypeById(id));
    }

    /**
     * 新增车型管理
     */
    @RequiresPermissions("system:type:add")
    @Log(title = "车型管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NdtTruckType ndtTruckType)
    {
        return toAjax(ndtTruckTypeService.insertNdtTruckType(ndtTruckType));
    }

    /**
     * 修改车型管理
     */
    @RequiresPermissions("system:type:edit")
    @Log(title = "车型管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NdtTruckType ndtTruckType)
    {
        return toAjax(ndtTruckTypeService.updateNdtTruckType(ndtTruckType));
    }

    /**
     * 删除车型管理
     */
    @RequiresPermissions("system:type:remove")
    @Log(title = "车型管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(ndtTruckTypeService.deleteNdtTruckTypeByIds(ids));
    }



    /**
     * 车辆类型下拉
     */
    @RequiresPermissions("system:type:listCheck")
    @GetMapping("/listCheck")
    public AjaxResult listCheck()
    {
        return success(ndtTruckTypeService.listCheck());
    }

}
