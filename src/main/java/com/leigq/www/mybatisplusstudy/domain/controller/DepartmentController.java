package com.leigq.www.mybatisplusstudy.domain.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.leigq.www.mybatisplusstudy.domain.entity.Department;
import com.leigq.www.mybatisplusstudy.domain.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author leigq
 * @since 2019-06-14
 */
@RestController
public class DepartmentController {

    private final IDepartmentService departmentService;

    @Autowired
    public DepartmentController(IDepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    /**
     * 查询所有部门
     * @author ：LeiGQ <br>
     * @date ：2019-06-14 14:25 <br>
     * <p>
     */
    @GetMapping("/departments")
    public IPage<Department> listDepartments(Page<Department> page) {
        return departmentService.page(page,
                new LambdaQueryWrapper<Department>()
                        .like(Department::getName, "财务")
        );
    }

}
