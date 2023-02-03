package com.mybatisplus.service.impl;

import com.mybatisplus.entity.Admin;
import com.mybatisplus.mapper.AdminMapper;
import com.mybatisplus.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author houyong
 * @since 2023-02-03
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
