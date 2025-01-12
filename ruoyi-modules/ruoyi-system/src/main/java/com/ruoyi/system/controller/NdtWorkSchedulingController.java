package com.ruoyi.system.controller;

import java.util.List;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.system.dto.NdtWorkSchedulingDto;
import com.ruoyi.system.service.NdtWorkSchedulingApiService;
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
import com.ruoyi.system.domain.NdtWorkScheduling;
import com.ruoyi.system.service.INdtWorkSchedulingService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 排班管理Controller
 *
 * @author ruoyi
 * @date 2025-01-12
 */
@RestController
@RequestMapping("/scheduling")
public class NdtWorkSchedulingController extends BaseController
{
    @Autowired
    private INdtWorkSchedulingService ndtWorkSchedulingService;


    @Autowired
    private NdtWorkSchedulingApiService ndtWorkSchedulingApiService;
    /**
     * 查询排班管理列表
     */
    @RequiresPermissions("system:scheduling:list")
    @GetMapping("/list")
    public TableDataInfo list(NdtWorkScheduling ndtWorkScheduling)
    {
        startPage();
        List<NdtWorkScheduling> list = ndtWorkSchedulingService.selectNdtWorkSchedulingList(ndtWorkScheduling);
        return getDataTable(list);
    }

    /**
     * 导出排班管理列表
     */
    @RequiresPermissions("system:scheduling:export")
    @Log(title = "排班管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, NdtWorkScheduling ndtWorkScheduling)
    {
        List<NdtWorkScheduling> list = ndtWorkSchedulingService.selectNdtWorkSchedulingList(ndtWorkScheduling);
        ExcelUtil<NdtWorkScheduling> util = new ExcelUtil<NdtWorkScheduling>(NdtWorkScheduling.class);
        util.exportExcel(response, list, "排班管理数据");
    }

    /**
     * 获取排班管理详细信息
     */
    @RequiresPermissions("system:scheduling:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(ndtWorkSchedulingService.selectNdtWorkSchedulingById(id));
    }

    /**
     * 新增排班管理
     */
    @RequiresPermissions("system:scheduling:add")
    @Log(title = "排班管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody NdtWorkScheduling ndtWorkScheduling)
    {
        return toAjax(ndtWorkSchedulingService.insertNdtWorkScheduling(ndtWorkScheduling));
    }

    /**
     * 修改排班管理
     */
    @RequiresPermissions("system:scheduling:edit")
    @Log(title = "排班管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody NdtWorkScheduling ndtWorkScheduling)
    {
        return toAjax(ndtWorkSchedulingService.updateNdtWorkScheduling(ndtWorkScheduling));
    }

    /**
     * 删除排班管理
     */
    @RequiresPermissions("system:scheduling:remove")
    @Log(title = "排班管理", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(ndtWorkSchedulingService.deleteNdtWorkSchedulingByIds(ids));
    }


    /**
     * 查询排班管理列表
     */
    @GetMapping("/api/init")
    public AjaxResult initWorkScheduling() {
        return toAjax(ndtWorkSchedulingApiService.initWorkScheduling());
    }
}
