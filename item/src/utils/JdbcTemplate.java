package utils;

import model.Materiel;

import java.sql.*;
import java.util.List;

/**
 * @创建时间：2021/4/7
 * @描述 数据库操作样板，连接查询，关闭连接等，返回相应的数据
 */
public class JdbcTemplate {
    private JdbcTemplate(){
    }
    /**
     * 查询方法
     */
    public static List queryList(String sql) throws Exception {
        Connection connection = JdbcUtils.getConnection();
        //这边出现，return数据返回两次，先return 后执行finally再执行一次查询返回return.定义一个参数接收
        List resultSet = null;
        //获取sql执行对象
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            //resultset.next一定要在数据库连接的情况下使用.所以这边处理
            long startTime = System.currentTimeMillis();//获取开始时间
            resultSet= new BeanHandler(Materiel.class).listhandle(preparedStatement.executeQuery());
//            resultSet=new ResultToBeanUtil().getList(Materiel.class, preparedStatement.executeQuery());
            long endTime = System.currentTimeMillis();//获取结束时间
            System.out.println("数据库查询处理" + (endTime - startTime) + "毫秒");//输出程序运行时间
        }finally {
            JdbcUtils.releaseConnection(connection);
        }
        return resultSet;
    }
    public static String queryJson(String sql) throws Exception {
        Connection connection = JdbcUtils.getConnection();
        //这边出现，return数据返回两次，先return 后执行finally再执行一次查询返回return.定义一个参数接收
        String resultSet = null;
        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            //resultset.next一定要在数据库连接的情况下使用.所以这边处理
            resultSet= new BeanHandler(Materiel.class).jsonhandle(preparedStatement.executeQuery());
        }finally {
            JdbcUtils.releaseConnection(connection);
        }
        return resultSet;
    }
    public static int queryCount(String sql) throws Exception{
        long startTime = System.currentTimeMillis();//获取开始时间
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
        long endTime = System.currentTimeMillis();//获取结束时间
        System.out.println("查询数据总量" + (endTime - startTime) + "毫秒");//输出程序运行时间
        return count;
    }
}
