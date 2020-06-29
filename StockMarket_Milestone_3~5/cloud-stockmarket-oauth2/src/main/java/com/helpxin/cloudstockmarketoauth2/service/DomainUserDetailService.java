package com.helpxin.cloudstockmarketoauth2.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by sx
 * on 2020/6/18
 */
@Component
@Slf4j
public class DomainUserDetailsService implements UserDetailsService {

    @Resource
    private GoddessUserService userService ;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        GoddessUser goddessUser = userService.getOne(new QueryWrapper<GoddessUser>().eq("user_name", s));
        log.info("user:"+goddessUser.getUsername()+" login success!");
        return goddessUser;
    }
}
