package com.mybatisplus.service.impl;

import com.mybatisplus.entity.Students;
import com.mybatisplus.mapper.StudentsMapper;
import com.mybatisplus.service.StudentsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author houyong
 * @since 2023-02-16
 */
@Service
public class StudentsServiceImpl extends ServiceImpl<StudentsMapper, Students> implements StudentsService {

}
