package com.example.student.controller;

import com.example.student.DAO.userDAO;
import com.example.student.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


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
    @RequestMapping("/getUser")
    public ModelAndView getUser(@RequestParam int id){
        ModelAndView mav=new ModelAndView("display");
        User user = userdao.findById(id).orElse(null);
        mav.addObject(user);
        return mav;
    }
    @RequestMapping("/updateUser")
    public ModelAndView updateUser(User user){
        ModelAndView mav=new ModelAndView("updatenew");
        user = userdao.findById(user.getID()).orElse(null);
        userdao.deleteById(user.getID());
        mav.addObject(user);
        return mav;
    }
    @RequestMapping("/deleteUser")
    public ModelAndView deleteUser(@RequestParam int id){
        ModelAndView mav=new ModelAndView("delete");
        User user = userdao.findById(id).orElse(null);
        userdao.deleteById(id);
        mav.addObject(user);
        return mav;
    }
}
