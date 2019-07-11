package com.casit.boot.controller;

import com.casit.boot.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class loginController {

    @PostMapping("/login")
    public String login(User user, Map<String,Object> map, HttpServletRequest request){
        if("".equals(user.getPassword())){
            map.put("msg","登录失败");
            return "index";
        }
        User SessionUser=new User();
        SessionUser.setPassword(user.getPassword());
        SessionUser.setUserName(user.getUserName());
        request.getSession().setAttribute("user",SessionUser);
        return "redirect:/category";
    }
}
