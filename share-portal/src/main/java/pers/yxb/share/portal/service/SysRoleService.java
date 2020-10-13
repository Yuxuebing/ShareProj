package pers.yxb.share.portal.service;

import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @desc:
 * @author: yuxb
 * @date 2020-02-17
 */
public interface SysRoleService {
    Set<String> getRolesByUserName(String username);
}
