package com.hopath.furns.service;

import com.hopath.furns.entity.Member;

import java.sql.SQLException;

/**
 * @author 张志伟
 * @version 1.0
 */
public interface MemberService {
    /**
     * 根据web层传入的信息构建Member对象，并将其传入DB
     * @param member
     */
    public boolean registerMember(Member member) throws SQLException;

    //判断DB中是否存在传入的username
    public boolean isExistUsername(String username) throws SQLException;

    /**
     * 判断传入的Member在DB中是否存在
     * @param member
     * @return 存在返回对应Member对象,不存在返回null
     */
    public Member login(Member member) throws SQLException;
}
