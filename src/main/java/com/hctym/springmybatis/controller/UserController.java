package com.hctym.springmybatis.controller;

import com.hctym.springmybatis.model.User;
import com.hctym.springmybatis.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
@Api(tags = "用户管理")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询用户详情")
    @GetMapping(value = "id/{id}")
    @ResponseBody
    public User queryUserById(@PathVariable int id){
        return userService.queryUserById(id);
    }

    @ApiOperation(value = "添加用户")
    @PostMapping(value="/add")
    @ResponseBody
    public int addUser(User user){
        return userService.addUser(user);
    }



    @GetMapping("test/{id}")
    @ResponseBody
    @ApiOperation(value = "test用户")
    public String demo(@PathVariable int id){
        return "hello mock "+id;
    }

}
