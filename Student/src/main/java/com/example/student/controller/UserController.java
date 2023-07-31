package com.example.student.controller;

import com.example.student.DAO.userDAO;
import com.example.student.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {

    @Autowired
    userDAO userdao;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @RequestMapping("/addUser")
    public String addUser(User user){
        userdao.save(user);
        return "index";
    }
}
