package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 测试用例对象 test_list
 * 
 * @author ruoyi
 * @date 2020-03-10
 */
public class TestList extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 场景名 */
    @Excel(name = "场景名")
    private String scenario;

    /** 主车速度 */
    @Excel(name = "主车速度")
    private String speed;

    /** 主车行为 */
    @Excel(name = "主车行为")
    private String behavior;

    /** 预警类型 */
    @Excel(name = "预警类型")
    private String warningtype;

    /** 道路类型 */
    @Excel(name = "道路类型")
    private String roadtype;

    /** 障碍物类型 */
    @Excel(name = "障碍物类型")
    private String barriertype;

    /** 试验场地 */
    @Excel(name = "试验场地")
    private String place;

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
    public void setSpeed(String speed) 
    {
        this.speed = speed;
    }

    public String getSpeed() 
    {
        return speed;
    }
    public void setBehavior(String behavior) 
    {
        this.behavior = behavior;
    }

    public String getBehavior() 
    {
        return behavior;
    }
    public void setWarningtype(String warningtype) 
    {
        this.warningtype = warningtype;
    }

    public String getWarningtype() 
    {
        return warningtype;
    }
    public void setRoadtype(String roadtype) 
    {
        this.roadtype = roadtype;
    }

    public String getRoadtype() 
    {
        return roadtype;
    }
    public void setBarriertype(String barriertype) 
    {
        this.barriertype = barriertype;
    }

    public String getBarriertype() 
    {
        return barriertype;
    }
    public void setPlace(String place) 
    {
        this.place = place;
    }

    public String getPlace() 
    {
        return place;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("scenario", getScenario())
            .append("speed", getSpeed())
            .append("behavior", getBehavior())
            .append("warningtype", getWarningtype())
            .append("roadtype", getRoadtype())
            .append("barriertype", getBarriertype())
            .append("place", getPlace())
            .toString();
    }
}
