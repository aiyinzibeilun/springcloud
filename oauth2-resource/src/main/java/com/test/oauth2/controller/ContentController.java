package com.test.oauth2.controller;

import com.test.oauth2.dao.ContentMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yang
 * @Date 2019/5/15
 */
@RestController
public class ContentController {
    @Autowired
    private ContentMapper contentMapper;
    @GetMapping("/findById/{id}")
    public Object findById(@PathVariable("id")Integer id){
        return contentMapper.selectByPrimaryKey(id);
    }
}
