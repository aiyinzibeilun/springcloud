package com.test.producter.mapper;

import com.test.producter.entity.Department;
import com.test.producter.entity.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author yang
 * @Date 2019/5/7
 */
@Repository
@MapperScan
public interface DeptMapper {
    /**
     * 根据员工id查找部门
     * @return
     */
    Department findByDeptId(Integer id);

    /**
     * 添加员工信息
     * @param department
     * @return
     */
    int insertDept(Department department);

}
