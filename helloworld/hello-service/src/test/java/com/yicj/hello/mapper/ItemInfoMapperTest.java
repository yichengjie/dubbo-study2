package com.yicj.hello.mapper;

import com.yicj.hello.model.entity.ItemInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@Slf4j
@SpringBootTest
@RunWith(SpringRunner.class)
public class ItemInfoMapperTest {

    @Autowired
    private ItemInfoMapper itemInfoMapper ;

    @Test
    public void testSelect(){
        log.info("-------------- selectAll method test ------------");
        List<ItemInfo> itemInfos = itemInfoMapper.selectList(null);
        itemInfos.forEach(System.out::println);
    }
}
