package com.example.mapping.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    @Autowired
    UserRepo obj;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users obj1=obj.findByUsername(username);
        return new com.example.mapping.Security.UserDetails(obj1);
    }
}
