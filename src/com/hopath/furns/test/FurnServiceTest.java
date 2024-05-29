package com.hopath.furns.test;

import com.hopath.furns.entity.Furn;
import com.hopath.furns.service.impl.FurnServiceImpl;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.List;

/**
 * @author 张志伟
 * @version 1.0
 */
public class FurnServiceTest {
    FurnServiceImpl furnService = new FurnServiceImpl();

    @Test
    public void testGetAllFurn() throws SQLException {
        List<Furn> allFurn = furnService.getAllFurn();
        for (Furn furn : allFurn) {
            System.out.println(furn);
        }
    }

}
