package com.example.contact.service;

import com.example.contact.repository.UserRepository;
import com.example.contact.repository.entity.User;
import com.example.contact.security.CustomUserDetails;
import com.example.contact.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email){

        User user = userRepository.findByEmail(email);
        if(user == null){

            throw new UsernameNotFoundException("User not found");
        }

        return new CustomUserDetails(user);
    }
}
