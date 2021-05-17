package com.joker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    //localhost:8080/hello
    @RequestMapping("/hello")                  //访问路径
    public String hello(Model model){
        //封装数据
        model.addAttribute("msg","Hello,SpringMVCAnnotation");
        return "hello";       //会被视图解析器处理,跳转的页面(类似请求转发)
    }

}
