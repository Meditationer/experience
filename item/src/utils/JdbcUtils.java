package utils;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;
import java.sql.Connection;

/**
 * @����ʱ�䣺2021/4/7
 * @���� ���ݿ�������رգ��������ݰ�ȫ����
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
     * ��������
     */
    public static void beginTransaction() throws SQLException {
        Connection transactionConnection = threadLocal.get();
        if (transactionConnection!=null){
            throw new SQLException("�����ѿ���");
        }
        transactionConnection = getConnection();
        transactionConnection.setAutoCommit(false);
        threadLocal.set(transactionConnection);
    }

    /**
     * �ύ����
     */
    public static void commitTransaction() throws SQLException {
        Connection transactionConnection = threadLocal.get();
        if (transactionConnection==null){
            throw new SQLException("����δ����");
        }
        transactionConnection.commit();
        transactionConnection.close();
        threadLocal.remove();
    }

    /**
     * �ع�����
     */
    public static void rollbackTransaction() throws SQLException {
        Connection transactionConnection = threadLocal.get();
        if (transactionConnection==null){
            throw new SQLException("����δ����");
        }
        transactionConnection.rollback();
        transactionConnection.close();
        threadLocal.remove();
    }

    /**
     * �ͷ�������Դ
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
