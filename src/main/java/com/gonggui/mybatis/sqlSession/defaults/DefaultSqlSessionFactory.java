package com.gonggui.mybatis.sqlSession.defaults;

import com.gonggui.mybatis.cfg.Configuration;
import com.gonggui.mybatis.sqlSession.SqlSession;
import com.gonggui.mybatis.sqlSession.SqlSessionFactory;

/**
 * Created by zhaochen on 2019-10-14.
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory{
    private Configuration cfg;

    public DefaultSqlSessionFactory(Configuration cfg){
        this.cfg = cfg;
    }
    public SqlSession openSession() {
        return new DefaultSqlSession(cfg);
    }
}
