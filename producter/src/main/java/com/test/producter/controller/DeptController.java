package com.test.producter.controller;

import com.test.producter.entity.Department;
import com.test.producter.mapper.cluster.DeptMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Administrator
 * @date: 2019/5/11
 */
@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    DeptMapper deptMapper;
    /**
     * 根据员工id查找部门
     * @return
     */
   public Department findByDeptId(Integer id){
       return deptMapper.findById(id);
   }

    /**
     * 添加员工信息
     * @param department
     * @return
     */
    public int insertDept(Department department){
        return deptMapper.insertDept(department);
    }
}
