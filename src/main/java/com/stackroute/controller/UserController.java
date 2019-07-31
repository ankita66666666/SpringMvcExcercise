package com.stackroute.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Configuration
@Controller
public class UserController {

        @RequestMapping("/")
        public String add(Model model) {

            User user = new User();
            user.setMessage("Ankitha");
           model.addAttribute("result", user.getMessage());

           return "index";
        }



}


