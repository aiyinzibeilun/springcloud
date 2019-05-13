package com.test.gateway.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 全局过滤模型
 * @Author yang
 * @Date 2019/5/9
 */
@Setter
@Getter
public class GatewayFilterDefinition {
   /**
    * Filter Name
    *
    */
    private String name;
    /**
     * 对应的路由规则
     */
    private Map<String, String> args = new LinkedHashMap<>();
}
