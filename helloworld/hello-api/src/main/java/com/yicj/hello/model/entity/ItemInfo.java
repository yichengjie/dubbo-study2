package com.yicj.hello.model.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商品信息表
 * </p>
 *
 * @author yicj
 * @since 2020-10-02
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ItemInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 商品编码
     */
    private String code;
    /**
     * 名称
     */
    private String name;
    /**
     * 销售价
     */
    private BigDecimal price;
    /**
     * 是否有效（1=是；0=否）
     */
    private Integer isActive;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
}
