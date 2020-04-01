package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TestListMapper;
import com.ruoyi.system.domain.TestList;
import com.ruoyi.system.service.ITestListService;
import com.ruoyi.common.core.text.Convert;

/**
 * 测试用例Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-10
 */
@Service
public class TestListServiceImpl implements ITestListService 
{
    @Autowired
    private TestListMapper testListMapper;

    /**
     * 查询测试用例
     * 
     * @param id 测试用例ID
     * @return 测试用例
     */
    @Override
    public TestList selectTestListById(Long id)
    {
        return testListMapper.selectTestListById(id);
    }

    /**
     * 查询测试用例列表
     * 
     * @param testList 测试用例
     * @return 测试用例
     */
    @Override
    public List<TestList> selectTestListList(TestList testList)
    {
        return testListMapper.selectTestListList(testList);
    }

    /**
     * 新增测试用例
     * 
     * @param testList 测试用例
     * @return 结果
     */
    @Override
    public int insertTestList(TestList testList)
    {
        return testListMapper.insertTestList(testList);
    }

    /**
     * 修改测试用例
     * 
     * @param testList 测试用例
     * @return 结果
     */
    @Override
    public int updateTestList(TestList testList)
    {
        return testListMapper.updateTestList(testList);
    }

    /**
     * 删除测试用例对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTestListByIds(String ids)
    {
        return testListMapper.deleteTestListByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除测试用例信息
     * 
     * @param id 测试用例ID
     * @return 结果
     */
    @Override
    public int deleteTestListById(Long id)
    {
        return testListMapper.deleteTestListById(id);
    }

    /**
     * 码农：zolty
     * 时间：2020年3月17日
     * 描述：转表
     */
    @Override
    public int addTestByIds(String loginName,String ids)
    {
        return testListMapper.addTestByIds(loginName,Convert.toLongArray(ids));
    }
}
