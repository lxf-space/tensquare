package com.lxf.base.pojo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 标签实体类
 */
@Entity
@Table(name = "tb_label")
@Data
public class Label {
    @Id
    private String id;//标签id
    private String labelname;//标签名称
    private String state;//标签状态 ，   0：无效 1：有效
    private Long count;//使用数量
    private Long fans;//关注数
    private String recommend;//是否推荐 ，0：不推荐 1:推荐

}
