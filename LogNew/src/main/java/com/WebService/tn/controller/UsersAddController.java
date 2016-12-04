package com.WebService.tn.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.WebService.tn.database.model.Users;
import com.WebService.tn.service.UsersService;

@Controller
@RequestMapping("users")
public class UsersAddController {
 
    @Autowired
    UsersService userServices;
 
    @RequestMapping(value = "/page", method = RequestMethod.GET)
    public ModelAndView getPage() {
        ModelAndView view = new ModelAndView("users");
        return view;
    }
 
    @RequestMapping(value = "/saveOrUpdate1", method = RequestMethod.POST)
    public @ResponseBody Map<String, Object> getSaved(Users users) {
        Map<String, Object> map = new HashMap<String, Object>();
 
        if (userServices.saveOrUpdate(users)) {
            map.put("status", "200");
            map.put("message", "Your record have been saved successfully");
        }
 
        return map;
    }
 
    
 
}
