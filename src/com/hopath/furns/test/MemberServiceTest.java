package com.hopath.furns.test;

import com.hopath.furns.entity.Member;
import com.hopath.furns.service.impl.MemberService;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

/**
 * @author 张志伟
 * @version 1.0
 */
public class MemberServiceTest {
    @Test
    public void loginTest() throws SQLException {
        MemberService memberService = new MemberService();
        Member member = new Member("zzw", "123456");
        Member login = memberService.login(member);
        System.out.println(login);
    }
}
