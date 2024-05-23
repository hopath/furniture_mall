package com.hopath.furns.dao;


import com.hopath.furns.entity.Admin;
import com.hopath.furns.entity.Member;

import java.sql.SQLException;

/**
 * @author 张志伟
 * @version 1.0
 */
public interface AdminDAO {
    /**
     * 通过用户名查询Mysql，返回Admin对象
     * @param username
     * @return
     */
    public Admin queryMemberByUsername(String username) throws SQLException;

    /**
     * 通过用户名和密码查询Mysql，返回Admin对象
     * @param username
     * @return
     */
    public Admin queryMemberByUsernameAndPassword(String username, String password) throws SQLException;
    /**
     * 将Admin对象保存到Mysql中
     * @param admin
     * @return
     */
    public int saveMember(Admin admin) throws SQLException;

}
