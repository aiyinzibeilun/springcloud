package com.test.gateway.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 路由断言模型
 * @Author yang
 * @Date 2019/5/9
 */
@Getter
@Setter
public class GatewayPredicateDefinition {
    /**
     * 断言对应的Name
     */
    private String name;
    /**
     * 配置的断言规则
     */

    private Map<String, String> args = new LinkedHashMap<>();
}
