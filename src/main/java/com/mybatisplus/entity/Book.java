package com.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author houyong
 * @since 2023-02-03
 */
@Getter
@Setter
@TableName("book")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("book_id")
    private Integer bookId;

    @TableField("book_name")
    private String bookName;

    @TableField("book_writer")
    private String bookWriter;

    @TableField("book_publish")
    private String bookPublish;

    @TableField("book_status")
    private String bookStatus;


}
