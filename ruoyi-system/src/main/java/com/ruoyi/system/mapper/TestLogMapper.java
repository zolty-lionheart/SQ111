package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.TestLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 测试日志Mapper接口
 * 
 * @author ruoyi
 * @date 2020-03-10
 */
public interface TestLogMapper 
{
    /**
     * 查询测试日志
     * 
     * @param id 测试日志ID
     * @return 测试日志
     */
    public TestLog selectTestLogById(Long id);

    /**
     * 查询测试日志列表
     * 
     * @param testLog 测试日志
     * @return 测试日志集合
     */
    public List<TestLog> selectTestLogList(@Param("rwmc") String rwmc, TestLog testLog);

    /**
     * 新增测试日志
     * 
     * @param testLog 测试日志
     * @return 结果
     */
    public int insertTestLog(TestLog testLog);

    /**
     * 修改测试日志
     * 
     * @param testLog 测试日志
     * @return 结果
     */
    public int updateTestLog(TestLog testLog);

    /**
     * 删除测试日志
     * 
     * @param id 测试日志ID
     * @return 结果
     */
    public int deleteTestLogById(Long id);

    /**
     * 批量删除测试日志
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTestLogByIds(String[] ids);
}
