package com.gonggui.dao;

import com.gonggui.domain.User;

import java.util.List;

/**
 * Created by zhaochen on 2019-10-13.
 */
public interface Mapper {
    /**
     * 查询所有
     */
    List<User> findAll();
}
