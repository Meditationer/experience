package factory;

import java.io.InputStream;
import java.util.Properties;

/**
 * @����ʱ�䣺2021/4/7
 * @���� dao.properties����ʵ�л�
 */
public class DaoFactory {
    private DaoFactory() {
    }
    private static Properties properties;
    static {
        //��ȡ��Դ�ļ�������
        InputStream inputStream = DaoFactory.class.getClassLoader().getResourceAsStream("dao.properties");
        properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    public static Object getDao(String daoName){
        try {
            return Class.forName(properties.getProperty(daoName)).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            return null;
        }
    }
}
