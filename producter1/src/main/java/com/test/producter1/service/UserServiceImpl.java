package com.test.producter1.service;


import com.test.producter1.dao.UserRepository;
import com.test.producter1.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @Author yang
 * @Date 2019/5/7
 */
@Service
public class UserServiceImpl{
    @Autowired
    UserRepository userService;
    /**
     * 查询所有用户
     * @return
     */

   public List<User> findAll(){
       return userService.findAll();
   }

    /**
     * 根据id查询
     * @param id
     * @return
     */

    public Optional<User> findById(Integer id){
        return userService.findById(id);
    }

    /**
     * 根据id删除
     * @param id
     * @return
     */

    public void deleteById(Integer id){
         userService.deleteById(id);
    }

    /**
     * 保存信息
     * @param user
     * @return
     */

    public User save(User user){
       return userService.save(user);
    }

    /**
     * 跟新信息
     * @param user
     * @return
     */


     public User saveAndFlush(User user){
       return userService.saveAndFlush(user);

     }
}
