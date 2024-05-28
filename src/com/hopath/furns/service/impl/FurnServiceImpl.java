package com.hopath.furns.service.impl;

import com.hopath.furns.dao.impl.FurnDAOImpl;
import com.hopath.furns.entity.Furn;
import com.hopath.furns.service.FurnService;

import java.sql.SQLException;
import java.util.List;

/**
 * @author 张志伟
 * @version 1.0
 */
public class FurnServiceImpl implements FurnService {
    FurnDAOImpl furnDAO = new FurnDAOImpl();

    @Override
    public boolean addFurn(Furn furn) throws SQLException {
        return furnDAO.add(furn) != 0;
    }

    @Override
    public boolean deleteFurn(Furn furn) throws SQLException {
        return furnDAO.delete(furn) != 0;
    }

    @Override
    public boolean updateFurn(Furn furn, String name) throws SQLException {
        return furnDAO.update(furn, name) != 0;
    }

    @Override
    public boolean isExistName(String name) throws SQLException {
        return furnDAO.selectByName(name) != null;
    }

    @Override
    public List<Furn> getAllFurn() throws SQLException {
        return furnDAO.getAll();
    }
}
