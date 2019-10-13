package com.gonggui.mybatis.cfg;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by zhaochen on 2019-10-13.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mapper {
    private String queryString;//SQL
    private String resultType;//实体类的全限定类名
}
