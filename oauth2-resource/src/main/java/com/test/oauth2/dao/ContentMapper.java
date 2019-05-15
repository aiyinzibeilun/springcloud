package com.test.oauth2.dao;

import com.test.oauth2.entity.Content;
import org.springframework.stereotype.Repository;

@Repository
public interface ContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Content record);

    int insertSelective(Content record);

    Content selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Content record);

    int updateByPrimaryKey(Content record);


}