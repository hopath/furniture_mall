package com.hopath.furns.service.impl;

import com.hopath.furns.dao.MemberDAO;
import com.hopath.furns.dao.impl.MemberDAOImpl;
import com.hopath.furns.entity.Member;
import com.hopath.furns.service.MemberService;

import java.sql.SQLException;

/**
 * @author 张志伟
 * @version 1.0
 */
public class MemberServiceImpl implements MemberService {
    private MemberDAOImpl memberDAO = new MemberDAOImpl();

    @Override
    public boolean registerMember(Member member) throws SQLException {
        return memberDAO.saveMember(member) != 0;
    }

    @Override
    public boolean isExistUsername(String username) throws SQLException {
        return memberDAO.queryMemberByUsername(username) != null;
    }

    @Override
    public Member login(Member member) throws SQLException {
        Member resMember =
                memberDAO.queryMemberByUsernameAndPassword(member.getUsername(), member.getPassword());
        return resMember;
    }
}
