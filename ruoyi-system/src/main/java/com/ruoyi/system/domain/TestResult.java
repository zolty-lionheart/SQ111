package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 测试结果对象 test_result
 * 
 * @author ruoyi
 * @date 2020-03-10
 */
public class TestResult extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 序号 */
    private Long id;

    /** 创建时间 */
    @Excel(name = "创建时间")
    private String cjsj;

    /** 任务名称 */
    @Excel(name = "任务名称")
    private String rwmc;

    /** 状态 */
    @Excel(name = "状态")
    private String zt;

    /** 场景总数 */
    @Excel(name = "场景总数")
    private String cjzs;

    /** 通过否 */
    @Excel(name = "通过否")
    private String tgf;

    /** 通过数 */
    @Excel(name = "通过数")
    private String tgs;

    /** 未通过数 */
    @Excel(name = "未通过数")
    private String wtgs;

    /** 通过率 */
    @Excel(name = "通过率")
    private String tgl;

    /** 总结 */
    @Excel(name = "总结")
    private String jg;

    /** 运行时间 */
    @Excel(name = "运行时间")
    private String yxsj;

    /** 丢包率 */
    @Excel(name = "丢包率")
    private String dbl;

    /** 误报率 */
    @Excel(name = "误报率")
    private String wbl;

    /** 通信延迟 */
    @Excel(name = "通信延迟")
    private String txyc;

    /** 计算能力 */
    @Excel(name = "计算能力")
    private String jsnl;

    /** 完成度 */
    @Excel(name = "完成度")
    private String wcd;

    /** ddl6 */
    @Excel(name = "ddl6")
    private String ddl6;

    /** ddl7 */
    @Excel(name = "ddl7")
    private String ddl7;

    /** ddl8 */
    @Excel(name = "ddl8")
    private String ddl8;

    /** ddl9 */
    @Excel(name = "ddl9")
    private String ddl9;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setCjsj(String cjsj) 
    {
        this.cjsj = cjsj;
    }

    public String getCjsj() 
    {
        return cjsj;
    }
    public void setRwmc(String rwmc) 
    {
        this.rwmc = rwmc;
    }

    public String getRwmc() 
    {
        return rwmc;
    }
    public void setZt(String zt) 
    {
        this.zt = zt;
    }

    public String getZt() 
    {
        return zt;
    }
    public void setCjzs(String cjzs) 
    {
        this.cjzs = cjzs;
    }

    public String getCjzs() 
    {
        return cjzs;
    }
    public void setTgf(String tgf) 
    {
        this.tgf = tgf;
    }

    public String getTgf() 
    {
        return tgf;
    }
    public void setTgs(String tgs) 
    {
        this.tgs = tgs;
    }

    public String getTgs() 
    {
        return tgs;
    }
    public void setWtgs(String wtgs) 
    {
        this.wtgs = wtgs;
    }

    public String getWtgs() 
    {
        return wtgs;
    }
    public void setTgl(String tgl) 
    {
        this.tgl = tgl;
    }

    public String getTgl() 
    {
        return tgl;
    }
    public void setJg(String jg) 
    {
        this.jg = jg;
    }

    public String getJg() 
    {
        return jg;
    }
    public void setYxsj(String yxsj) 
    {
        this.yxsj = yxsj;
    }

    public String getYxsj() 
    {
        return yxsj;
    }
    public void setDbl(String dbl) 
    {
        this.dbl = dbl;
    }

    public String getDbl() 
    {
        return dbl;
    }
    public void setWbl(String wbl) 
    {
        this.wbl = wbl;
    }

    public String getWbl() 
    {
        return wbl;
    }
    public void setTxyc(String txyc) 
    {
        this.txyc = txyc;
    }

    public String getTxyc() 
    {
        return txyc;
    }
    public void setJsnl(String jsnl) 
    {
        this.jsnl = jsnl;
    }

    public String getJsnl() 
    {
        return jsnl;
    }
    public void setWcd(String wcd)
    {
        this.wcd = wcd;
    }

    public String getWcd()
    {
        return wcd;
    }
    public void setDdl6(String ddl6) 
    {
        this.ddl6 = ddl6;
    }

    public String getDdl6() 
    {
        return ddl6;
    }
    public void setDdl7(String ddl7) 
    {
        this.ddl7 = ddl7;
    }

    public String getDdl7() 
    {
        return ddl7;
    }
    public void setDdl8(String ddl8) 
    {
        this.ddl8 = ddl8;
    }

    public String getDdl8() 
    {
        return ddl8;
    }
    public void setDdl9(String ddl9) 
    {
        this.ddl9 = ddl9;
    }

    public String getDdl9() 
    {
        return ddl9;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("cjsj", getCjsj())
            .append("rwmc", getRwmc())
            .append("zt", getZt())
            .append("cjzs", getCjzs())
            .append("tgf", getTgf())
            .append("tgs", getTgs())
            .append("wtgs", getWtgs())
            .append("tgl", getTgl())
            .append("jg", getJg())
            .append("yxsj", getYxsj())
            .append("dbl", getDbl())
            .append("wbl", getWbl())
            .append("txyc", getTxyc())
            .append("jsnl", getJsnl())
            .append("wcd", getWcd())
            .append("ddl6", getDdl6())
            .append("ddl7", getDdl7())
            .append("ddl8", getDdl8())
            .append("ddl9", getDdl9())
            .toString();
    }
}
