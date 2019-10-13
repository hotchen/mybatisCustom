package com.gonggui.mybatis.sqlSession;

import com.gonggui.mybatis.cfg.Configuration;
import com.gonggui.mybatis.sqlSession.defaults.DefaultSqlSessionFactory;
import com.gonggui.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 * Created by zhaochen on 2019-10-13.
 */
public class SqlSessionFactoryBuilder {
    /**
     * 根据参数传入的字节流创建sqlsessionfactory
     */
    public SqlSessionFactory build(InputStream config){
        Configuration cfg = XMLConfigBuilder.loadConfiguration(config);
        return  new DefaultSqlSessionFactory(cfg);
    }
}
