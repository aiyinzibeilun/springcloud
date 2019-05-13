package com.test.gateway.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * 全局路由模型（加入自定义的断言和过滤器）
 * @Author yang
 * @Date 2019/5/9
 */
@Getter
@Setter
public class GatewayRouteDefinition {
    /***
     * 路由的Id
     */

    private String id;
    /**
     * 路由断言集合配置
     */

    private List<GatewayPredicateDefinition> predicates = new ArrayList<>();
    /**
     * 路由过滤器集合配置
     *
     */

    private List<GatewayFilterDefinition> filters = new ArrayList<>();
    /**
     * 路由规则转发的目标uri
     *
     */
    private String uri;
    /**
     *
     * 路由执行的顺序
     */
    private int order = 0;

}
