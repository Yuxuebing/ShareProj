package pers.yxb.share.base.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;
import pers.yxb.share.base.entity.Result;
import pers.yxb.share.base.entity.SysUser;
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
        // 对 html 标签进行转义，防止 XSS 攻击
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        SysUser sysUser = sysUserService.selectUserByName(username);
        if (null == sysUser) {
            String message = "账号密码错误";
            logger.info(message);
            logger.warn(message);
            logger.error(message);
            System.out.println("test");
            return new Result(400, "", null);
        } else {
            return new Result(200, "", null);
        }
    }
}
