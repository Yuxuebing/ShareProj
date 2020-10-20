package pers.yxb.share.base.controller;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.HtmlUtils;
import pers.yxb.share.base.entity.Result;
import pers.yxb.share.base.entity.SysUser;
import pers.yxb.share.base.result.ResultFactory;
import pers.yxb.share.base.service.SysUserService;

/**
 * @Auther yuxb_mios
 * @Date 2020/10/16 0016
 * @Version
 * @Describe
 */
@RestController
@RequestMapping(value = "/sysUser")
public class SysUserController {

    @Autowired
    SysUserService sysUserService;

    @PostMapping("api/register")
    public Result register(@RequestBody SysUser sysUser) {
        String username = sysUser.getUsername();
        username = HtmlUtils.htmlEscape(username);
        sysUser.setUsername(username);
        boolean exist = sysUserService.selectUserByName(username) == null ? false : true;
        if (exist) {
            String message = "用户名已被使用";
            return ResultFactory.buildFailResult(message);
        }
        sysUserService.insertUser(sysUser);
        return ResultFactory.buildSuccessResult(sysUser);
    }
}

