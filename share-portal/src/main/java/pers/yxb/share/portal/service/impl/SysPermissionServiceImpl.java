package pers.yxb.share.portal.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pers.yxb.share.portal.dao.SysPermissionDao;
import pers.yxb.share.portal.service.SysPermissionService;

import java.util.Set;

/**
 * @desc:
 * @author: yuxb
 * @date 2020-02-17
 */
@Component
public class SysPermissionServiceImpl implements SysPermissionService {

    @Autowired
    private SysPermissionDao sysPermissionDao;

    @Override
    public Set<String> findPermissionsByUsername(String username) {
        return sysPermissionDao.findPermissionsByUsername(username);
    }
}
