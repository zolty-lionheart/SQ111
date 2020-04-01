package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TestMessageMapper;
import com.ruoyi.system.domain.TestMessage;
import com.ruoyi.system.service.ITestMessageService;
import com.ruoyi.common.core.text.Convert;

/**
 * 测试预警信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-10
 */
@Service
public class TestMessageServiceImpl implements ITestMessageService 
{
    @Autowired
    private TestMessageMapper testMessageMapper;

    /**
     * 查询测试预警信息
     * 
     * @param id 测试预警信息ID
     * @return 测试预警信息
     */
    @Override
    public TestMessage selectTestMessageById(Long id)
    {
        return testMessageMapper.selectTestMessageById(id);
    }

    /**
     * 查询测试预警信息列表
     * 
     * @param testMessage 测试预警信息
     * @return 测试预警信息
     */
    @Override
    public List<TestMessage> selectTestMessageList(TestMessage testMessage)
    {
        return testMessageMapper.selectTestMessageList(testMessage);
    }

    /**
     * 新增测试预警信息
     * 
     * @param testMessage 测试预警信息
     * @return 结果
     */
    @Override
    public int insertTestMessage(TestMessage testMessage)
    {
        return testMessageMapper.insertTestMessage(testMessage);
    }

    /**
     * 修改测试预警信息
     * 
     * @param testMessage 测试预警信息
     * @return 结果
     */
    @Override
    public int updateTestMessage(TestMessage testMessage)
    {
        return testMessageMapper.updateTestMessage(testMessage);
    }

    /**
     * 删除测试预警信息对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTestMessageByIds(String ids)
    {
        return testMessageMapper.deleteTestMessageByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除测试预警信息信息
     * 
     * @param id 测试预警信息ID
     * @return 结果
     */
    @Override
    public int deleteTestMessageById(Long id)
    {
        return testMessageMapper.deleteTestMessageById(id);
    }

    /**
     * 码农：zolty
     * 日期：2020年3月22日
     * 描述：echarts
     */
    @Override
    public List<TestMessage> selectxdata(String rwmc,String scenario)
    {
        return testMessageMapper.selectxdata(rwmc,scenario);
    }
}
