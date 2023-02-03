package com.mybatisplus.service.impl;

import com.mybatisplus.entity.Book;
import com.mybatisplus.mapper.BookMapper;
import com.mybatisplus.service.BookService;
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
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

}
