import model.Materiel;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * @����ʱ�䣺2021/4/15
 * @����
 */
public class test {
    public static void main(String[] args) {
        Materiel obj = null;
        String[] datas ={"1","2"};
        try {
            obj = Materiel.class.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Field[] fields =Materiel.class.getDeclaredFields();
        for (Field field:fields){
            System.out.println(field);
        }
       // Materiel p=(Materiel)getInstance();
    }
}
