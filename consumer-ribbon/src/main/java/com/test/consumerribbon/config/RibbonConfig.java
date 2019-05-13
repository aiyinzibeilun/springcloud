package com.test.consumerribbon.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author yang
 * @Date 2019/5/7
 */
@Configuration
public class RibbonConfig {
    /**
     * 配置rest风格模板
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /**
     * 配置负载策略，采用随机
     * @return
     */
    @Bean
    public IRule iRule(){
        return new RandomRule();
    }
}
