package com.gonggui.test;

import com.gonggui.dao.Mapper;
import com.gonggui.domain.User;
import com.gonggui.mybatis.io.Resources;
import com.gonggui.mybatis.sqlSession.SqlSession;
import com.gonggui.mybatis.sqlSession.SqlSessionFactory;
import com.gonggui.mybatis.sqlSession.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by zhaochen on 2019-10-13.
 */
public class MybatisTest {
    public static void main(String[] args) throws IOException {
        //读取XML文件
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        //根据xml文件创建sqlsessionFactory
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        //创建sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建mapper对象执行
        Mapper mapper = (Mapper)sqlSession.getMapper(Mapper.class);
        List<User> users = mapper.findAll();
        for(User user : users){
            System.out.println(user);
        }
        //释放流资源
        sqlSession.close();
        inputStream.close();
    }
}
