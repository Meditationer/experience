package utils;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

/**
 * @创建时间：2021/4/15
 * @描述
 */
public class ResultToBeanUtil<T> {
    public List<T> getList(Class<T> clazz, ResultSet rs){
        Field[] fields = clazz.getDeclaredFields();//获取字段
        List<T> list = new ArrayList<T>();//结果
        try {
            while (rs.next()){
                T t = clazz.newInstance();//实列化
                for (Field field:fields){//字段包含修饰符数据类型，bean中
                    String name = field.getName();//光名字
                    //String getField = "get" + name.substring(0, 1).toUpperCase() + name.substring(1); 这个是首字母大写
                    boolean flag = field.isAccessible();
                    field.setAccessible(true);//安全检查，关闭了安全检查
                    field.set(t,rs.getObject(name));//Field属性设置新值value
                    field.setAccessible(flag);
                }
                list.add(t);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
