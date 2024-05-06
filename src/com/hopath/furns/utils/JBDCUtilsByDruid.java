package com.hopath.furns.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author 张志伟
 * @version 1.0
 */
public class JBDCUtilsByDruid {
    private static DataSource dataSource;
    //在静态代码块完成 ds初始化
    static {
        Properties properties = new Properties();
        try {
            //properties.load(new FileInputStream("src\\druid.properties"));
            //老韩解读
            //1.目前我们是javaweb方式启动
            //2. 所以要获取src目录下的文件，需要使用类加载器
            properties.load(com.hopath.furns.utils.JBDCUtilsByDruid.class.getClassLoader()
                    .getResourceAsStream("druid.properties"));
            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection() throws SQLException {
        return dataSource.getConnection();
    }

    public static void close(ResultSet set, Statement statement, Connection connection) throws SQLException {
        if(set != null){
            set.close();
        }

        if(statement != null){
            statement.close();
        }

        if(connection != null){
            connection.close();
        }
    }

}
