package com.test.producter1.dao;

import com.test.producter1.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * @Author yang
 * @Date 2019/5/7
 */
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    /**
     * 查询所有用户
     * @return
     */
    @Override
    List<User> findAll();

    /**
     * 根据id查询
     * @param id
     * @return
     */

    @Override
    Optional<User> findById(Integer id);

    /**
     * 根据id删除
     * @param id
     * @return
     */
    @Override
    void deleteById(Integer id);

    /**
     * 保存信息
     * @param user
     * @return
     */
    @Override
    User save(User user);

    /**
     * 跟新信息
     * @param user
     * @return
     */

    @Override
     User saveAndFlush(User user);
}
