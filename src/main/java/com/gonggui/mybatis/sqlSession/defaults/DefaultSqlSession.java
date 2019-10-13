package com.gonggui.mybatis.sqlSession.defaults;

import com.gonggui.mybatis.cfg.Configuration;
import com.gonggui.mybatis.sqlSession.SqlSession;
import com.gonggui.mybatis.sqlSession.proxy.MapperProxy;
import com.gonggui.utils.DataSourceUtil;

import java.lang.reflect.Proxy;
import java.sql.Connection;

/**
 * Created by zhaochen on 2019-10-14.
 */
public class DefaultSqlSession implements SqlSession{
    private Configuration cfg;
    private Connection connection;

    public DefaultSqlSession(Configuration cfg){
        this.cfg = cfg;
        connection = DataSourceUtil.getConnection(cfg);
    }

    public <T> T getMapper(Class<T> daoInterfaceClass) {
        return (T) Proxy.newProxyInstance(
                daoInterfaceClass.getClassLoader(),
                new Class[]{daoInterfaceClass},new MapperProxy(cfg.getMappers(),connection));
    }

    public void close() {

    }
}
