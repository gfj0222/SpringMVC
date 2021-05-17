package com.joker.controller;

import com.joker.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

    //localhost:8080/user/t1 ? name=XXX
    @GetMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model){       //requesrParam 告诉我们要从前端接受的参数名
        //1.接受前端参数
        System.out.println("接收到的前端的参数为：" + name);

        //2.将返回的结果传递给前段
        model.addAttribute("msg",name);

        //3.跳转视图
        return "test";
    }


    //前端接收的是一个对象： id，name,age
    @RequestMapping("/t2")
    public String test2(User user){
        System.out.println(user);
        return "test";
    }

    //前端接收的是一个对象： id，name,age
    @RequestMapping("/t3")
    public String test3(ModelMap modelMap){

        return "test";
    }





}
