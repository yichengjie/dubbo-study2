package com.yicj.hello.model.entity;

import lombok.Data;
import java.util.Date;

@Data
public class ItemInfo {
    private String id ;
    private String code ;
    private String name ;
    private Double price ;
    private Integer isActive ;
    private Date createTime ;
    private Date updateTime ;
}
