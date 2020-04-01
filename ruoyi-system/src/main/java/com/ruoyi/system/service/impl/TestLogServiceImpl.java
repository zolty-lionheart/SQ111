package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TestLogMapper;
import com.ruoyi.system.domain.TestLog;
import com.ruoyi.system.service.ITestLogService;
import com.ruoyi.common.core.text.Convert;

/**
 * 测试日志Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-10
 */
@Service
public class TestLogServiceImpl implements ITestLogService 
{
    @Autowired
    private TestLogMapper testLogMapper;

    /**
     * 查询测试日志
     * 
     * @param id 测试日志ID
     * @return 测试日志
     */
    @Override
    public TestLog selectTestLogById(Long id)
    {
        return testLogMapper.selectTestLogById(id);
    }

    /**
     * 查询测试日志列表
     * 
     * @param testLog 测试日志
     * @return 测试日志
     */
    @Override
    public List<TestLog> selectTestLogList(String rwmc,TestLog testLog)
    {
        return testLogMapper.selectTestLogList(rwmc,testLog);
    }

    /**
     * 新增测试日志
     * 
     * @param testLog 测试日志
     * @return 结果
     */
    @Override
    public int insertTestLog(TestLog testLog)
    {
        return testLogMapper.insertTestLog(testLog);
    }

    /**
     * 修改测试日志
     * 
     * @param testLog 测试日志
     * @return 结果
     */
    @Override
    public int updateTestLog(TestLog testLog)
    {
        return testLogMapper.updateTestLog(testLog);
    }

    /**
     * 删除测试日志对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTestLogByIds(String ids)
    {
        return testLogMapper.deleteTestLogByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除测试日志信息
     * 
     * @param id 测试日志ID
     * @return 结果
     */
    @Override
    public int deleteTestLogById(Long id)
    {
        return testLogMapper.deleteTestLogById(id);
    }
}
