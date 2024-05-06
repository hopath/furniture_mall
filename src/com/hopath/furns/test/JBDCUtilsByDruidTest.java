package com.hopath.furns.test;

import com.hopath.furns.dao.impl.MemberDAO;
import com.hopath.furns.entity.Member;
import com.hopath.furns.utils.JBDCUtilsByDruid;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;


/**
 * @author 张志伟
 * @version 1.0
 */
public class JBDCUtilsByDruidTest {
    @Test
    public void getConnection() throws SQLException {
        Connection connection = JBDCUtilsByDruid.getConnection();
        System.out.println(connection);
        JBDCUtilsByDruid.close(null, null, connection);
    }

}
