package com.test.producter1.controller;

import com.test.producter1.entity.User;
import com.test.producter1.service.UserServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("生产者")
@RestController
@RequestMapping("/producter")
public class Producter1Controller {
    /**
     * 注入service层
     */
    @Autowired
    UserServiceImpl userService;

    @ApiOperation("查询所有员工")
    @GetMapping(value = "/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }
    @ApiOperation("查询单个员工")
    @GetMapping(value = "/findById/{id}")
    public User findById(@PathVariable("id") Integer id) {
        return userService.findById(id).get();
    }
    @ApiOperation("跟新员工信息")
    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public void updateUser(User user) {
         userService.saveAndFlush(user);
    }
    @ApiOperation("跟新员工信息")
    @RequestMapping(value = "/deleteUser/{id}",method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") Integer id) {
         userService.deleteById(id);
    }
    @ApiOperation("跟新员工信息")
    @RequestMapping(value = "/insertUser",method = RequestMethod.POST)
    public User insertUser(@RequestBody User user) {
        return userService.save(user);
    }
}
