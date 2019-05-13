package com.test.producter.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
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
     * 配置rest风格
     * @return
     */
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    /**
     * 负载策略
     * @return
     */
    @Bean
    public IRule iRule(){
        return new RandomRule();
    }
}
