package com.example.mapping.Security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;


public class UserDetails implements org.springframework.security.core.userdetails.UserDetails {
    public Users User1;
    public UserDetails(Users obj1)
    {
        User1= obj1;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority(User1.getRole()));
    }
    @Override
    public String getPassword() {
        return User1.getPassword();
    }

    @Override
    public String getUsername() {
        return User1.getName();
    }
}


