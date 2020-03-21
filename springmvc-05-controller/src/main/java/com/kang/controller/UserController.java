package com.kang.controller;

import com.kang.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author klr
 * @create 2020-03-21-8:37
 */
@Controller
public class UserController {
    //参数传递不用像以前一样req.getParameter("age")，现在直接与参数一一映射，不一样可以用@RequestParam
    //localhost:8080/user/t1?name=XXX       name跟参数一样可以直接接收到
    @RequestMapping("/user/t1")
    //貌似url的参数名不能带数字，如name1
    public String test1(@RequestParam("username") String name, Model model){
        //1.接收前端参数
        System.out.println("接收到前端的参数");
        //2.将返回的结果传递给前端，就用Model
        model.addAttribute("msg",name);

        //3.由视图解析器跳转
        return "restful";
    }



    //前端接收的是一个对象：id name age
    //localhost:8080/user/t2?id=1&name=kang&age=21
    /*
    * 1.接收前端用户传递的参数，判断参数的名字，假设名字直接在方法上，可以直接使用
    * 2.假设传递的是一个对象User，匹配User对象中的字段名，如果名字一致则OK，否则，匹配不到
    * */

    @RequestMapping("/user/t2")
    public String test2(User user){
        //在后台看一下
        System.out.println(user);
        return "restful";
    }


    //Model继承了ModelMap,ModelMap继承了LinkedModelMap


}
