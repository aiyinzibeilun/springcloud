package com.test.producter1.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Author yang
 * @Date 2019/5/7
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "department")
public class Department{
    @Id
    @Column(name="id")
    private  Integer id;
    @Column(name="name")
    private String name;
    @Column(name="db")
    private String db;
}
