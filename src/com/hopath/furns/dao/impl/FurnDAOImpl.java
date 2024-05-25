package com.hopath.furns.dao.impl;

import com.hopath.furns.dao.BasicDAO;
import com.hopath.furns.dao.FurnDAO;
import com.hopath.furns.entity.Furn;

import java.sql.SQLException;
import java.util.List;

/**
 * @author 张志伟
 * @version 1.0
 */
public class FurnDAOImpl extends BasicDAO<Furn> implements FurnDAO {
    @Override
    public int add(Furn furn) throws SQLException {
        String sql = "insert into furn values(?, ?, ?, ?, ?, ?)";
        return update(sql, null, furn.getName(), furn.getMaker(),
                furn.getPrice(),furn.getSales(), furn.getStock());
    }

    @Override
    public int delete(Furn furn) {
        return 0;
    }

    @Override
    public int update(Furn furn) {
        return 0;
    }

    @Override
    public Furn selectByName(String name) throws SQLException {
        String sql = "select* from furn where name = ?";
        return querySingle(sql, Furn.class, name);
    }

    @Override
    public List<Furn> getAll() {
        return null;
    }

}
