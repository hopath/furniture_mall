package com.hopath.furns.test;

import com.hopath.furns.entity.Member;
import com.hopath.furns.service.impl.MemberServiceImpl;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

/**
 * @author 张志伟
 * @version 1.0
 */
public class MemberServiceTest {
    MemberServiceImpl memberService = new MemberServiceImpl();

    @Test
    public void registerMemberTest() throws SQLException {
        boolean ww =
                memberService.registerMember(new Member("ww", "123456", "ok@outlook.com"));
        System.out.println(ww);
    }

    @Test
    public void isExistUsernameTest() throws SQLException {
        boolean zzw = memberService.isExistUsername("zss");
        System.out.println(zzw);
    }

    @Test
    public void loginTest() throws SQLException {
        Member member = new Member("zzw", "123456");
        Member login = memberService.login(member);
        System.out.println(login);
    }
}
