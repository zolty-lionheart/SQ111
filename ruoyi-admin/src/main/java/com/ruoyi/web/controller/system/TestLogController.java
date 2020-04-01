package com.ruoyi.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.TestLog;
import com.ruoyi.system.service.ITestLogService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 测试日志Controller
 * 
 * @author ruoyi
 * @date 2020-03-10
 */
@Controller
@RequestMapping("/system/log")
public class TestLogController extends BaseController
{
    private String prefix = "system/log";

    @Autowired
    private ITestLogService testLogService;

    @RequiresPermissions("system:log:view")
    @GetMapping()
    public String log()
    {
        return prefix + "/log";
    }

    /**
     * 查询测试日志列表
     */
    @RequiresPermissions("system:log:list")
    @PostMapping("/list/{rwmc}")
    @ResponseBody
    public TableDataInfo list(@PathVariable("rwmc") String rwmc,TestLog testLog)
    {
        startPage();
        List<TestLog> list = testLogService.selectTestLogList(rwmc,testLog);
        return getDataTable(list);
    }

    /**
     * 导出测试日志列表
     */
    @RequiresPermissions("system:log:export")
    @PostMapping("/export/{rwmc}")
    @ResponseBody
    public AjaxResult export(@PathVariable("rwmc") String rwmc,TestLog testLog)
    {
        List<TestLog> list = testLogService.selectTestLogList(rwmc,testLog);
        ExcelUtil<TestLog> util = new ExcelUtil<TestLog>(TestLog.class);
        return util.exportExcel(list, "log");
    }

    /**
     * 新增测试日志
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存测试日志
     */
    @RequiresPermissions("system:log:add")
    @Log(title = "测试日志", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TestLog testLog)
    {
        return toAjax(testLogService.insertTestLog(testLog));
    }

    /**
     * 修改测试日志
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TestLog testLog = testLogService.selectTestLogById(id);
        mmap.put("testLog", testLog);
        return prefix + "/edit";
    }

    /**
     * 修改保存测试日志
     */
    @RequiresPermissions("system:log:edit")
    @Log(title = "测试日志", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TestLog testLog)
    {
        return toAjax(testLogService.updateTestLog(testLog));
    }

    /**
     * 删除测试日志
     */
    @RequiresPermissions("system:log:remove")
    @Log(title = "测试日志", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(testLogService.deleteTestLogByIds(ids));
    }

    /**
     * 码农：zolty
     * 时间：2020年3月20日
     * 描述：log详情
     */
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Long id, ModelMap mmap)
    {
        TestLog testLog = testLogService.selectTestLogById(id);
        mmap.put("testLog", testLog);
        return prefix + "/detail";
    }
}
