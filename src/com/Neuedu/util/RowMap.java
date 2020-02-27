package com.neuedu.util;

import java.sql.ResultSet;

/**
 * Create by Jia on 2020/2/27/027 15:59
 */
public interface RowMap<T> {
    T rowMapping(ResultSet rs);
}
