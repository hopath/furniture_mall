package com.hopath.furns.service;

import com.hopath.furns.entity.Admin;

import java.sql.SQLException;

/**
 * @author 张志伟
 * @version 1.0
 */
public interface AdminService {
    /**
     * 根据web层传入的信息构建Admin对象，并将其传入DB
     * @param admin
     */
    public boolean registerMember(Admin admin) throws SQLException;

    //判断DB中是否存在传入的username
    public boolean isExistUsername(String username) throws SQLException;

    /**
     * 判断传入的Admin在DB中是否存在
     * @param admin
     * @return 存在返回对应Admin对象,不存在返回null
     */
    public Admin login(Admin admin) throws SQLException;
}
