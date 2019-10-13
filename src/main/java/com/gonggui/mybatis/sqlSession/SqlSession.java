package com.gonggui.mybatis.sqlSession;

/**
 * Created by zhaochen on 2019-10-13.
 */
public interface SqlSession {
    /**
     * 根据参数创建一个代理对象
     */
    <T> T getMapper(Class<T> daoInterfaceClass);

    /**
     * 释放资源
     */
    void close();
}
