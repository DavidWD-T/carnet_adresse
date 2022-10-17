package com.example.contact.controller;


import com.example.contact.controller.dto.UserDto;
import com.example.contact.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/")
public class UserController {

    private UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/home")
    public String home(){

        return "home";
    }

    @GetMapping("/registration")
    public String displayRegistration(Model model){

        model.addAttribute("userDto", new UserDto());
        return "registration";
    }

    @PostMapping("/registration")
    public String registration(@Valid UserDto userDto, BindingResult result, Model model){
        if(result.hasErrors()){

            model.addAttribute("userDto", userDto);
            return "registration";
        }else {

            userService.register(userDto);

            return "redirect:/signin";
        }
    }


    @GetMapping("/signin")
    public String displaysinginForm(){

        return "signinForm";
    }

    @GetMapping
    public String displayLogoutForm(){
        return "logoutForm";
    }




}
