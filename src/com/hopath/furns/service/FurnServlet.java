package com.hopath.furns.service;

import com.hopath.furns.entity.Furn;

import java.sql.SQLException;
import java.util.List;

/**
 * @author 张志伟
 * @version 1.0
 */
public interface FurnServlet {
    public boolean addFurn(Furn furn) throws SQLException;

    public boolean deleteFurn(Furn furn);

    public boolean updateFurn(Furn furn);

    public boolean isExistName(String name) throws SQLException;

    public List<Furn> getAllFurn();
}
