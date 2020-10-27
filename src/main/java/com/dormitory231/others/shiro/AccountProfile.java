package com.dormitory231.others.shiro;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author ColynLin
 * @Date 2020/10/19 23:48
 */
@Data
public class AccountProfile implements Serializable {
    private String id;
    private String name;
    private String password;
    private String role;
    private int status;
}
