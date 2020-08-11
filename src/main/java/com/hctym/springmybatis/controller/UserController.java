package com.hctym.springmybatis.controller;

import com.hctym.springmybatis.model.User;
import com.hctym.springmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "id/{id}",method = RequestMethod.GET)
    @ResponseBody
    public User queryUserById(@PathVariable int id){
        return userService.queryUserById(id);
    }

    @RequestMapping(value="/add", method = RequestMethod.POST)
    @ResponseBody
    public int addUser(User user){
        return userService.addUser(user);
    }



    @RequestMapping("test/{id}")
    @ResponseBody
    public String demo(@PathVariable int id){
        return "hello mock "+id;
    }

}
