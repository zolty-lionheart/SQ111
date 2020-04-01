package com.ruoyi.web.controller.system;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.service.ITestPlanService;
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
import com.ruoyi.system.domain.TestSelected;
import com.ruoyi.system.service.ITestSelectedService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 选中集Controller
 * 
 * @author ruoyi
 * @date 2020-03-17
 */
@Controller
@RequestMapping("/system/selected")
public class TestSelectedController extends BaseController
{
    private String prefix = "system/selected";

    @Autowired
    private ITestSelectedService testSelectedService;
    @Autowired
    private ITestPlanService testPlanService;

    @RequiresPermissions("system:selected:view")
    @GetMapping()
    public String selected()
    {
        return prefix + "/selected";
    }

    /**
     * 查询选中集列表
     */
    @RequiresPermissions("system:selected:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TestSelected testSelected)
    {
        startPage();
        List<TestSelected> list = testSelectedService.selectTestSelectedList(testSelected,ShiroUtils.getLoginName());
        return getDataTable(list);
    }

    /**
     * 导出选中集列表
     */
    @RequiresPermissions("system:selected:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TestSelected testSelected)
    {
        List<TestSelected> list = testSelectedService.selectTestSelectedList(testSelected,ShiroUtils.getLoginName());
        ExcelUtil<TestSelected> util = new ExcelUtil<TestSelected>(TestSelected.class);
        return util.exportExcel(list, "selected");
    }

    /**
     * 新增选中集
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存选中集
     */
    @RequiresPermissions("system:selected:add")
    @Log(title = "选中集", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TestSelected testSelected)
    {
        return toAjax(testSelectedService.insertTestSelected(testSelected));
    }

    /**
     * 修改选中集
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TestSelected testSelected = testSelectedService.selectTestSelectedById(id);
        mmap.put("testSelected", testSelected);
        return prefix + "/edit";
    }

    /**
     * 修改保存选中集
     */
    @RequiresPermissions("system:selected:edit")
    @Log(title = "选中集", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TestSelected testSelected)
    {
        return toAjax(testSelectedService.updateTestSelected(testSelected));
    }

    /**
     * 删除选中集
     */
    @RequiresPermissions("system:selected:remove")
    @Log(title = "选中集", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(testSelectedService.deleteTestSelectedByIds(ids));
    }

    /**
     * 码农：zolty
     * 日期：2020年3月17日
     * 描述：清空选中集合
     */
    @Log(title = "选中集", businessType = BusinessType.DELETE)
    @PostMapping( "/deleteAll")
    @ResponseBody
    public AjaxResult deleteAll()
    {
        return toAjax(testSelectedService.deleteAll(ShiroUtils.getLoginName()));
    }

    /**
     * 码农：zolty
     * 时间：2020年3月20日
     * 描述：保存方案
     */
    @Log(title = "测试用例", businessType = BusinessType.DELETE)
    @PostMapping( "/saveAll")
    @ResponseBody
    public AjaxResult saveAll(String rwmc)
    {
        List<TestSelected> list = testSelectedService.selectTestSelectedListAll(ShiroUtils.getLoginName());
        try{
            String data = null;
            String path="/home/hil/shell/"+rwmc+".sh";
            File file =new File(path);
            //if file doesnt exists, then create it
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fileWritter = new FileWriter(file.getPath());//覆盖之前的内容
            BufferedWriter bufferWritter = new BufferedWriter(fileWritter);
            for (int a=0; a<list.size(); a++) {
                data = list.get(a).getScenario();
                bufferWritter.write(data);
                bufferWritter.write("\n");
            }
            bufferWritter.close();
            System.out.println(rwmc);
            System.out.println(path);
            testPlanService.insertList(rwmc,path);
            return toAjax(1);
        }catch(IOException e){
            e.printStackTrace();
            return toAjax(0);
        }
    }
}
