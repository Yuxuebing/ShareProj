package pers.yxb.share.portal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pers.yxb.share.portal.dao.SysRoleDao;
import pers.yxb.share.portal.service.SysRoleService;

import java.util.Set;

/**
 * @desc:
 * @author: yuxb
 * @date 2020-02-17
 */
@Component
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleDao sysRoleDao;

    @Override
    public Set<String> getRolesByUserName(String username) {
        return sysRoleDao.getRolesByUserName(username);
    }
}
