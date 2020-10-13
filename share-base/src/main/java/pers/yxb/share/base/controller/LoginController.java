package pers.yxb.share.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;
import pers.yxb.share.base.entity.Result;
import pers.yxb.share.base.entity.SysUser;

import java.util.Objects;

/**
 * @Auther yuxb_mios
 * @Date 2020/10/13 0013
 * @Version
 * @Describe
 */
@Controller
public class LoginController {
    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody SysUser requestUser) {
        // 对 html 标签进行转义，防止 XSS 攻击
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);

        if (!Objects.equals("admin", username) || !Objects.equals("123456", requestUser.getPassword())) {
            String message = "账号密码错误";
            System.out.println("test");
            return new Result(400, "", null);
        } else {
            return new Result(200, "", null);
        }
    }
}
