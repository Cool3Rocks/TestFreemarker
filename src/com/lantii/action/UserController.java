package com.lantii.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lantii.business.User;

// Cool3Rocks@GmAil.CoM
// 2013-5-9

@Controller  
@RequestMapping("/user")  
public class UserController {  
    @RequestMapping(value = "/login")  
    public String test(HttpServletRequest request,  
            HttpServletResponse response, User userinfo) { // �ǳ��������ֱ���ڷ�������������  
        if (userinfo.getUsername().equals("lantii")  
                && userinfo.getPassword().equals("ok")) {  
            request.setAttribute("userinfo", userinfo);  
            return "users/loginok"; // �жϣ�����ת��ͬ��ҳ��  
        } else {  
            return "users/loginerr"; // �жϣ�����ת��ͬ��ҳ��  
        }  
    }  
} 
