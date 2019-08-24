package com.lxf.base.service;

import com.lxf.base.pojo.Label;

import java.util.List;

/**
 * 标签模块的CRUD接口
 */
public interface LabelService {
    //增
    public void save(Label label);
    //删
    public void delete(String id);
    //改
    public void update(Label label);
    //查一个
    public Label findByPK(String id);
    //查所有
    public List<Label> findAll();
}
