package com.leigq.www.mybatisplusstudy.domain.service.impl;

import com.leigq.www.mybatisplusstudy.domain.entity.Department;
import com.leigq.www.mybatisplusstudy.domain.mapper.DepartmentMapper;
import com.leigq.www.mybatisplusstudy.domain.service.IDepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author leigq
 * @since 2019-06-14
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, Department> implements IDepartmentService {

}
