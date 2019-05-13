package com.test.producter1.dao;

import com.test.producter1.entity.User;
import com.test.producter1.service.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

/**
 * @Author yang
 * @Date 2019/5/7
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    UserServiceImpl userService;
    @Test
    public void findAll() {
        List<User> all = userService.findAll();
        System.out.println(all);
    }

    @Test
    public void findById() {
        Optional<User> byId = userService.findById(1);
        System.out.println(byId.get());
    }

    @Test
    public void deleteById() {
        userService.deleteById(4);
    }

    @Test
    public void save() {
        User user=new User();
        user.setId(4);
        user.setName("zl");
        user.setDeptId(2);
        User save = userService.save(user);
        System.out.println(save);
    }

    @Test
    public void saveAndFlush() {
        User user=new User();
        user.setId(4);
        user.setName("zl");
        user.setDeptId(3);
        User save = userService.save(user);
        System.out.println(save);
    }
}