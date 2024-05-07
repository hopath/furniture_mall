package com.hopath.furns.service.impl;

import com.hopath.furns.dao.impl.MemberDAO;
import com.hopath.furns.entity.Member;

import java.sql.SQLException;

/**
 * @author 张志伟
 * @version 1.0
 */
public class MemberService implements com.hopath.furns.service.MemberService {
    @Override
    public void registerMember(Member member) {

    }

    @Override
    public void isExistUsername(String username) {

    }

    @Override
    public Member login(Member member) throws SQLException {
        Member resMember =
                new MemberDAO().queryMemberByUsernameAndPassword(member.getUsername(), member.getPassword());
        return resMember;
    }
}
