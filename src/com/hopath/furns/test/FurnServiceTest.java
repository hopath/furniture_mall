package com.hopath.furns.test;

import com.hopath.furns.entity.Furn;
import com.hopath.furns.service.impl.FurnServiceImpl;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

/**
 * @author 张志伟
 * @version 1.0
 */
public class FurnServiceTest {
    FurnServiceImpl furnService = new FurnServiceImpl();

    @Test
    public void testAddFurn() throws SQLException {
        BigDecimal bigDecimal = new BigDecimal(180);
        Furn furn = new Furn("南非风格小桌子", "老虎家居", bigDecimal, 666, 7,
                "assets/images/product-image/5.jpg");
        furnService.addFurn(furn);
    }
    @Test
    public void testGetAllFurn() throws SQLException {
        List<Furn> allFurn = furnService.getAllFurn();
        for (Furn furn : allFurn) {
            System.out.println(furn);
        }
    }

}
