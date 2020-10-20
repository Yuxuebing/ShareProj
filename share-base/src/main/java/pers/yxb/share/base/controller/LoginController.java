package pers.yxb.share.base.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;
import pers.yxb.share.base.entity.Result;
import pers.yxb.share.base.entity.SysUser;
import pers.yxb.share.base.result.ResultFactory;
import pers.yxb.share.base.service.SysUserService;


/**
 * @Auther yuxb_mios
 * @Date 2020/10/13 0013
 * @Version
 * @Describe
 */
@RestController
public class LoginController {
    private static Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    SysUserService sysUserService;

    @CrossOrigin
    @PostMapping(value = "api/login")
    public Result login(@RequestBody SysUser requestUser) {
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username); // 对 html 标签进行转义，防止 XSS 攻击
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(username, requestUser.getPassword());
        try {
            subject.login(usernamePasswordToken);
            return ResultFactory.buildSuccessResult(username);
        } catch (AuthenticationException e) {
            String message = "账号密码错误";
            return ResultFactory.buildFailResult(message);
        }
    }

    @GetMapping("api/logout")
    public Result logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        String message = "成功登出";
        return ResultFactory.buildSuccessResult(message);
    }
}
