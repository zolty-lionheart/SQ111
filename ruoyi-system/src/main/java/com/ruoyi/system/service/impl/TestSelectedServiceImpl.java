package com.ruoyi.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.TestSelectedMapper;
import com.ruoyi.system.domain.TestSelected;
import com.ruoyi.system.service.ITestSelectedService;
import com.ruoyi.common.core.text.Convert;

/**
 * 选中集Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-03-17
 */
@Service
public class TestSelectedServiceImpl implements ITestSelectedService 
{
    @Autowired
    private TestSelectedMapper testSelectedMapper;

    /**
     * 查询选中集
     * 
     * @param id 选中集ID
     * @return 选中集
     */
    @Override
    public TestSelected selectTestSelectedById(Long id)
    {
        return testSelectedMapper.selectTestSelectedById(id);
    }

    /**
     * 查询选中集列表
     * 
     * @param testSelected 选中集
     * @return 选中集
     */
    @Override
    public List<TestSelected> selectTestSelectedList(TestSelected testSelected,String loginName)
    {
        return testSelectedMapper.selectTestSelectedList(testSelected,loginName);
    }

    /**
     * 新增选中集
     * 
     * @param testSelected 选中集
     * @return 结果
     */
    @Override
    public int insertTestSelected(TestSelected testSelected)
    {
        return testSelectedMapper.insertTestSelected(testSelected);
    }

    /**
     * 修改选中集
     * 
     * @param testSelected 选中集
     * @return 结果
     */
    @Override
    public int updateTestSelected(TestSelected testSelected)
    {
        return testSelectedMapper.updateTestSelected(testSelected);
    }

    /**
     * 删除选中集对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteTestSelectedByIds(String ids)
    {
        return testSelectedMapper.deleteTestSelectedByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除选中集信息
     *
     * @param id 选中集ID
     * @return 结果
     */
    @Override
    public int deleteTestSelectedById(Long id)
    {
        return testSelectedMapper.deleteTestSelectedById(id);
    }

    /**
     * 码农：zolty
     * 日期：2020年3月17日
     * 描述：清空选中集合
     */
    @Override
    public int deleteAll(String loginName)
    {
        return testSelectedMapper.deleteAll(loginName);
    }

    /**
     * 码农：zolty
     * 日期：2020年3月20日
     * 描述：保存方案
     */
    @Override
    public List<TestSelected> selectTestSelectedListAll(String loginName)
    {
        return testSelectedMapper.selectTestSelectedListAll(loginName);
    }
}
