package com.kang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author klr
 * @create 2020-03-20-19:00
 */
@Controller
public class RestFulController {

    //原来的：http://localhost:8080/add?a=2&b=3
//    @RequestMapping("/add")
//    public String add(int a, int b, Model model){
//        int res=a+b;
//        model.addAttribute("msg","结果为"+res);
//        return "restful";
//    }

    //RestFul:http://localhost:8080/add/a/b
    //跟传参似的，一一对应
    //http://localhost:8080/add/1/2
    //get方式
//    @RequestMapping("/add/{a}/{b}")
//    public String add(@PathVariable int a,@PathVariable int b, Model model){
//        int res=a+b;
//        model.addAttribute("msg","结果为"+res);
//        return "restful";
//    }

//    //限定delete方式，结果会失败
//    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
//    public String add(@PathVariable int a,@PathVariable int b, Model model){
//        int res=a+b;
//        model.addAttribute("msg","结果为"+res);
//        return "restful";
//    }

    //用getmapper，与上面一起用浏览器就懵了，要避免这种情况
    @GetMapping(value = "/add/{a}/{b}")
    public String add1(@PathVariable int a,@PathVariable int b, Model model){
        int res=a+b;
        model.addAttribute("msg","结果为"+res);
        return "restful";
    }
}
