package com.ruoyi.system.mapper;

import com.ruoyi.system.domain.TestList;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 测试用例Mapper接口
 * 
 * @author ruoyi
 * @date 2020-03-10
 */
public interface TestListMapper 
{
    /**
     * 查询测试用例
     * 
     * @param id 测试用例ID
     * @return 测试用例
     */
    public TestList selectTestListById(Long id);

    /**
     * 查询测试用例列表
     * 
     * @param testList 测试用例
     * @return 测试用例集合
     */
    public List<TestList> selectTestListList(TestList testList);

    /**
     * 新增测试用例
     * 
     * @param testList 测试用例
     * @return 结果
     */
    public int insertTestList(TestList testList);

    /**
     * 修改测试用例
     * 
     * @param testList 测试用例
     * @return 结果
     */
    public int updateTestList(TestList testList);

    /**
     * 删除测试用例
     * 
     * @param id 测试用例ID
     * @return 结果
     */
    public int deleteTestListById(Long id);

    /**
     * 批量删除测试用例
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTestListByIds(String[] ids);

    /**
     * 码农：zolty
     * 时间：2020年3月17日
     * 描述：转表
     */
    public int addTestByIds(@Param("loginName") String loginName , @Param("ids") Long[] ids);
}
