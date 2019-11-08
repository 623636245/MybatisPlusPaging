package com.lannis.mybatisplus.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lannis.mybatisplus.entity.organization;
import com.lannis.mybatisplus.mapper.TestMapper;
import com.lannis.mybatisplus.service.ITestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @PackgeName: com.lannis.mybatisplus.service.serviceImpl
 * @ClassName: TestServiceImpl
 * @Author: Lannis
 * Date: 2019-11-07 10:31
 * project name: mybatisplus
 * @Version:
 * @Description: 实现层，继承ServiceImpl 实现ITestService接口
 */
@Service
public class TestServiceImpl extends ServiceImpl<TestMapper, organization> implements ITestService {
    @Resource
    TestMapper testMapper;
    @Override
    public List<organization> getAllRecords() {

        return testMapper.getAllRecords();
    }
}
