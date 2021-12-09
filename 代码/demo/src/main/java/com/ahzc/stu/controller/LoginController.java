package com.ahzc.stu.controller;

import com.ahzc.stu.service.IAdminService;
import com.ahzc.stu.vo.ResultBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @version 1.0
 * @Author ZC
 * @date 2021/12/5 20:59
 * @desc
 */
@Controller
public class LoginController {
    @Autowired
    private IAdminService adminService;

    @RequestMapping(value = {"","index"})
    public String indexUI(){
        return "login";
    }

    /**
     * 登录接口
     * @param username 账号
     * @param password 密码
     * @return resultbean
     */
    @GetMapping("login")
    @ResponseBody
    public ResultBean login(String username, String password){
        return adminService.loginVerify(username, password);
    }
}
