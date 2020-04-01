package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.TestMessage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 测试预警信息Mapper接口
 * 
 * @author ruoyi
 * @date 2020-03-10
 */
public interface TestMessageMapper 
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
     * 删除测试预警信息
     * 
     * @param id 测试预警信息ID
     * @return 结果
     */
    public int deleteTestMessageById(Long id);

    /**
     * 批量删除测试预警信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTestMessageByIds(String[] ids);

    /**
     * 码农：zolty
     * 日期：2020年3月20日
     * 描述：保存方案
     */
    public List<TestMessage> selectxdata(@Param("rwmc") String rwmc,@Param("scenario") String scenario);
}
