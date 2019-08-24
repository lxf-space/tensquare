package com.lxf.entity;

import lombok.Data;

import java.util.List;

/**
 * 分页结果返回实体类
 * @param <T>
 */
@Data
public class PageResult<T> {
    private long total;//总条数
    private List<T> rows;//返回的结果集合

    public PageResult(long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }
}
