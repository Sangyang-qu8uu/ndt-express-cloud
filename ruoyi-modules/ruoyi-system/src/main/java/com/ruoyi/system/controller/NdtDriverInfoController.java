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
import com.ruoyi.system.domain.NdtDriverInfo;
import com.ruoyi.system.service.INdtDriverInfoService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 司机基本信息Controller
 * 
 * @author ruoyi
 * @date 2025-01-05
 */
@RestController
@RequestMapping("/info")
public class NdtDriverInfoController extends BaseController
{
    @Autowired
    private INdtDriverInfoService ndtDriverInfoService;

    /**
     * 查询司机基本信息列表
     */
    @RequiresPermissions("system:info:list")
    @GetMapping("/list")
    public TableDataInfo list(NdtDriverInfo ndtDriverInfo)
    {
        startPage();
        List<NdtDriverInfo> list = ndtDriverInfoService.selectNdtDriverInfoList(ndtDriverInfo);
        return getDataTable(list);
    }

    /**
     * 导出司机基本信息列表
     */
    @RequiresPermissions("system:info:export")
    @Log(title = "司机基本信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NdtDriverInfo ndtDriverInfo)
    {
        List<NdtDriverInfo> list = ndtDriverInfoService.selectNdtDriverInfoList(ndtDriverInfo);
        ExcelUtil<NdtDriverInfo> util = new ExcelUtil<NdtDriverInfo>(NdtDriverInfo.class);
        util.exportExcel(response, list, "司机基本信息数据");
    }

    /**
     * 获取司机基本信息详细信息
     */
    @RequiresPermissions("system:info:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(ndtDriverInfoService.selectNdtDriverInfoById(id));
    }

    /**
     * 新增司机基本信息
     */
    @RequiresPermissions("system:info:add")
    @Log(title = "司机基本信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NdtDriverInfo ndtDriverInfo)
    {
        return toAjax(ndtDriverInfoService.insertNdtDriverInfo(ndtDriverInfo));
    }

    /**
     * 修改司机基本信息
     */
    @RequiresPermissions("system:info:edit")
    @Log(title = "司机基本信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NdtDriverInfo ndtDriverInfo)
    {
        return toAjax(ndtDriverInfoService.updateNdtDriverInfo(ndtDriverInfo));
    }

    /**
     * 删除司机基本信息
     */
    @RequiresPermissions("system:info:remove")
    @Log(title = "司机基本信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(ndtDriverInfoService.deleteNdtDriverInfoByIds(ids));
    }
}
