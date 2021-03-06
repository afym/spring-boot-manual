package com.afym.manual.doc03.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class CustomErrorController implements ErrorController {

    private final static String ERROR = "/error";
    private final static String CUSTOM_ERROR = "customError";
    private final ErrorAttributes errorAttributes;

    @Autowired
    public CustomErrorController(ErrorAttributes errorAttributes) {
        this.errorAttributes = errorAttributes;
    }

    @RequestMapping(ERROR)
    public String error(Model model,HttpServletRequest request) {

        Map<String,Object> error = getErrorAttributes(request, true);
        model.addAttribute("timestamp", error.get("timestamp"));
        model.addAttribute("status", error.get("status"));
        model.addAttribute("error", error.get("error"));
        model.addAttribute("message", error.get("message"));
        model.addAttribute("path", error.get("path"));

        return CUSTOM_ERROR;
    }

    @RequestMapping("/404")
    public String pageNotFound(Model model,HttpServletRequest request){
        model.addAttribute("error", getErrorAttributes(request,true));
        return "404";
    }

    @Override
    public String getErrorPath() {
        return ERROR;
    }

    private Map<String, Object> getErrorAttributes(HttpServletRequest request, boolean includeStackTrace) {
        WebRequest requestAttributes = new ServletWebRequest(request);
        return this.errorAttributes.getErrorAttributes(requestAttributes, includeStackTrace);
    }
}