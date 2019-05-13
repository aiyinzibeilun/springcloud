package com.test.consumerfeign.feign;

import com.test.consumerfeign.entity.User;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 统一的服务接口
 *
 * @Author yang
 * @Date 2019/5/8
 */

@Component
public class UserFallBackFactory implements FallbackFactory<UserFeign> {
    @Override
    public UserFeign create(Throwable throwable) {
        return new UserFeign() {
            @Override
            public User findById(Integer id) {
                User user = new User();
                user.setId(id);
                user.setDeptId(0);
                user.setName("暂无");
                return user;

            }

            @Override
            public List<User> findAll() {
                List<User> list = new ArrayList<>();
                User user = new User();
                user.setId(0);
                user.setDeptId(0);
                user.setName("暂无");
                list.add(user);
                return list;
            }

            @Override
            public int insertUser(User user) {
                return 0;
            }
        };
    }

}
