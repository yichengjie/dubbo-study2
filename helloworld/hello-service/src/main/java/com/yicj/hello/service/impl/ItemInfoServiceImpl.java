package com.yicj.hello.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yicj.hello.mapper.ItemInfoMapper;
import com.yicj.hello.model.entity.ItemInfo;
import com.yicj.hello.service.IHelloService;
import com.yicj.hello.service.IItemInfoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息表 服务实现类
 * </p>
 *
 * @author yicj
 * @since 2020-10-02
 */
@DubboService(version = "${service.version}" , interfaceClass = IItemInfoService.class)
public class ItemInfoServiceImpl extends ServiceImpl<ItemInfoMapper, ItemInfo> implements IItemInfoService {

}
