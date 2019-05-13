package com.test.producter.mapper;

import com.test.producter.entity.Department;
import com.test.producter.entity.User;
import com.test.producter.mapper.master.UserMapper;
import com.test.producter.mapper.cluster.DeptMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

/**
 * @Author yang
 * @Date 2019/5/7
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    UserMapper userMapper;
    @Autowired
    DeptMapper deptMapper;
    @Test
    public void findAll() {
        List<User> all = userMapper.findAll();
        System.out.println(all);
    }
    @Test
    @Transactional
    public void insertUser() {
        User user=new User();
        user.setId(4);
        user.setName("zl");
        Department department=new Department();
        department.setId(4);
        department.setName("haha");
        user.setDeptId(4);
        int i = userMapper.insertUser(user);
        int j=10/0;
        System.out.println(i);
    }
    @Test
    public void findById() {
        User byId = userMapper.findById(1);
        System.out.println(byId);
    }

    @Test
    public void updateUser() {
        User user=new User();
        user.setId(4);
        user.setName("zl222");
        Department department=new Department();
        department.setId(4);
        department.setName("hehe");
        user.setDeptId(4);
        int i = userMapper.updateUser(user);
        System.out.println(i);
    }

    @Test
    public void deleteUser() {
        int i = userMapper.deleteUser(4);
        System.out.println(i);
    }

    @Test
//    @Transactional("clusterTransactionManager")
    public void findDept() {
        Department byDeptId = deptMapper.findById(1);
//        byDeptId.setId(4);
//        User user=new User();
//        user.setId(4);
//        user.setName("zl");
//        user.setDeptId(4);
//        System.out.println(byDeptId);
//        deptMapper.insertDept(byDeptId);
//        int j=10/0;
        System.out.println(byDeptId);
    }

}