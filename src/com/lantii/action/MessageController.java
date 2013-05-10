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
// url映射的名称  
public class MessageController {  
  
    @RequestMapping(value = "/{msg}", method = RequestMethod.GET)  
    public String showMessage(@PathVariable String msg,  
            HttpServletRequest request, HttpServletResponse response) {  
        // TODO 处理请求  
        request.setAttribute("message", msg); // 设置返回消息  
        return "message"; // 设置返回页面，这里对应 /WEB-INF/view 目录下的 message.ftl 文件  
    }  
  
    @RequestMapping(value = "/add")  
    public String addMessage(HttpServletRequest request, HttpServletResponse response) {  
        request.setAttribute("message", "message is added");  
        return "message";  
  
    }  
}  
