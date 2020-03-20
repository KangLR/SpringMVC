package com.kang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author klr
 * @create 2020-03-20-17:38
 */

@Controller
@RequestMapping("/good")
public class HelloController {
    //当注解到类时，就相当于 //localhost:8080/应用名/good/hello   相当于给该类下的方法加了一层路径
    //一种父子关系
    @RequestMapping("/hello")
    public String hello(Model model){
        //封装数据
        model.addAttribute("msg","Hello,SpringMVCAnnotation!");


        return "hello";//会被视图解析器处理，拼接成XXX.jsp,被渲染出来
    }

    //要写多个映射，就多写几个方法，改个名字，不用写一堆servlet了
//    @RequestMapping("/hello")
//    public String hello12(Model model){
//        //封装数据
//        model.addAttribute("msg","Hello,SpringMVCAnnotation!");
//
//
//        return "hello12";//会被视图解析器处理，拼接成XXX12.jsp,被渲染出来
//    }

}
