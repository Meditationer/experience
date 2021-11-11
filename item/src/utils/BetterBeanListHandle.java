package utils;

import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @����ʱ�䣺2021/11/2
 * @����
 */

public class BetterBeanListHandle<T> extends BeanListHandler<T> {
    private Class<T> clazz;
    public BetterBeanListHandle(Class<T> type) {
        super(type);
        this.clazz=type;
    }
    @Override
    public List<T> handle(ResultSet rs) throws SQLException {
        List<T> list = new ArrayList<T>();
        T obj = null;
        try {
            while (rs.next()) {
                obj = clazz.newInstance();
                Field[] fs = clazz.getDeclaredFields();
                for (Field f : fs) {
                    f.setAccessible(true);
                    Column column = f.getAnnotation(Column.class);
                    if (column!=null) {
                        String columnName = column.value();
                        Object columnValue = rs.getObject(columnName);
                        f.set(obj, columnValue);
                    }

                }
                list.add(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
