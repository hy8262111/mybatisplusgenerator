package com.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
@TableName("admin")
@ToString
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("admin_id")
    private Integer adminId;

    @TableField("admin_name")
    private String adminName;

    @TableField("admin_phone")
    private String adminPhone;

    @TableField("admin_password")
    private String adminPassword;


}
