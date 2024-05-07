package com.hopath.furns.dao;

import com.hopath.furns.entity.Member;

import java.sql.SQLException;

/**
 * @author 张志伟
 * @version 1.0
 */
public interface MemberDAO {
    /**
     * 通过用户名查询Mysql，返回Member对象
     * @param username
     * @return
     */
    public Member queryMemberByUsername(String username) throws SQLException;

    /**
     * 通过用户名和密码查询Mysql，返回Member对象
     * @param username
     * @return
     */
    public Member queryMemberByUsernameAndPassword(String username, String password) throws SQLException;
    /**
     * 将Member对象保存到Mysql中
     * @param member
     * @return
     */
    public int saveMember(Member member) throws SQLException;

}
