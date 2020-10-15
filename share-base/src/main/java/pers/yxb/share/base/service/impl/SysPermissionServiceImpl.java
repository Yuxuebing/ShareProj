package pers.yxb.share.base.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.yxb.share.base.dao.SysPermissionDao;
import pers.yxb.share.base.service.SysPermissionService;

import java.util.Set;

/**
 * @desc:
 * @author: yuxb
 * @date 2020-02-17
 */
@Service
public class SysPermissionServiceImpl implements SysPermissionService {

    @Autowired
    private SysPermissionDao sysPermissionDao;

    @Override
    public Set<String> findPermissionsByUsername(String username) {
        return sysPermissionDao.findPermissionsByUsername(username);
    }
}
