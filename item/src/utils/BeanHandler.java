package utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @创建时间：2021/4/7
 * @描述 对数据库的数据进行格式处理，父类将数据源处理为java bean，这里将javabean处理为需要的格式
 * 父类是处理单条字段数据
 */
public class BeanHandler extends ResultSetHandler{
    private Class<?> clazz;
    public BeanHandler(Class<?> clazz){
        this.clazz = clazz;
    }
    @Override
    public Object handle(ResultSet resultSet) throws Exception {
        if (resultSet.next()){
            return buildObject(resultSet, clazz);
        }else {
            return null;
        }
    }
    /**
     抽象方法
     */
    public List listhandle(ResultSet resultSet) throws Exception {
        long startTime = System.currentTimeMillis();//获取开始时间
        List list = new ArrayList();
        while(resultSet.next()) {
            Object bean = buildObject(resultSet, clazz);
            list.add(bean);
        }
        long endTime = System.currentTimeMillis();//获取结束时间
        System.out.println("list处理数据" + (endTime - startTime) + "毫秒");//输出程序运行时间
        return list;
    }
    public String jsonhandle(ResultSet resultSet) throws Exception {
        List list = new ArrayList();
        int i=0;
        //resultset.next一定要在数据库连接的情况下使用
        while(resultSet.next()) {
            Object bean = buildObject(resultSet, clazz);
            list.add(bean);
            i++;
        }
        System.out.println(i);
        ObjectMapper mapper = new ObjectMapper();
        String rsJson = null;
        try {
            //把对象转换为json字符串
            rsJson = mapper.writeValueAsString(list);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return rsJson;
    }
}
