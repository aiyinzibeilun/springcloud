package com.test.producter.mapper.cluster;

import com.test.producter.entity.Department;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import javax.annotation.sql.DataSourceDefinition;


/**
 * @Author yang
 * @Date 2019/5/7
 */
@Repository
@Mapper
public interface DeptMapper {
    /**
     * 根据员工id查找部门
     * @return
     */
    Department findById(Integer id);

    /**
     * 添加员工信息
     * @param department
     * @return
     */
    int insertDept(Department department);

}
