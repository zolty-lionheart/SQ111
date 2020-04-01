package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 选中集对象 test_selected
 * 
 * @author ruoyi
 * @date 2020-03-17
 */
public class TestSelected extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 场景名 */
    @Excel(name = "场景名")
    private String scenario;

    /** 登录名 */
    @Excel(name = "登录名")
    private String loginName;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setScenario(String scenario) 
    {
        this.scenario = scenario;
    }

    public String getScenario() 
    {
        return scenario;
    }
    public void setLoginName(String loginName) 
    {
        this.loginName = loginName;
    }

    public String getLoginName() 
    {
        return loginName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("scenario", getScenario())
            .append("loginName", getLoginName())
            .toString();
    }
}
