package com.es.test;

import com.es.pojo.Item;
import com.es.service.ItemService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @program: crawler
 * @description: ESTest
 * @author: wenlongzhou
 * @create: 2019-06-22 15:08
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class ESTest {

    @Autowired
    private ItemService itemService;

    @Autowired
    private ElasticsearchTemplate elasticsearchTemplate;

    //创建索引和映射
    @Test
    public void createIndex() {
        this.elasticsearchTemplate.createIndex(Item.class);
        this.elasticsearchTemplate.putMapping(Item.class);
    }

    //新增
    //修改
    //删除
    //批量保存

}
