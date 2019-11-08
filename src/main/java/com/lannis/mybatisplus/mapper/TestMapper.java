package com.lannis.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lannis.mybatisplus.entity.organization;

import java.util.List;

/**
 * @PackgeName: com.lannis.mybatisplus.mapper
 * @ClassName: TestMapper
 * @Author: Lannis
 * Date: 2019-11-07 10:47
 * project name: mybatisplus
 * @Version:
 * @Description: Mapper层，继承BaseMapper
 */
public interface TestMapper extends BaseMapper<organization> {

    List<organization> getAllRecords();
}
