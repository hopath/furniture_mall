package com.hopath.furns.dao;

import com.hopath.furns.entity.Furn;

import java.sql.SQLException;
import java.util.List;

/**
 * @author 张志伟
 * @version 1.0
 */
public interface FurnDAO {

    public int add(Furn furn) throws SQLException;

    public int delete(Furn furn) throws SQLException;

    public int update(Furn furn, String name) throws SQLException;

    public Furn selectByName(String name) throws SQLException;

    public List<Furn> getAll() throws SQLException;
}
