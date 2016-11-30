package com.WebService.tn.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.WebService.tn.dto.LocalUser;
import com.WebService.tn.dto.UserRegistrationForm;
import com.WebService.tn.exception.UserAlreadyExistAuthenticationException;
import com.WebService.tn.service.UserService;


@RestController
public class RegistrationController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public ModelAndView signup(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        ModelAndView model = new ModelAndView();
        model.addObject("title", "User Registration Form");
        model.setViewName("registration");
        return model;
    }

    @RequestMapping(value = {"/user/register"}, method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
    public @ResponseBody String registerUser(@RequestBody UserRegistrationForm registrationForm) throws UserAlreadyExistAuthenticationException {

        if (registrationForm.getUserId() == null) {
            registrationForm.setUserId(registrationForm.getUserId());
        }

        LocalUser localUser = (LocalUser) userService.registerNewUser(registrationForm);

       return "success";

    }
}
