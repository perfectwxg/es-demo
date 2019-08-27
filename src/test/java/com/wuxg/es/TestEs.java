package com.wuxg.es;

import com.wuxg.App;
import com.wuxg.docs.ProductDoc;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class TestEs {

    @Autowired
   private ElasticsearchTemplate esTemplate;

    @Test
    public void testCreateIndex(){
        boolean index = esTemplate.createIndex(ProductDoc.class);

    }

}
