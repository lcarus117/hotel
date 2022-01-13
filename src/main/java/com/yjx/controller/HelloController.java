package com.yjx.controller;

import com.yjx.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class HelloController {
    @RequestMapping("hello")
    public String sayIndex(String msg, Model model){
        model.addAttribute("msg",msg);
        return "list";
    }
    @RequestMapping("login")
    public String login(User user, HttpSession session){
        if ("zhangsan".equals(user.getUname()) && "123".equals(user.getPwd())){
            //成功，存储
            session.setAttribute("user",user);
            return "list";
        }else {
            return "forward:login.jsp?msg=登录失败";
        }

    }

}
