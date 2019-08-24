package com.lxf.base.service.impl;

import com.lxf.base.dao.LabelDao;
import com.lxf.base.pojo.Label;
import com.lxf.base.service.LabelService;
import com.lxf.utils.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 标签模块的CRUD实现类
 */
@Service
public class LabelServiceImpl implements LabelService {

    @Autowired
    private LabelDao labelDao;

    @Autowired
    private IdWorker idWorker;

    /**
     * 增
     */
    @Override
    public void save(Label label) {
        label.setId(idWorker.nextId()+"");//设置id
        labelDao.save(label);
    }

    /**
     * 删
     * @param id
     */
    @Override
    public void delete(String id) {
        labelDao.deleteById(id);
    }

    /**
     * 改
     * @param label
     */
    @Override
    public void update(Label label) {
        labelDao.save(label);
    }

    /**
     * 查一个
     * @param id
     * @return
     */
    @Override
    public Label findByPK(String id) {
        return labelDao.findById(id).get();
    }

    /**
     * 查所有
     * @return
     */
    @Override
    public List<Label> findAll() {
        return labelDao.findAll();
    }
}
