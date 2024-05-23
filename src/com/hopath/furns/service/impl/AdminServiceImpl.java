package com.hopath.furns.service.impl;

import com.hopath.furns.dao.impl.AdminDAOImpl;
import com.hopath.furns.entity.Admin;
import com.hopath.furns.service.AdminService;

import java.sql.SQLException;

/**
 * @author 张志伟
 * @version 1.0
 */
public class AdminServiceImpl implements AdminService {
    AdminDAOImpl adminDAO = new AdminDAOImpl();

    @Override
    public boolean registerMember(Admin admin) throws SQLException {
        return adminDAO.saveMember(admin) != 0;
    }

    @Override
    public boolean isExistUsername(String username) throws SQLException {
        return adminDAO.queryMemberByUsername(username) != null;
    }

    @Override
    public Admin login(Admin admin) throws SQLException {
        Admin resAdmin =
                adminDAO.queryMemberByUsernameAndPassword(admin.getUsername(), admin.getPassword());
        return resAdmin;
    }
}
