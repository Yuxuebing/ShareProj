package pers.yxb.share.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.yxb.share.base.dao.SysRoleDao;
import pers.yxb.share.base.service.SysRoleService;

import java.util.Set;

/**
 * @desc:
 * @author: yuxb
 * @date 2020-02-17
 */
@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    private SysRoleDao sysRoleDao;

    @Override
    public Set<String> getRolesByUserName(String username) {
        return sysRoleDao.getRolesByUserName(username);
    }
}
