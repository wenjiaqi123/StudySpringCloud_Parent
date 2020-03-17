package com.gsm;

import com.gsm.utils.IdUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

//  @MapperScan包扫描，配置该注解，Dao层里可以不加注解
@MapperScan("com.gsm.dao")
//  @SpringBootApplication  SpringBoot启动注解
@SpringBootApplication
public class SpringCloudArticleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudArticleApplication.class, args);
    }

    /**
     * 使用时将 IdUtils 引入
     * @Autowired
     * private IdUtils idUtils;
     */
    @Bean
    public IdUtils getId(){
        return new IdUtils(1,1);
    }
}

