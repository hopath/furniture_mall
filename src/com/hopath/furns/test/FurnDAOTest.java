package com.hopath.furns.test;

import com.hopath.furns.dao.impl.FurnDAOImpl;
import com.hopath.furns.entity.Furn;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

/**
 * @author 张志伟
 * @version 1.0
 */
public class FurnDAOTest {
    FurnDAOImpl furnDAO = new FurnDAOImpl();

    @Test
    public void testAddFurn() throws SQLException {
        BigDecimal bigDecimal = new BigDecimal(180);
        Furn furn = new Furn("南非风格小桌子", "老虎家居", bigDecimal, 666, 7,
                "assets/images/product-image/5.jpg");
        System.out.println(furnDAO.add(furn));
    }

    @Test
    public void testGetAll() throws SQLException {
        List<Furn> all = furnDAO.getAll();
        for (Furn furn : all) {
            System.out.println(furn);
        }

    }
}
