package utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @����ʱ�䣺2021/4/7
 * @���� �����ݿ�����ݽ��и�ʽ�������ཫ����Դ����Ϊjava bean�����ｫjavabean����Ϊ��Ҫ�ĸ�ʽ
 * �����Ǵ������ֶ�����
 */
public class BeanHandler extends ResultSetHandler{
    private Class<?> clazz;
    public BeanHandler(Class<?> clazz){
        this.clazz = clazz;
    }
    @Override
    public Object handle(ResultSet resultSet) throws Exception {
        if (resultSet.next()){
            return buildObject(resultSet, clazz);
        }else {
            return null;
        }
    }
    /**
     ���󷽷�
     */
    public List listhandle(ResultSet resultSet) throws Exception {
        long startTime = System.currentTimeMillis();//��ȡ��ʼʱ��
        List list = new ArrayList();
        while(resultSet.next()) {
            Object bean = buildObject(resultSet, clazz);
            list.add(bean);
        }
        long endTime = System.currentTimeMillis();//��ȡ����ʱ��
        System.out.println("list��������" + (endTime - startTime) + "����");//�����������ʱ��
        return list;
    }
    public String jsonhandle(ResultSet resultSet) throws Exception {
        List list = new ArrayList();
        int i=0;
        //resultset.nextһ��Ҫ�����ݿ����ӵ������ʹ��
        while(resultSet.next()) {
            Object bean = buildObject(resultSet, clazz);
            list.add(bean);
            i++;
        }
        System.out.println(i);
        ObjectMapper mapper = new ObjectMapper();
        String rsJson = null;
        try {
            //�Ѷ���ת��Ϊjson�ַ���
            rsJson = mapper.writeValueAsString(list);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return rsJson;
    }
}
