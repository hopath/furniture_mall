package com.hopath.furns.service.impl;

import com.hopath.furns.dao.FurnDAO;
import com.hopath.furns.dao.impl.FurnDAOImpl;
import com.hopath.furns.entity.Furn;
import com.hopath.furns.service.FurnServlet;

import java.sql.SQLException;
import java.util.List;

/**
 * @author 张志伟
 * @version 1.0
 */
public class FurnServletImpl implements FurnServlet {
    FurnDAOImpl furnDAO = new FurnDAOImpl();

    @Override
    public boolean addFurn(Furn furn) throws SQLException {
        return furnDAO.add(furn) != 0;
    }

    @Override
    public boolean deleteFurn(Furn furn) {
        return false;
    }

    @Override
    public boolean updateFurn(Furn furn) {
        return false;
    }

    @Override
    public boolean isExistName(String name) throws SQLException {
        return furnDAO.selectByName(name) != null;
    }

    @Override
    public List<Furn> getAllFurn() {
        return null;
    }
}
