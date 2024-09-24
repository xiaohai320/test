package com.di.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //@RestController= @@Controller + @ResponseBody
public class controller {

    @RequestMapping("/")
    public String helloword(){
        return "helloword1511";
    }
}