package com.dormitory231.content.controller;


import com.dormitory231.content.entity.Userlogin;
import com.dormitory231.content.service.UserloginService;
import com.dormitory231.others.bean.Result;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @author ColynLin
 * @since 2020-10-19
 */
@RestController
@RequestMapping("/userlogin")
public class UserloginController {
    @Autowired
    UserloginService userloginService;

    @RequiresAuthentication
    @GetMapping("/index")
    public Result index() {
        Userlogin user = userloginService.getById("1B");
        return Result.success(user);
    }

    @PostMapping("/save")
    public Result save(@Validated @RequestBody Userlogin user) {
        return Result.success(user);
    }

}
