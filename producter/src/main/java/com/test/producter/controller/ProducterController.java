package com.test.producter.controller;

import com.test.producter.entity.User;
import com.test.producter.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api("生产者")
@RestController
@RequestMapping("/producter")
public class ProducterController {
    /**
     * 注入service层
     */
    @Autowired
    UserService userService;

    @ApiOperation("查询所有员工")
    @GetMapping(value = "/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }
    @ApiOperation("查询单个员工")
    @GetMapping(value = "/findById/{id}")
    public User findById(@PathVariable("id") Integer id) {
        return userService.findById(id);
    }
    @ApiOperation("跟新员工信息")
    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    public int updateUser(User user) {
        return userService.updateUser(user);
    }
    @ApiOperation("跟新员工信息")
    @RequestMapping(value = "/deleteUser/{id}",method = RequestMethod.DELETE)
    public int deleteUser(@PathVariable("id") Integer id) {
        return userService.deleteUser(id);
    }
    @ApiOperation("跟新员工信息")
    @RequestMapping(value = "/insertUser",method = RequestMethod.POST)
    public int insertUser(@RequestBody User user) {
        return userService.insertUser(user);
    }
}
