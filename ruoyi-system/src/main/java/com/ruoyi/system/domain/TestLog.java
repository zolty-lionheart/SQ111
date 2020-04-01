package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 测试日志对象 test_log
 * 
 * @author ruoyi
 * @date 2020-03-10
 */
public class TestLog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 任务名称 */
    @Excel(name = "任务名称")
    private String rwmc;

    /** 用例名 */
    @Excel(name = "用例名")
    private String scenario;

    /** 通过否 */
    @Excel(name = "通过否")
    private String tgf;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setRwmc(String rwmc) 
    {
        this.rwmc = rwmc;
    }

    public String getRwmc() 
    {
        return rwmc;
    }
    public void setScenario(String scenario) 
    {
        this.scenario = scenario;
    }

    public String getScenario() 
    {
        return scenario;
    }
    public void setTgf(String tgf)
    {
        this.tgf = tgf;
    }

    public String getTgf()
    {
        return tgf;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("rwmc", getRwmc())
            .append("scenario", getScenario())
            .append("tgf", getTgf())
            .toString();
    }
}
