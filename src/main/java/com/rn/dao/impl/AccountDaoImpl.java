package com.rn.dao.impl;

import com.rn.dao.AccountDao;
import com.rn.domain.Account;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Created by level on 2019/12/23.
 */
public class AccountDaoImpl implements AccountDao{
    DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * 实现账户查找
     * @param accountId
     * @return
     */
    public Account findAccountById(Integer accountId) {
       /* //1.注册驱动
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        Class.forName("com.mysql.jdbc.Driver");
        //2.获取连接
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eesy","root","1234");
        //3.获取操作数据库的预处理对象
        PreparedStatement pstm = conn.prepareStatement("select * from account");
        //4.执行SQL，得到结果集*/

        System.out.println("找到了。。。。。");
        return null;
    }
}
