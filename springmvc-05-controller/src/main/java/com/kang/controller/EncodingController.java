package com.kang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author klr
 * @create 2020-03-21-9:13
 */
@Controller
public class EncodingController {

    //过滤器解决乱码
    @RequestMapping("/e/t1")
    public String test1(String name, Model model){
        //输入中文会发现乱码了

        //在这里就乱码了
        System.out.println(name);

        model.addAttribute("msg",name);
        return "restful";
    }
}
