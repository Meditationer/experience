package utils;

import java.sql.ResultSet;
import java.lang.reflect.Field;

/**
 * @����ʱ�䣺2021/4/7
 * @���� beanʵ�崦�������ݿ�����ӳ��Ϊjava bean
 */
abstract class ResultSetHandler {
    abstract Object handle(ResultSet resultSet) throws Exception;
    Object buildObject(ResultSet resultSet, Class<?> clazz) throws Exception {
        //����forName��Ҫ��jvm���Ҽ���ָ�����࣬����о�̬��ʼ�����Ļ���ִ�С� newInstance()��ʵ����
        Object bean = clazz.newInstance();
        //��ȡ�����ֶΣ���public private protected
        Field[] fields = clazz.getDeclaredFields();
        // ��װ����  ÿ�����ݵ��ֶ�����
        for (int i = 1; i <= resultSet.getMetaData().getColumnCount(); i ++) {
            Object value = resultSet.getObject(i);
            //ƥ��ʵ�����ж�Ӧ������  beanʵ��������ֶ�ѭ��
            for (Field field : fields) {
                //replaceAll֧������ .replaceAll("_","")  .toLowerCase()
                if (resultSet.getMetaData().getColumnLabel(i).equals(field.getName())) {
                    //
                    boolean flag = field.isAccessible();
                    field.setAccessible(true);
                    field.set(bean, value);//Field����������ֵvalue
                    field.setAccessible(flag);
                    break;
                }
            }
        }
        return bean;
    }
}
