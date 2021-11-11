package utils;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;
import java.sql.Connection;

/**
 * @创建时间：2021/4/7
 * @描述 数据库管理开启关闭，控制数据安全访问
 */
public class JdbcUtils {
    private static ComboPooledDataSource dataSource = new ComboPooledDataSource();
    public static QueryRunner qr = new QueryRunner(dataSource);
    private static ThreadLocal<Connection> threadLocal = new ThreadLocal<>();
    public static Connection getConnection() throws SQLException {
        Connection transactionConnection = threadLocal.get();
        if (transactionConnection!=null){
            return transactionConnection;
        }
        return dataSource.getConnection();
    }

    /**
     * 开启事务
     */
    public static void beginTransaction() throws SQLException {
        Connection transactionConnection = threadLocal.get();
        if (transactionConnection!=null){
            throw new SQLException("事务已开启");
        }
        transactionConnection = getConnection();
        transactionConnection.setAutoCommit(false);
        threadLocal.set(transactionConnection);
    }

    /**
     * 提交事务
     */
    public static void commitTransaction() throws SQLException {
        Connection transactionConnection = threadLocal.get();
        if (transactionConnection==null){
            throw new SQLException("事务未开启");
        }
        transactionConnection.commit();
        transactionConnection.close();
        threadLocal.remove();
    }

    /**
     * 回滚事务
     */
    public static void rollbackTransaction() throws SQLException {
        Connection transactionConnection = threadLocal.get();
        if (transactionConnection==null){
            throw new SQLException("事务未开启");
        }
        transactionConnection.rollback();
        transactionConnection.close();
        threadLocal.remove();
    }

    /**
     * 释放连接资源
     */
    public static void releaseConnection(Connection connection) throws SQLException {
        if (threadLocal.get()==null){
            connection.close();
            return;
        }
        if (connection!=threadLocal.get()){
            connection.close();
        }
    }
}
