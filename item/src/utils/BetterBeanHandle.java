package utils;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.commons.dbutils.handlers.BeanHandler;
/**
 * @����ʱ�䣺2021/11/2
 * @����
 */
public class BetterBeanHandle<T> extends BeanHandler<T>{
    private Class<T> calzz;
    public BetterBeanHandle(Class<T> type) {
        super(type);
        this.calzz=type;
    }
    @Override
    public T handle(ResultSet rs) throws SQLException {
        Field[] fields = calzz.getDeclaredFields();//�����ȡ�ֶ�����
        T t=null;
        try {
            if (rs.next()) {
                //���������������ݣ������½�һ������
                t = calzz.newInstance();
                //�����������ӳ�䵽�����ÿ����ע����ֶ���
                for (Field field : fields) {
                    field.setAccessible(true);
                    //��ȡע���ֶ�
                    Column column = field.getAnnotation(Column.class);
                   // �жϸ��ֶ��Ƿ���ע�⣬����У��Ż�ȡ��ֵ��Ҳ�����ѯ���������ݣ����û���ڶ����ֶ�дע�⣬�ǲ���ӳ��ģ���Ҳ������
                    if (column!=null) {
                        //��ȡע��ֵ��ҵ�����ֶ���
                        String colVal = column.value();
                        //Ϊ��������ֵ��ֵ��rs.getObject(colVal)��ʾ�ӽ�����в�ѯ����������Ӧ��ֵ��
                        field.set(t, rs.getObject(colVal));
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return t;
    }
}
