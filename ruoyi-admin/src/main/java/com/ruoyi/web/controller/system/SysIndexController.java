package com.ruoyi.web.controller.system;

import java.io.IOException;
import java.util.List;

import com.ruoyi.common.core.domain.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import com.ruoyi.common.config.Global;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.domain.SysMenu;
import com.ruoyi.system.domain.SysUser;
import com.ruoyi.system.service.ISysMenuService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 首页 业务处理
 * 
 * @author ruoyi
 */
@Controller
public class SysIndexController extends BaseController
{
    @Autowired
    private ISysMenuService menuService;

    // 系统首页
    @GetMapping("/index")
    public String index(ModelMap mmap)
    {
        // 取身份信息
        SysUser user = ShiroUtils.getSysUser();
        // 根据用户id取出菜单
        List<SysMenu> menus = menuService.selectMenusByUser(user);
        mmap.put("menus", menus);
        mmap.put("user", user);
        mmap.put("copyrightYear", Global.getCopyrightYear());
        mmap.put("demoEnabled", Global.isDemoEnabled());
        return "index";
    }

    // 切换主题
    @GetMapping("/system/switchSkin")
    public String switchSkin(ModelMap mmap)
    {
        return "skin";
    }

    // 系统介绍
    @GetMapping("/system/main")
    public String main(ModelMap mmap)
    {
        mmap.put("version", Global.getVersion());
        return "main";
    }

    /**
     * 码农：zolty
     * 日期：2020年3月19日
     * 描述：url拦截+页面跳转
     */
    @GetMapping("/system/main/GNSS")
    public String GNSS()
    {
        return "/system/blackboard/GNSS";
    }

    @GetMapping("/system/main/SHOW")
    public String SHOW()
    {
        return "/system/blackboard/SHOW";
    }

    @PostMapping("/system/main/SHOWTestBegin")
    @ResponseBody
    public AjaxResult exec(String[] cmdArray) throws IOException {
        Runtime.getRuntime().exec("sh /home/hil/HILsh/show/show.sh");
        return toAjax(1);
    }

    @PostMapping("/system/main/SHOWTestEnd")
    @ResponseBody
    public AjaxResult exec() throws IOException {
        Runtime.getRuntime().exec("sh /home/hil/HILsh/Common/killall.sh");
        return toAjax(1);
    }

    @GetMapping("/system/main/PSCT")
    public String PSCT()
    {
        return "/system/blackboard/PSCT";
    }
}
