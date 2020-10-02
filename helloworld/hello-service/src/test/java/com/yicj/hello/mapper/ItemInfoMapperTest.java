package com.yicj.hello.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yicj.hello.model.entity.ItemInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class ItemInfoMapperTest {

    @Resource
    private ItemInfoMapper itemInfoMapper ;

    @Test
    public void testSelect(){
        log.info("-------------- selectAll method test ------------");
        List<ItemInfo> itemInfos = itemInfoMapper.selectList(null);
        itemInfos.forEach(System.out::println);
    }

    @Test
    public void testSelectPage(){
        IPage<ItemInfo> page = new Page<>(1,2) ;
        //参数一是当前页，参数二是每页个数
        IPage<ItemInfo> itemInfoIPage = itemInfoMapper.selectPage(page, null);
        List<ItemInfo> records = itemInfoIPage.getRecords();
        records.forEach(item -> log.info("====> item : {}", item));
    }
}
