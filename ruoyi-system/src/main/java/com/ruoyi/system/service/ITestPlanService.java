package com.ruoyi.system.service;

import com.ruoyi.system.domain.TestPlan;
import java.util.List;

/**
 * 测试方案Service接口
 * 
 * @author ruoyi
 * @date 2020-03-10
 */
public interface ITestPlanService 
{
    /**
     * 查询测试方案
     * 
     * @param id 测试方案ID
     * @return 测试方案
     */
    public TestPlan selectTestPlanById(Long id);

    /**
     * 查询测试方案列表
     * 
     * @param testPlan 测试方案
     * @return 测试方案集合
     */
    public List<TestPlan> selectTestPlanList(TestPlan testPlan);

    /**
     * 新增测试方案
     * 
     * @param testPlan 测试方案
     * @return 结果
     */
    public int insertTestPlan(TestPlan testPlan);

    /**
     * 修改测试方案
     * 
     * @param testPlan 测试方案
     * @return 结果
     */
    public int updateTestPlan(TestPlan testPlan);

    /**
     * 批量删除测试方案
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTestPlanByIds(String ids);

    /**
     * 删除测试方案信息
     * 
     * @param id 测试方案ID
     * @return 结果
     */
    public int deleteTestPlanById(Long id);

    /**
     * 码农：zolty
     * 日期：2020年3月20日
     * 描述：保存方案
     */
    public int insertList(String rwmc,String path);
}
