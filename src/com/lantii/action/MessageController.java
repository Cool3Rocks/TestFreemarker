package com.lantii.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// Cool3Rocks@GmAil.CoM
// 2013-5-9

@Controller  
@RequestMapping("/message")  
// urlӳ�������  
public class MessageController {  
  
    @RequestMapping(value = "/{msg}", method = RequestMethod.GET)  
    public String showMessage(@PathVariable String msg,  
            HttpServletRequest request, HttpServletResponse response) {  
        // TODO ��������  
        request.setAttribute("message", msg); // ���÷�����Ϣ  
        return "message"; // ���÷���ҳ�棬�����Ӧ /WEB-INF/view Ŀ¼�µ� message.ftl �ļ�  
    }  
  
    @RequestMapping(value = "/add")  
    public String addMessage(HttpServletRequest request, HttpServletResponse response) {  
        request.setAttribute("message", "message is added");  
        return "message";  
  
    }  
}  
