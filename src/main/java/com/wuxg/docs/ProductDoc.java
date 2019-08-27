package com.wuxg.docs;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.wltea.analyzer.lucene.IKAnalyzer;

/**
 * @author wuxianguang
 * es文档对象
 */
@Document(indexName = "wu_test",type = "product")
public class ProductDoc {

    @Id
    private Long id;
    /**
     * 整合的name字段，包括商品名称，品牌名称，商品类型
     */
    @Field(type = FieldType.Text,analyzer = "ik_max_word")
    private String name;
    @Field(type = FieldType.Long)
    private Long price;
    @Field(type = FieldType.Keyword)
    private String desc;
    @Field(index = false, type = FieldType.Keyword)
    private String imgUrl;
}
