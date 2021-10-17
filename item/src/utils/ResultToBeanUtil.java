package utils;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

/**
 * @����ʱ�䣺2021/4/15
 * @����
 */
public class ResultToBeanUtil<T> {
    public List<T> getList(Class<T> clazz, ResultSet rs){
        Field[] fields = clazz.getDeclaredFields();//��ȡ�ֶ�
        List<T> list = new ArrayList<T>();//���
        try {
            while (rs.next()){
                T t = clazz.newInstance();//ʵ�л�
                for (Field field:fields){//�ֶΰ������η��������ͣ�bean��
                    String name = field.getName();//������
                    //String getField = "get" + name.substring(0, 1).toUpperCase() + name.substring(1); ���������ĸ��д
                    boolean flag = field.isAccessible();
                    field.setAccessible(true);//��ȫ��飬�ر��˰�ȫ���
                    field.set(t,rs.getObject(name));//Field����������ֵvalue
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
