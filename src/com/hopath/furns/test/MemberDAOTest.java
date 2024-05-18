package com.hopath.furns.test;

import com.hopath.furns.dao.impl.MemberDAOImpl;
import com.hopath.furns.entity.Member;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

/**
 * @author 张志伟
 * @version 1.0
 */
public class MemberDAOTest {
    @Test
    public void queryMemberByUsernameTest() throws SQLException {
        MemberDAOImpl memberDAO = new MemberDAOImpl();
        Member member = memberDAO.queryMemberByUsername("zzw");
        System.out.println(member);
    }

    @Test
    public void queryMemberByUsernameAndPasswordTest() throws SQLException {
        MemberDAOImpl memberDAO = new MemberDAOImpl();
        Member member = memberDAO.queryMemberByUsernameAndPassword("zzw", "123456");
        System.out.println(member);
    }

    @Test
    public void saveMemberTest() throws SQLException {
        Member member = new Member("zzw", "123456", "hopath@outlook.com");
        MemberDAOImpl memberDAO = new MemberDAOImpl();
        int i = memberDAO.saveMember(member);
        if(i == 0){
            System.out.println("添加失败...");
        }else{
            System.out.println("添加成功...");
        }
    }
}
