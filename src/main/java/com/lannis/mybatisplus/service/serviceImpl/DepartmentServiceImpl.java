package com.lannis.mybatisplus.service.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lannis.mybatisplus.entity.BusinessDept;
import com.lannis.mybatisplus.mapper.BusinessDepartmentMapper;
import com.lannis.mybatisplus.service.IDepartmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @PackgeName: com.cdyxsoft.cloud.wechatsysmanager.serive.serviceImpl
 * @ClassName: DepartmentServiceImpl
 * @Author: Lannis
 * Date: 2019-11-07 17:24
 * project name: parent
 * @Version:
 * @Description: 科室实现层
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<BusinessDepartmentMapper, BusinessDept> implements IDepartmentService {
}
