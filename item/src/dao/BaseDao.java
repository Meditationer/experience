package dao;

import java.util.List;

/**
 * @����ʱ�䣺2021/4/7
 * @���� �����������ɾ�Ĳ�
 */
public interface BaseDao<T> {
    default T getAll() throws Exception {
        return null;
    }
    default T getById(Integer id) throws Exception {
        return null;
    }
    default int deleteById(Integer id) throws Exception {
        return 0;
    }
    default int insert(T t) throws Exception {
        return 0;
    }
    default int update(T t) throws Exception {
        return 0;
    }
}
