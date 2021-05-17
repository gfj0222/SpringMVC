package com.joker.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.joker.pojo.User;
import com.joker.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @RequestMapping("/j1")
    @ResponseBody            //不会走视图解析器，会直接返回一个字符串
     public String json1() throws JsonProcessingException {
        //jackson,  ObjectMapper

        //创建一个对象
        User user = new User("张三",3,"男");

        return JsonUtils.getJson(user);
    }

}
