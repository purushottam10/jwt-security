package io.codelearn.springsecurityjwt.service.impl;

import io.codelearn.springsecurityjwt.service.MyUserDetailService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyUserDetailServiceImpl implements MyUserDetailService {
    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        return new User("admin","admin",new ArrayList<>());
    }
}
