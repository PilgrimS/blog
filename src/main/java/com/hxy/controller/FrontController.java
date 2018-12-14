package com.hxy.controller;

import com.hxy.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author hexy
 * @date 2018/12/1316:48
 */
@Controller
//@RequestMapping("/front")
public class FrontController extends BaseController{

    @Autowired
    private IAdminBlogService mBlogService;


    @GetMapping("/error")
    public String pErrorPage(HttpServletRequest request, Model model) {
        return "error";
    }

    @GetMapping("/index")
    public String pFrontIndex(HttpServletRequest request, Model model) {
        return "index";
    }

    @PostMapping("/index")
    public String pFrontIndexPost(HttpServletRequest request, Model model) {
        return "index";
    }

    /**
     * 前台用户登录页
     */
    @GetMapping("/user-login")
    public String pFrontUserLogin(HttpServletRequest request, Model model) {
        return "userlogin";
    }

    /**
     * 前台用户注册
     */
    @GetMapping("/user-register")
    public String pFrontUserRegister(HttpServletRequest request, Model model) {
        return "register";
    }
}
