package com.test.oauth2.config.service;

import com.test.oauth2.entity.Authority;
import com.test.oauth2.entity.User;
import com.test.oauth2.service.AuthorityService;
import com.test.oauth2.service.UserService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author yang
 * @Date 2019/5/15
 */
@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private AuthorityService authorityService;
    @Autowired
    private UserService userService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User byName = userService.findByName(username);
        System.out.println(">>>>>byName"+byName);
        List<GrantedAuthority> grantedAuthorityList =new ArrayList<GrantedAuthority>();
        if(byName!=null){
            List<Authority> authortiesList= authorityService.findAuthortiesByUserId(byName.getId());
            authortiesList.forEach(authority->{
                GrantedAuthority grantedAuthority=new SimpleGrantedAuthority(authority.getPermission());
                System.out.println(">>>>>grantedAuthority"+grantedAuthority);
                grantedAuthorityList.add(grantedAuthority);
            });
        }
        return new org.springframework.security.core.userdetails.User(byName.getUsername(),byName.getPassword(),grantedAuthorityList);
    }
}
