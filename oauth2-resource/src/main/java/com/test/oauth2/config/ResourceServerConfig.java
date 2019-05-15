package com.test.oauth2.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.util.AntPathMatcher;

/**
 * @Author yang
 * @Date 2019/5/15
 */
@Configuration
@EnableWebSecurity
//全局拦截
@EnableGlobalMethodSecurity(prePostEnabled = true,securedEnabled = true,jsr250Enabled = true)
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                //匹配访问路经的权限
                .antMatchers("/findById/{id}").hasAuthority("admin")
                .antMatchers("/findAll").hasAuthority("admin");


    }
}
