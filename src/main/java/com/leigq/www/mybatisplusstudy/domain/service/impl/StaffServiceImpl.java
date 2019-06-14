package com.leigq.www.mybatisplusstudy.domain.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leigq.www.mybatisplusstudy.domain.entity.Staff;
import com.leigq.www.mybatisplusstudy.domain.mapper.StaffMapper;
import com.leigq.www.mybatisplusstudy.domain.service.IStaffService;
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
public class StaffServiceImpl extends ServiceImpl<StaffMapper, Staff> implements IStaffService {

}
