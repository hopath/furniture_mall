package com.hopath.furns.dao.impl;

import com.hopath.furns.dao.BasicDAO;
import com.hopath.furns.dao.MemberDAO;
import com.hopath.furns.entity.Member;

import java.sql.SQLException;

/**
 * @author 张志伟
 * @version 1.0
 */
public class MemberDAOImpl extends BasicDAO<Member> implements MemberDAO {
    @Override
    public Member queryMemberByUsername(String username) throws SQLException {
        String sql = "select* from member where username=?";
        return querySingle(sql, Member.class, username);
    }

    @Override
    public Member queryMemberByUsernameAndPassword(String username, String password) throws SQLException {
        String sql = "select* from member where username=? and password=md5(?)";
        return querySingle(sql, Member.class, username, password);
    }

    @Override
    public int saveMember(Member member) throws SQLException {
        String sql = "insert into member values(?, ?, md5(?), ?)";
        return update(sql, null, member.getUsername(), member.getPassword(), member.getEmail());
    }
}
