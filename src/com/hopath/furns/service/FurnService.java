package com.hopath.furns.service;

import com.hopath.furns.entity.Furn;

import java.sql.SQLException;
import java.util.List;

/**
 * @author 张志伟
 * @version 1.0
 */
public interface FurnService {
    public boolean addFurn(Furn furn) throws SQLException;

    public boolean deleteFurn(Furn furn) throws SQLException;

    public boolean updateFurn(Furn furn, String name) throws SQLException;

    public boolean isExistName(String name) throws SQLException;

    public List<Furn> getAllFurn() throws SQLException;
}
