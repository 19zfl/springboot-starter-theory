package com.zfl19.configs;

import com.zfl19.service.PrintService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 19zfl
 * @date 2023/5/7
 */
@Configuration
public class MyConfiguration {

    @Bean
    public PrintService printService() {
        return new PrintService();
    }

}
