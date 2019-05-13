package com.test.producter.service;

import com.test.producter.entity.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author yang
 * @Date 2019/5/7
 */
public interface UserService {
    /**
     * 查询所有员工
     * @return
     */
    List<User> findAll();

    /**
     * 根据员工id查找员工
     * @return
     */
    User findById(Integer id);

    /**
     * 跟新员工信息
     * @param user
     * @return
     */
    int  updateUser(User user);

    /**
     * 删除员工信息
     * @param id
     * @return
     */
    int deleteUser(Integer id);

    /**
     * 添加员工信息
     * @param user
     * @return
     */
    int insertUser(User user);
}
