package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 测试预警信息对象 test_message
 * 
 * @author ruoyi
 * @date 2020-03-10
 */
public class TestMessage extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 预警序号 */
    @Excel(name = "预警序号")
    private Long infonum;

    /** MD5否 */
    @Excel(name = "MD5否")
    private Long ismd5;

    /** 时间戳 */
    @Excel(name = "时间戳")
    private Long timestamp;

    /** 预警类型 */
    @Excel(name = "预警类型")
    private Long messagetype;

    /** 预警信息长度 */
    @Excel(name = "预警信息长度")
    private Long messagelength;

    /** 预警位置(x) */
    @Excel(name = "预警位置(x)")
    private Long x;

    /** 预警位置(y) */
    @Excel(name = "预警位置(y)")
    private Long y;

    /** 碰撞时间 */
    @Excel(name = "碰撞时间")
    private Long ttc;

    /** 主车速度 */
    @Excel(name = "主车速度")
    private Long hvs;

    /** 远车速度 */
    @Excel(name = "远车速度")
    private Long rvs;

    /** 相对距离 */
    @Excel(name = "相对距离")
    private Long hrdistance;

    /** 任务名称 */
    @Excel(name = "任务名称")
    private String rwmc;

    /** 用例名 */
    @Excel(name = "用例名")
    private String scenario;

    /** xtime */
    @Excel(name = "xtime")
    private String xtime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setInfonum(Long infonum) 
    {
        this.infonum = infonum;
    }

    public Long getInfonum() 
    {
        return infonum;
    }
    public void setIsmd5(Long ismd5) 
    {
        this.ismd5 = ismd5;
    }

    public Long getIsmd5() 
    {
        return ismd5;
    }
    public void setTimestamp(Long timestamp) 
    {
        this.timestamp = timestamp;
    }

    public Long getTimestamp() 
    {
        return timestamp;
    }
    public void setMessagetype(Long messagetype) 
    {
        this.messagetype = messagetype;
    }

    public Long getMessagetype() 
    {
        return messagetype;
    }
    public void setMessagelength(Long messagelength) 
    {
        this.messagelength = messagelength;
    }

    public Long getMessagelength() 
    {
        return messagelength;
    }
    public void setX(Long x) 
    {
        this.x = x;
    }

    public Long getX() 
    {
        return x;
    }
    public void setY(Long y) 
    {
        this.y = y;
    }

    public Long getY() 
    {
        return y;
    }
    public void setTtc(Long ttc) 
    {
        this.ttc = ttc;
    }

    public Long getTtc() 
    {
        return ttc;
    }
    public void setHvs(Long hvs) 
    {
        this.hvs = hvs;
    }

    public Long getHvs() 
    {
        return hvs;
    }
    public void setRvs(Long rvs) 
    {
        this.rvs = rvs;
    }

    public Long getRvs() { return rvs; }
    public void setHrdistance(Long hrdistance) 
    {
        this.hrdistance = hrdistance;
    }

    public Long getHrdistance() 
    {
        return hrdistance;
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
    public void setXtime(String xtime)
    {
        this.xtime = xtime;
    }

    public String getXtime()
    {
        return xtime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("infonum", getInfonum())
            .append("ismd5", getIsmd5())
            .append("timestamp", getTimestamp())
            .append("messagetype", getMessagetype())
            .append("messagelength", getMessagelength())
            .append("x", getX())
            .append("y", getY())
            .append("ttc", getTtc())
            .append("hvs", getHvs())
            .append("rvs", getRvs())
            .append("hrdistance", getHrdistance())
            .append("rwmc", getRwmc())
            .append("scenario", getScenario())
            .append("xtime", getXtime())
            .toString();
    }
}
