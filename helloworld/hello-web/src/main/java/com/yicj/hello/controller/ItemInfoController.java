package com.yicj.hello.controller;

import com.yicj.hello.model.entity.ItemInfo;
import com.yicj.hello.service.IItemInfoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemInfoController {

    @DubboReference(version = "1.0.0")
    private IItemInfoService itemInfoService ;

    @GetMapping("/listAll")
    public List<ItemInfo> listAll(){
        List<ItemInfo> list = itemInfoService.list(null);
        return list ;
    }
}
