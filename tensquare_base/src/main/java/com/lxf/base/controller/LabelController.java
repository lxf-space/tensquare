package com.lxf.base.controller;

import com.lxf.base.pojo.Label;
import com.lxf.base.service.LabelService;
import com.lxf.constants.StatusCode;
import com.lxf.entity.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 标签模块的CRUD的controller
 */
@RestController
@RequestMapping("/label")
public class LabelController {

    @Autowired
    private LabelService labelService;

    /**
     * 增
     * @param label
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public Result save(@RequestBody Label label){
        labelService.save(label);
        return new Result(true, StatusCode.OK,"添加标签成功");
    }

    /**
     * 根据id删除
     * @param labelId
     * @return
     */
    @RequestMapping(value = "/{labelId}" , method = RequestMethod.DELETE)
    public Result delete(@PathVariable String labelId){
        labelService.delete(labelId);
        return new Result(true,StatusCode.OK,"删除标签成功");
    }

    /**
     * 修改
     * @param labelId
     * @param label
     * @return
     */
    @RequestMapping(value = "/{labelId}",method = RequestMethod.PUT)
    public Result update(@PathVariable String labelId,@RequestBody Label label){
        label.setId(labelId);
        labelService.update(label);
        return new Result(true,StatusCode.OK,"修改标签成功");
    }

    /**
     * 查一个
     * @param labelId
     * @return
     */
    @RequestMapping(value = "/{labelId}",method = RequestMethod.GET)
    public Result findByPK(@PathVariable String labelId){
        Label label = labelService.findByPK(labelId);
        return new Result(true,StatusCode.OK,"查询标签成功",label);
    }

    /**
     * 查所有
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public Result findAll(){
        List<Label> labelList = labelService.findAll();
//        int i=1/0;
        return new Result(true,StatusCode.OK,"查询标签成功",labelList);
    }

}
