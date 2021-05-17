package com.joker.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller    //这个类会被spring接管，
public class ControllerTest2 {
    @RequestMapping("/t2")
    public String test1(Model model){
        model.addAttribute("msg","ControlTest2");
        return "test";
    }


    public String test2(){
        //重定向       //重新发送一个请求，不走视图解析器 ，写明路径
        return "redirect:/index.jsp";
        //return "redirect:hello.do";   //hello.do为另一个请求
    }
}
