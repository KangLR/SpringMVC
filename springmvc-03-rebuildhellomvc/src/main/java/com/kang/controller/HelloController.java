package com.kang.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author klr
 * @create 2020-03-20-16:51
 */
public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();

        //业务代码  先假设是业务返回过来得
        String result="HelloSpringMVC";

        //封装对象
        //addObject是个键值对
        //@Nullable表示可以为空
        mv.addObject("msg",result);


        //视图跳转，设置视图的名字就行了
        mv.setViewName("test");

        //然后把ModelAndView返回给视图解析器去做了
        return mv;
    }
}
