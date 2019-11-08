package com.lannis.mybatisplus.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lannis.mybatisplus.entity.BusinessDept;
import com.lannis.mybatisplus.entity.organization;
import com.lannis.mybatisplus.model.SimplePage;
import com.lannis.mybatisplus.service.IDepartmentService;
import com.lannis.mybatisplus.service.ITestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackgeName: com.lannis.mybatisplus.controller
 * @ClassName: TestController
 * @Author: Lannis
 * Date: 2019-11-07 10:30
 * project name: mybatisplus
 * @Version:
 * @Description: Test控制层
 */
@RestController
@Slf4j
public class TestController {
    @Autowired
    private ITestService testService;

    @Autowired
    private IDepartmentService departmentService;

    @RequestMapping("/test")
    public String sayHelloWorld() {
        return testService.list().toString();
    }
    @RequestMapping("/test2")
    public String sayHelloWorld2() {
        return testService.getAllRecords().toString();
    }
    @RequestMapping("/page")
    public Object testpage(){
        SimplePage<BusinessDept> page = new SimplePage();
        QueryWrapper<BusinessDept> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("code",1);
        IPage<BusinessDept> pageList = departmentService.page(page,queryWrapper);

        log.info("总记录数：getTotal:{}",pageList.getTotal());
        log.info("分页大小：getSize:{}",pageList.getSize());
        log.info("总页数：getPages:{}",pageList.getPages());
        log.info("当前页数：getCurrent:{}",pageList.getCurrent());
        log.info("getRecords:{}",pageList.getRecords());
        return pageList;
    }
}
