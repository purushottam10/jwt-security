package io.codelearn.springsecurityjwt.service.impl;



import io.codelearn.springsecurityjwt.model.User;

import io.codelearn.springsecurityjwt.repository.UserRepository;
import io.codelearn.springsecurityjwt.service.MyUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;


@Service
public class MyUserDetailServiceImpl implements MyUserDetailService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        User user = userRepository.findUserById(userName);
//        User user = new User();
        return new org.springframework.security.core.userdetails.User(user.getId(),user.getPassword(),new ArrayList<>());
    }
}
