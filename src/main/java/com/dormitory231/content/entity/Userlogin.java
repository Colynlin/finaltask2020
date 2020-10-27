package com.dormitory231.content.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author ColynLin
 * @since 2020-10-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("USERLOGIN")
public class Userlogin implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private String id;

    @NotBlank(message = "昵称不能为空")
    @TableField("NAME")
    private String name;

    @TableField("PASSWORD")
    private String password;

    @TableField("ROLE")
    private String role;

    @TableField("STATUS")
    private int status;
}
