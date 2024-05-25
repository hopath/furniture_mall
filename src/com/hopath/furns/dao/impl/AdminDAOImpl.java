package com.hopath.furns.dao.impl;

import com.hopath.furns.dao.AdminDAO;
import com.hopath.furns.dao.BasicDAO;
import com.hopath.furns.entity.Admin;

import java.sql.SQLException;

/**
 * @author 张志伟
 * @version 1.0
 */
public class AdminDAOImpl extends BasicDAO<Admin> implements AdminDAO {
    @Override
    public Admin queryMemberByUsername(String username) throws SQLException {
        String sql = "select* from admin where username=?";
        return querySingle(sql, Admin.class, username);
    }

    @Override
    public Admin queryMemberByUsernameAndPassword(String username, String password) throws SQLException {
        String sql = "select* from admin where username=? and password=md5(?)";
        return querySingle(sql, Admin.class, username, password);
    }

    @Override
    public int saveMember(Admin admin) throws SQLException {
        String sql = "insert into admin values(?, ?, md5(?))";
        return update(sql, null, admin.getUsername(), admin.getPassword());
    }
}
