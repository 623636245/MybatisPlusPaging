package com.lannis.mybatisplus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lannis.mybatisplus.entity.organization;

import java.util.List;

/**
 * @PackgeName: com.lannis.mybatisplus.service.serviceImpl
 * @ClassName: ITestService
 * @Author: Lannis
 * Date: 2019-11-07 10:31
 * project name: mybatisplus
 * @Version:
 * @Description: 测试接口层，继承IService
 */
public interface ITestService extends IService<organization> {
    List<organization> getAllRecords();
}
