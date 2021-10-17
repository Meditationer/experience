package utils;

import java.sql.ResultSet;
import java.lang.reflect.Field;

/**
 * @创建时间：2021/4/7
 * @描述 bean实体处理。将数据库数据映射为java bean
 */
abstract class ResultSetHandler {
    abstract Object handle(ResultSet resultSet) throws Exception;
    Object buildObject(ResultSet resultSet, Class<?> clazz) throws Exception {
        //对于forName是要求jvm查找加载指定的类，如果有静态初始化器的话会执行。 newInstance()是实例话
        Object bean = clazz.newInstance();
        //获取申明字段，即public private protected
        Field[] fields = clazz.getDeclaredFields();
        // 封装数据  每列数据的字段名称
        for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i ++) {
            Object value = resultSet.getObject(i);
            //匹配实体类中对应的属性  bean实体的数据字段循环
            for (Field field : fields) {
                //replaceAll支持正则 .replaceAll("_","")  .toLowerCase()
                if (resultSet.getMetaData().getColumnLabel(i).equals(field.getName())) {
                    //
                    boolean flag = field.isAccessible();
                    field.setAccessible(true);
                    field.set(bean, value);//Field属性设置新值value
                    field.setAccessible(flag);
                    break;
                }
            }
        }
        return bean;
    }
}
