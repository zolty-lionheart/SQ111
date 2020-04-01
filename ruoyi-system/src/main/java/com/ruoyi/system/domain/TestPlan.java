package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 测试方案对象 test_plan
 * 
 * @author ruoyi
 * @date 2020-03-10
 */
public class TestPlan extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 任务名称 */
    @Excel(name = "任务名称")
    private String rwmc;

    /** 路径 */
    @Excel(name = "路径")
    private String path;

    /** 备注 */
    @Excel(name = "备注")
    private String bz;

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
    public void setPath(String path) 
    {
        this.path = path;
    }

    public String getPath() 
    {
        return path;
    }
    public void setBz(String bz) 
    {
        this.bz = bz;
    }

    public String getBz() 
    {
        return bz;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("rwmc", getRwmc())
            .append("path", getPath())
            .append("bz", getBz())
            .toString();
    }
}
