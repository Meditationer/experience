package factory;

import java.io.InputStream;
import java.util.Properties;

/**
 * @创建时间：2021/4/7
 * @描述 dao.properties进行实列化
 */
public class DaoFactory {
    private DaoFactory() {
    }
    private static Properties properties;
    static {
        //获取资源文件输入流
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
