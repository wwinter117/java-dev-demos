package cn.wwinter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Date: 2024/9/26
 * @Author: zhangdd
 */
@Configuration
public class AppConfig {
    @Bean
    public MessageService messageService() {
        return new MessageServiceImpl();
    }

    @Bean
    public MessagePrinter messagePrinter() {
        return new MessagePrinter(messageService());
    }
}
