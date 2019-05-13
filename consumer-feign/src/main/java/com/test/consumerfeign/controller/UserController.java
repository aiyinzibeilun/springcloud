package com.test.consumerfeign.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.test.consumerfeign.entity.User;
import com.test.consumerfeign.feign.UserFeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


/**
 * @Author yang
 * @Date 2019/5/7
 */
@RestController
public class UserController {
    @Autowired
    private UserFeign userFeign;
    @HystrixCommand(fallbackMethod = "findByIdFallBack")
    @RequestMapping("/producter/findById/{id}")
    public User get(@PathVariable("id")Integer id) {
        User byId = this.userFeign.findById(id);
        System.out.println(byId);
        return byId;
    }

    /**
     *
     * 若是出现调用get方法时出现错误或超时时，则调用此方法
     * @param
     * @return
     */
    public User findByIdFallBack(Integer id){
        User user=new User();
        user.setId(id);
        user.setDeptId(0);
        user.setName("暂无");
        return user;
    }

    @HystrixCommand(fallbackMethod = "insertFallBack")
    @PostMapping(value = "/producter/insertUser")
    public int insertUser(User user) {
        int i = userFeign.insertUser(user);
        System.out.println(i);
        return i;
    }

    public int insertFallBack(User user) {
        int i = userFeign.insertUser(user);
        System.out.println(i);
        return 0;
    }
//
//    /**
//     *
//     *
//     *
//     *  Hystrix的隔离策略两种： 分别是线程隔离和信号量隔离。
//     *
//     * THREAD(线程隔离）：使用该方式，HystrixCommand将会在单独的线程上执行，并发请求受线程池中线程数量的限制。
//     * SEMAPHORE（信号量隔离）：使用该方式，HystrixCommand将会在调用线程上执行，开销相对较小，并发请求受到信号量个数的限制。
//     *                           SEMAPHORE 信号量隔离只是限制了总的并发数，服务使用主线程进行同步调用，即没有线程池。因此，如果只是想限制某个服务的总并发调用量或者调用的服务不涉及远程调用的话，可以使用轻量级的信号量来实现。
//     * Hystrix中默认并且推荐使用线程隔离（THREAD)，因为这种方式有一个除网络超时以外的额外保护。
//     * 一般来说，只有当调用负载异常高时（例如每个实例每秒调用数百次）才需要信号量隔离，因为这种场景下使用THREAD开销会比较高。信号量隔离一般仅适用于非网络调用的隔离。
//     * 可以使用execution.isolation.strategy属性指定隔离策略。
//     * 正常情况下，默认为线程隔离, 保持默认即可。
//     * 如果发生找不到上下文运行时异常，可考虑将隔离策略设置为SEMAPHORE。
//     *
//     * @return
//     */
    @RequestMapping("/producter/findAll")
    @HystrixCommand(fallbackMethod = "findAllFallBack",commandProperties = @HystrixProperty( name = "execution.isolation.strategy", value = "SEMAPHORE"))
    public List<User> findAll() {
        List<User> users = userFeign.findAll();
        System.out.println(users);
        return users;
    }

    public List<User> findAllFallBack(){
        List<User> users=new ArrayList<>();
        User user=new User();
        user.setId(0);
        user.setDeptId(0);
        user.setName("暂无");
        users.add(user);
        return users;
    }


}
