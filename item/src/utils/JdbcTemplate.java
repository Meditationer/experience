package utils;

import model.Materiel;

import java.sql.*;
import java.util.List;

/**
 * @����ʱ�䣺2021/4/7
 * @���� ���ݿ�������壬���Ӳ�ѯ���ر����ӵȣ�������Ӧ������
 */
public class JdbcTemplate {
    private JdbcTemplate(){
    }
    /**
     * ��ѯ����
     */
    public static List queryList(String sql) throws Exception {
        Connection connection = JdbcUtils.getConnection();
        //��߳��֣�return���ݷ������Σ���return ��ִ��finally��ִ��һ�β�ѯ����return.����һ����������
        List resultSet = null;
        //��ȡsqlִ�ж���
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            //resultset.nextһ��Ҫ�����ݿ����ӵ������ʹ��.������ߴ���
            long startTime = System.currentTimeMillis();//��ȡ��ʼʱ��
            resultSet= new BeanHandler(Materiel.class).listhandle(preparedStatement.executeQuery());
//            resultSet=new ResultToBeanUtil().getList(Materiel.class, preparedStatement.executeQuery());
            long endTime = System.currentTimeMillis();//��ȡ����ʱ��
            System.out.println("���ݿ��ѯ����" + (endTime - startTime) + "����");//�����������ʱ��
        }finally {
            JdbcUtils.releaseConnection(connection);
        }
        return resultSet;
    }
    public static String queryJson(String sql) throws Exception {
        Connection connection = JdbcUtils.getConnection();
        //��߳��֣�return���ݷ������Σ���return ��ִ��finally��ִ��һ�β�ѯ����return.����һ����������
        String resultSet = null;
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            //resultset.nextһ��Ҫ�����ݿ����ӵ������ʹ��.������ߴ���
            resultSet= new BeanHandler(Materiel.class).jsonhandle(preparedStatement.executeQuery());
        }finally {
            JdbcUtils.releaseConnection(connection);
        }
        return resultSet;
    }
    public static int queryCount(String sql) throws Exception{
        long startTime = System.currentTimeMillis();//��ȡ��ʼʱ��
        Connection connection = JdbcUtils.getConnection();
        int count = -1;
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            try(ResultSet resultSet = preparedStatement.executeQuery()){
                if (resultSet.next()){
                    count= resultSet.getInt(1);
                }
            }
        }finally {
            JdbcUtils.releaseConnection(connection);
        }
        long endTime = System.currentTimeMillis();//��ȡ����ʱ��
        System.out.println("��ѯ��������" + (endTime - startTime) + "����");//�����������ʱ��
        return count;
    }
}
