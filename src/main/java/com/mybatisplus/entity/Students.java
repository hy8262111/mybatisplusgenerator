package com.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
 * @since 2023-02-16
 */
@Getter
@Setter
@TableName("students")
public class Students implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("name")
    private String name;

    @TableField("phone6")
    private String phone6;

    @TableField("phone5")
    private String phone5;

    @TableField("phone4")
    private String phone4;

    @TableField("phone3")
    private String phone3;

    @TableField("phone2")
    private String phone2;

    @TableField("phone1")
    private String phone1;

    @TableField("sex")
    private String sex;

    @TableField("age")
    private Integer age;

    @TableField("tel")
    private String tel;


}
