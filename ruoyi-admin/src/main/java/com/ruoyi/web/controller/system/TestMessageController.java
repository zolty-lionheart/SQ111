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
import com.ruoyi.system.domain.TestMessage;
import com.ruoyi.system.service.ITestMessageService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 测试预警信息Controller
 * 
 * @author ruoyi
 * @date 2020-03-10
 */
@Controller
@RequestMapping("/system/message")
public class TestMessageController extends BaseController
{
    private String prefix = "system/message";

    @Autowired
    private ITestMessageService testMessageService;

    @RequiresPermissions("system:message:view")
    @GetMapping()
    public String message()
    {
        return prefix + "/message";
    }

    /**
     * 查询测试预警信息列表
     */
    @RequiresPermissions("system:message:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(TestMessage testMessage)
    {
        startPage();
        List<TestMessage> list = testMessageService.selectTestMessageList(testMessage);
        return getDataTable(list);
    }

    /**
     * 导出测试预警信息列表
     */
    @RequiresPermissions("system:message:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TestMessage testMessage)
    {
        List<TestMessage> list = testMessageService.selectTestMessageList(testMessage);
        ExcelUtil<TestMessage> util = new ExcelUtil<TestMessage>(TestMessage.class);
        return util.exportExcel(list, "message");
    }

    /**
     * 新增测试预警信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存测试预警信息
     */
    @RequiresPermissions("system:message:add")
    @Log(title = "测试预警信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(TestMessage testMessage)
    {
        return toAjax(testMessageService.insertTestMessage(testMessage));
    }

    /**
     * 修改测试预警信息
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        TestMessage testMessage = testMessageService.selectTestMessageById(id);
        mmap.put("testMessage", testMessage);
        return prefix + "/edit";
    }

    /**
     * 修改保存测试预警信息
     */
    @RequiresPermissions("system:message:edit")
    @Log(title = "测试预警信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(TestMessage testMessage)
    {
        return toAjax(testMessageService.updateTestMessage(testMessage));
    }

    /**
     * 删除测试预警信息
     */
    @RequiresPermissions("system:message:remove")
    @Log(title = "测试预警信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(testMessageService.deleteTestMessageByIds(ids));
    }

    /**
     * 码农：zolty
     * 时间：2020年3月22日
     * 描述：echarts
     */
    @PostMapping("/getarray")
    @ResponseBody
    public String[][] getarray(String rwmc,String scenario)
    {
        List<TestMessage> list = testMessageService.selectxdata(rwmc,scenario);
        String [][] xdata = new String[3][list.size()];
        for(int i=0;i<list.size();i++){
            xdata[0][i]=list.get(i).getXtime();
            xdata[1][i]=list.get(i).getHvs().toString();
            xdata[2][i]=list.get(i).getRvs().toString();
        }
        return xdata;
    }
}
