package factory;

import java.io.InputStream;
import java.util.Properties;
/**
 * @����ʱ�䣺2021/4/7
 * @���� ��service.properties����ʵ�л�
 */
public class ServiceFactory {
    private ServiceFactory(){
    }
    private static Properties properties;
    static {
        InputStream inputStream = DaoFactory.class.getClassLoader().getResourceAsStream("service.properties");
        properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    public static Object getService(String serviceName){
        try {
            return Class.forName(properties.getProperty(serviceName)).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            return null;
        }
    }

}
