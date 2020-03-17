package com.gsm;

import com.gsm.utils.IdUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringCloudUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudUserApplication.class);
    }

    /**
     * 使用时将 IdUtils 引入
     *
     * @Autowired private IdUtils idUtils;
     */
    @Bean
    public IdUtils getId() {
        return new IdUtils(1, 1);
    }

    /**
     * 加载 security 里的 BCryptPasswordEncoder
     * 一般情况，密码绝对不能以明文形式存储，都要经过加密，前后台都要加密，防止 攻击者/开发者 泄漏密码
     * SHA，MD5等加密算法，结合【加盐】都能提高安全性
     * Spring Security 提供了 BCryptPasswordEncoder ；使用 BCrypt 强哈希方法，每次加密都不一样
     * @return
     */
    @Bean
    public BCryptPasswordEncoder bcryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
