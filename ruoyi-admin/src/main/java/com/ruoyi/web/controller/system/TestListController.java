package com.ruoyi.web.controller.system;

import java.io.IOException;
import java.util.List;

import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.domain.TestSelected;
import com.ruoyi.system.mapper.TestSelectedMapper;
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
import com.ruoyi.system.domain.TestList;
import com.ruoyi.system.service.ITestListService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 测试用例Controller
 * 
 * @author ruoyi
 * @date 2020-03-10
 */
@Controller
@RequestMapping("/system/list")
public class TestListController extends BaseController
{
    private String prefix = "system/list";

    @Autowired
    private ITestListService testListService;

    @RequiresPermissions("system:list:view")
    @GetMapping()
    public String list()
    {
        return prefix + "/list";
    }

    /**
     * 查询测试用例列表
     */
    @RequiresPermissions("system:list:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TestList testList)
    {
        startPage();
        List<TestList> list = testListService.selectTestListList(testList);
        return getDataTable(list);
    }

    /**
     * 导出测试用例列表
     */
    @RequiresPermissions("system:list:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TestList testList)
    {
        List<TestList> list = testListService.selectTestListList(testList);
        ExcelUtil<TestList> util = new ExcelUtil<TestList>(TestList.class);
        return util.exportExcel(list, "list");
    }

    /**
     * 新增测试用例
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存测试用例
     */
    @RequiresPermissions("system:list:add")
    @Log(title = "测试用例", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TestList testList)
    {
        return toAjax(testListService.insertTestList(testList));
    }

    /**
     * 修改测试用例
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TestList testList = testListService.selectTestListById(id);
        mmap.put("testList", testList);
        return prefix + "/edit";
    }

    /**
     * 修改保存测试用例
     */
    @RequiresPermissions("system:list:edit")
    @Log(title = "测试用例", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TestList testList)
    {
        return toAjax(testListService.updateTestList(testList));
    }

    /**
     * 删除测试用例
     */
    @RequiresPermissions("system:list:remove")
    @Log(title = "测试用例", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(testListService.deleteTestListByIds(ids));
    }

    /**
     * 码农：zolty
     * 时间：2020年3月17日
     * 描述：转表
     */
    @Log(title = "测试用例", businessType = BusinessType.DELETE)
    @PostMapping( "/addTest")
    @ResponseBody
    public AjaxResult addTest(String ids)
    {
        return toAjax(testListService.addTestByIds(ShiroUtils.getLoginName(),ids));
    }

    /**
     * 码农：zolty
     * 时间：2020年03月30日13:57:45
     * 描述：修改场景文件
     * 参考：gedit /home/hil/VTD.2.2/Data/Projects/AllScenarios/ASS_3.3.1_1.xml
     */
    @PostMapping( "/gEdit")
    @ResponseBody
    public AjaxResult exec(String scenario) throws IOException {
        System.out.println(scenario);
        String comm = "gedit /home/hil/VTD.2.2/Data/Projects/AllScenarios/" + scenario;
        Runtime.getRuntime().exec(comm);
        return toAjax(1);
    }
}
