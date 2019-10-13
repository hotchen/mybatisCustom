package com.gonggui.mybatis.sqlSession;

/**
 * Created by zhaochen on 2019-10-13.
 */
public interface SqlSessionFactory {
    /**
     * 用于打开一个新的SqlSession对象
     * @return
     */
    SqlSession openSession();
}
