package com.ruoyi.system.service;

import com.ruoyi.system.domain.TestSelected;
import java.util.List;

/**
 * 选中集Service接口
 * 
 * @author ruoyi
 * @date 2020-03-17
 */
public interface ITestSelectedService 
{
    /**
     * 查询选中集
     * 
     * @param id 选中集ID
     * @return 选中集
     */
    public TestSelected selectTestSelectedById(Long id);

    /**
     * 查询选中集列表
     * 
     * @param testSelected 选中集
     * @return 选中集集合
     */
    public List<TestSelected> selectTestSelectedList(TestSelected testSelected,String loginName);

    /**
     * 新增选中集
     * 
     * @param testSelected 选中集
     * @return 结果
     */
    public int insertTestSelected(TestSelected testSelected);

    /**
     * 修改选中集
     * 
     * @param testSelected 选中集
     * @return 结果
     */
    public int updateTestSelected(TestSelected testSelected);

    /**
     * 批量删除选中集
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteTestSelectedByIds(String ids);

    /**
     * 删除选中集信息
     * 
     * @param id 选中集ID
     * @return 结果
     */
    public int deleteTestSelectedById(Long id);

    /**
     * 码农：zolty
     * 日期：2020年3月17日
     * 描述：清空选中集合
     */
    public int deleteAll(String loginName);

    /**
     * 码农：zolty
     * 日期：2020年3月20日
     * 描述：保存方案
     */
    public List<TestSelected> selectTestSelectedListAll(String loginName);
}
