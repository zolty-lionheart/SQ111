package com.ruoyi.system.service;

import com.ruoyi.system.domain.TestMessage;
import java.util.List;

/**
 * 测试预警信息Service接口
 * 
 * @author ruoyi
 * @date 2020-03-10
 */
public interface ITestMessageService 
{
    /**
     * 查询测试预警信息
     * 
     * @param id 测试预警信息ID
     * @return 测试预警信息
     */
    public TestMessage selectTestMessageById(Long id);

    /**
     * 查询测试预警信息列表
     * 
     * @param testMessage 测试预警信息
     * @return 测试预警信息集合
     */
    public List<TestMessage> selectTestMessageList(TestMessage testMessage);

    /**
     * 新增测试预警信息
     * 
     * @param testMessage 测试预警信息
     * @return 结果
     */
    public int insertTestMessage(TestMessage testMessage);

    /**
     * 修改测试预警信息
     * 
     * @param testMessage 测试预警信息
     * @return 结果
     */
    public int updateTestMessage(TestMessage testMessage);

    /**
     * 批量删除测试预警信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTestMessageByIds(String ids);

    /**
     * 删除测试预警信息信息
     * 
     * @param id 测试预警信息ID
     * @return 结果
     */
    public int deleteTestMessageById(Long id);

    /**
     * 码农：zolty
     * 时间：2020年3月22日
     * 描述：echarts
     */
    public List<TestMessage> selectxdata(String rwmc,String scenario);
}
