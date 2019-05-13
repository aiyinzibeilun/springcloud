package com.test.producter.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author yang
 * @Date 2019/5/7
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Department {
    private  Integer id;
    private String name;
    private String db;
}
