package com.kang.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author klr
 * @create 2020-03-20-11:31
 */
//导入Controller接口
public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //ModelAndView 模型和视图  不用写servlet了
        ModelAndView mv=new ModelAndView();

        //调用业务，但我们现在没有

        //封装对象，放在ModelAndView中的Model
        mv.addObject("msg","HelloSpringMVC");

        //封装要跳转的视图，放在ModelAndView中
        mv.setViewName("hello");    //在/WEB-INF/jsp/hello.jsp
        return mv;
    }
}
