package com.kang.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kang.pojo.User;
import com.kang.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author klr
 * @create 2020-03-21-11:06
 */
@RestController
//@Controller
public class JsonController {
    @RequestMapping("/j1")
//    @ResponseBody//它就不会走视图解析器(也就是不会转发任何jsp页面)，会直接返回一个字符串
    //把User对象转化成JSON字符串输出给前端
    public String json1(){
        User user=new User(1,"康",21);

        return user.toString();
    }
    //结果：User(id=1, name=kang, age=21)



    //用JSON实现，但一定要解决乱码
    //解决乱码，用produces属性设置编码格式为utf-8
        @RequestMapping(value = "/j2",produces = "application/json;charset=utf-8")
        @ResponseBody
    public String json2() throws JsonProcessingException {
        User user=new User(1,"康",21);

        //jackson  ObjectMapper
        ObjectMapper objectMapper=new ObjectMapper();
        String str=objectMapper.writeValueAsString(user);
        return str;
    }
    //结果：{"id":1,"name":"?","age":21}
    //2：{"id":1,"name":"康","age":21}


    @RequestMapping("j3")
    public String json3() throws JsonProcessingException {
        Date date=new Date();
        return JsonUtils.getJson(date,"YYYY-MM-DD HH:MM:ss");
    }

    @RequestMapping("j4")
    public String json4() throws JsonProcessingException {
        List<User> users=new ArrayList<>();
        User user1=new User(1,"康",21);
        User user2=new User(2,"柳",21);
        User user3=new User(3,"荣",21);
        User user4=new User(4,"号",21);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        return JsonUtils.getJson(users);
    }

}
