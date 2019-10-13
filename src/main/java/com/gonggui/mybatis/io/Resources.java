package com.gonggui.mybatis.io;

import java.io.InputStream;

/**
 * Created by zhaochen on 2019-10-13.
 */
public class Resources {
    /**
     * 根据传入的参数，获取一个字节输入流
     * @param resource
     * @return
     */
    public static InputStream getResourceAsStream(String resource){
        return Resources.class.getClassLoader().getResourceAsStream(resource);
    }
}
