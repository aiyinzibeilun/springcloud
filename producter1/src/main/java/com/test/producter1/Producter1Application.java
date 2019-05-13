package com.test.producter1;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@EnableSwagger2Doc
//@EnableEurekaClient
@EnableDiscoveryClient
@MapperScan({"com.test.producter1.mapper","com.test.producter1.dao"})
@SpringBootApplication(exclude = {DruidDataSourceAutoConfigure.class})
public class Producter1Application {

    public static void main(String[] args) {
        SpringApplication.run(Producter1Application.class, args);
    }

}
