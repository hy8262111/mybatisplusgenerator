package com.mybatisplus.mapper;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.mybatisplus.entity.Book;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author houyong
 * @since 2023-02-16
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {

}
