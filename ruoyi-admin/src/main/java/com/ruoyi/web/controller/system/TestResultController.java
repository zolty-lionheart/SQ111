package com.ruoyi.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.TestResult;
import com.ruoyi.system.service.ITestResultService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 测试结果Controller
 * 
 * @author ruoyi
 * @date 2020-03-10
 */
@Controller
@RequestMapping("/system/result")
public class TestResultController extends BaseController
{
    private String prefix = "system/result";

    @Autowired
    private ITestResultService testResultService;

    @RequiresPermissions("system:result:view")
    @GetMapping()
    public String result()
    {
        return prefix + "/result";
    }

    /**
     * 查询测试结果列表
     */
    @RequiresPermissions("system:result:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TestResult testResult)
    {
        startPage();
        List<TestResult> list = testResultService.selectTestResultList(testResult);
        return getDataTable(list);
    }

    /**
     * 导出测试结果列表
     */
    @RequiresPermissions("system:result:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TestResult testResult)
    {
        List<TestResult> list = testResultService.selectTestResultList(testResult);
        ExcelUtil<TestResult> util = new ExcelUtil<TestResult>(TestResult.class);
        return util.exportExcel(list, "result");
    }

    /**
     * 新增测试结果
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存测试结果
     */
    @RequiresPermissions("system:result:add")
    @Log(title = "测试结果", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TestResult testResult)
    {
        return toAjax(testResultService.insertTestResult(testResult));
    }

    /**
     * 修改测试结果
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TestResult testResult = testResultService.selectTestResultById(id);
        mmap.put("testResult", testResult);
        return prefix + "/edit";
    }

    /**
     * 修改保存测试结果
     */
    @RequiresPermissions("system:result:edit")
    @Log(title = "测试结果", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TestResult testResult)
    {
        return toAjax(testResultService.updateTestResult(testResult));
    }

    /**
     * 删除测试结果
     */
    @RequiresPermissions("system:result:remove")
    @Log(title = "测试结果", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(testResultService.deleteTestResultByIds(ids));
    }

    /**
     * 码农：zolty
     * 时间：2020年3月17日
     * 描述：详情
     */
    @GetMapping("/detail/{id}")
    public String detail(@PathVariable("id") Long id, ModelMap mmap, Model model)
    {
        TestResult testResult = testResultService.selectTestResultById(id);
        mmap.put("testResult", testResult);
//        String progressBars = "60%";
//        model.addAttribute("progressBars",progressBars);
        return prefix + "/detail";
    }
}
