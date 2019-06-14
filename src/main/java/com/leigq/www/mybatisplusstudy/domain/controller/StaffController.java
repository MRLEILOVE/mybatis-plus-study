package com.leigq.www.mybatisplusstudy.domain.controller;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.leigq.www.mybatisplusstudy.domain.entity.Staff;
import com.leigq.www.mybatisplusstudy.domain.service.IStaffService;
import com.leigq.www.mybatisplusstudy.domain.service.impl.StaffServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author leigq
 * @since 2019-06-14
 */
@RestController
public class StaffController {

    private final IStaffService staffServiceImpl;

    @Autowired
    public StaffController(IStaffService staffServiceImpl) {
        this.staffServiceImpl = staffServiceImpl;
    }

    /**
     * 修改员工信息
     *
     * @author ：LeiGQ <br>
     * @date ：2019-06-14 15:03 <br>
     * <p>
     */
    @PutMapping("/staffs")
    public Boolean updateStaffs() {
        return staffServiceImpl.updateById(
                Staff.builder().id(1L).age((short) 50).version(3).build()
        );
    }

}
