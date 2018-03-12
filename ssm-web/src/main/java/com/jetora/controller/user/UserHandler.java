package com.jetora.controller.user;

import com.jetora.pojo.User;
import com.jetora.service.user.UserService;
import com.jetora.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserHandler {
    @Autowired
    UserService userService ;
    @RequestMapping(value = "/getUserById",method = {RequestMethod.POST,RequestMethod.GET})
    public String getUserById(HttpServletRequest request,Model model){
        //参数
        Integer userId = StringUtils.notNull(request.getParameter("userId"))?Integer.parseInt(request.getParameter("userId")):1;
        User user = userService.getUserById(userId);
        model.addAttribute("user",user);
        return "test";
    }
}
