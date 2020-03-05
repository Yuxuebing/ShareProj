package pers.yxb.share.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @desc:
 * @author: yuxb
 * @date 2020-02-16
 */
@Controller
public class SysUserController {
    @RequestMapping("/admin/config")
    public void adminConfig() {
        System.out.println("dddddd");
    }
}
