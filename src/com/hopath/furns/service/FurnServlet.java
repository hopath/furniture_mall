package com.hopath.furns.service;

import com.hopath.furns.entity.Furn;

import java.util.List;

/**
 * @author 张志伟
 * @version 1.0
 */
public interface FurnServlet {
    public boolean addFurn(Furn furn);

    public boolean deleteFurn(Furn furn);

    public boolean updateFurn(Furn furn);

    public boolean isExistName(String name);

    public List<Furn> getAllFurn();
}
