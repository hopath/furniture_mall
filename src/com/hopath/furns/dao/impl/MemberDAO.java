package com.hopath.furns.dao.impl;

import com.hopath.furns.dao.BasicDAO;
import com.hopath.furns.entity.Member;
import com.sun.org.apache.xerces.internal.xni.parser.XMLErrorHandler;

import java.sql.SQLException;

/**
 * @author 张志伟
 * @version 1.0
 */
public class MemberDAO extends BasicDAO<Member> implements com.hopath.furns.dao.MemberDAO {
    @Override
    public Member queryMemberByUsername(String username) throws SQLException {
        String sql = "select* from member where username = ?";
        return querySingle(sql, Member.class, username);
    }

    @Override
    public int saveMember(Member member) throws SQLException {
        String sql = "insert into member values(?, ?, ?, ?)";
        int i = update(sql, null, member.getUsername(), member.getPassword(), member.getEmail());
        return i;

    }
}
