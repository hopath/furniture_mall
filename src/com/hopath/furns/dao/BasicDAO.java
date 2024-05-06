package com.hopath.furns.dao;

import com.hopath.furns.utils.JBDCUtilsByDruid;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * @author 张志伟
 * @version 1.0
 */
public class BasicDAO<T>{
    private QueryRunner queryRunner = new QueryRunner();

    public int update(String sql, Object...parameters) throws SQLException {
        Connection connection = null;
        try {
            connection = JBDCUtilsByDruid.getConnection();
            return queryRunner.update(connection, sql, parameters);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            JBDCUtilsByDruid.close(null, null, connection);
        }
    }

    public List<T> queryMulti(String sql, Class<T> clazz, Object...parameters) throws SQLException {
        Connection connection = null;
        try {
            connection = JBDCUtilsByDruid.getConnection();
            return queryRunner.query(connection, sql, new BeanListHandler<>(clazz), parameters);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            JBDCUtilsByDruid.close(null, null, connection);
        }
    }

    public T querySingle(String sql, Class<T> clazz, Object...parameters) throws SQLException {
        Connection connection = null;
        try {
            connection = JBDCUtilsByDruid.getConnection();
            return queryRunner.query(connection, sql, new BeanHandler<>(clazz), parameters);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            JBDCUtilsByDruid.close(null, null, connection);
        }
    }

    public Object queryScalar(String sql, Object...parameters) throws SQLException {
        Connection connection = null;
        try {
            connection = JBDCUtilsByDruid.getConnection();
            return queryRunner.query(connection, sql, new ScalarHandler(), parameters);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            JBDCUtilsByDruid.close(null, null, connection);
        }
    }

}
