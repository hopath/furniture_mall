package com.hopath.furns.dao;

import com.hopath.furns.entity.Furn;

/**
 * @author 张志伟
 * @version 1.0
 */
public interface FurnDAO {

    public int add(Furn furn);

    public int delete(Furn furn);

    public int update(Furn furn);

    public Furn selectByName(String name);
}
