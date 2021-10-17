package dao;

import java.util.List;

/**
 * @创建时间：2021/4/7
 * @描述 定义基本的增删改查
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
