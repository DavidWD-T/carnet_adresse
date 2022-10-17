package com.example.contact.service;

import com.example.contact.controller.dto.UserDto;
import com.example.contact.repository.UserRepository;
import com.example.contact.repository.entity.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void register(UserDto userDto) {

        User user = new User();
        user.setEmail(userDto.getEmail());
        String hashedPassword = new BCryptPasswordEncoder().encode(userDto.getPassword());
        user.setPassword(hashedPassword);
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setPicture(userDto.getPicture());
        user.setBirthDate(userDto.getBirthDate());
        userRepository.save(user);
    }
}
