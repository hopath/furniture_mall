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
        String sql = "insert into furn values(?, ?, ?, ?, ?, ?, ?)";
        return update(sql, null, furn.getName(), furn.getMaker(),
                furn.getPrice(),furn.getSales(), furn.getStock(), furn.getImgPath());
    }

    @Override
    public int delete(Furn furn) throws SQLException {
        String sql = "delete from furn where name = ?";
        return update(sql, furn.getName());
    }

    @Override
    public int update(Furn furn, String name) throws SQLException {
        String sql = "update furn set name = ?, maker = ?, " +
                "price = ?, sales = ?, stock = ? where name = ?";
        return update(sql, furn.getName(), furn.getMaker(), furn.getPrice(), furn.getSales(), furn.getStock(),
                name);
    }

    @Override
    public Furn selectByName(String name) throws SQLException {
        String sql = "select* from furn where name = ?";
        return querySingle(sql, Furn.class, name);
    }

    /**
     * 返回家具信息的集合
     * @return
     * @throws SQLException
     */
    @Override
    public List<Furn> getAll() throws SQLException {
        String sql = "select * from furn";
        return queryMulti(sql, Furn.class);
    }
}
