package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TestPlanMapper;
import com.ruoyi.system.domain.TestPlan;
import com.ruoyi.system.service.ITestPlanService;
import com.ruoyi.common.core.text.Convert;

/**
 * 测试方案Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-10
 */
@Service
public class TestPlanServiceImpl implements ITestPlanService 
{
    @Autowired
    private TestPlanMapper testPlanMapper;

    /**
     * 查询测试方案
     * 
     * @param id 测试方案ID
     * @return 测试方案
     */
    @Override
    public TestPlan selectTestPlanById(Long id)
    {
        return testPlanMapper.selectTestPlanById(id);
    }

    /**
     * 查询测试方案列表
     * 
     * @param testPlan 测试方案
     * @return 测试方案
     */
    @Override
    public List<TestPlan> selectTestPlanList(TestPlan testPlan)
    {
        return testPlanMapper.selectTestPlanList(testPlan);
    }

    /**
     * 新增测试方案
     * 
     * @param testPlan 测试方案
     * @return 结果
     */
    @Override
    public int insertTestPlan(TestPlan testPlan)
    {
        return testPlanMapper.insertTestPlan(testPlan);
    }

    /**
     * 修改测试方案
     * 
     * @param testPlan 测试方案
     * @return 结果
     */
    @Override
    public int updateTestPlan(TestPlan testPlan)
    {
        return testPlanMapper.updateTestPlan(testPlan);
    }

    /**
     * 删除测试方案对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTestPlanByIds(String ids)
    {
        return testPlanMapper.deleteTestPlanByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除测试方案信息
     * 
     * @param id 测试方案ID
     * @return 结果
     */
    @Override
    public int deleteTestPlanById(Long id)
    {
        return testPlanMapper.deleteTestPlanById(id);
    }

    /**
     * 码农：zolty
     * 日期：2020年3月20日
     * 描述：保存方案
     */
    public int insertList(String rwmc,String path)
    {
        return testPlanMapper.insertList(rwmc,path);
    }
}
