package com.test.oauth2.service.impl;

import com.test.oauth2.dao.AuthorityMapper;
import com.test.oauth2.entity.Authority;
import com.test.oauth2.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author yang
 * @Date 2019/5/15
 */
@Service
public class AuthorityServiceImpl implements AuthorityService {
    @Autowired
    private AuthorityMapper authorityMapper;
    @Override
    public List<Authority> findAuthortiesByUserId(Integer userId) {
        return authorityMapper.findAuthortiesByUserId(userId);
    }
}
