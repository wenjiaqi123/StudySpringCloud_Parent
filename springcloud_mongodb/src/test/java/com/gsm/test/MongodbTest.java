package com.gsm.test;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.junit.Test;

import java.util.function.Consumer;

public class MongodbTest {
    @Test
    public void test() {
        String host = "127.0.0.1";
        //该对象用于连接Mongodb服务器
        MongoClient client = new MongoClient(host);
        //得到需要的数据库
        MongoDatabase database = client.getDatabase("wyxjava");
        //根据数据库得到集合（等同于关系型数据库中的表）
        MongoCollection<Document> collection = database.getCollection("user");
        //根据集合得到文档（等同于关系型数据库中的行）
        FindIterable<Document> documents = collection.find();
        documents.forEach((Consumer<? super Document>) i->{
            System.out.println(i);
        });
    }
}
