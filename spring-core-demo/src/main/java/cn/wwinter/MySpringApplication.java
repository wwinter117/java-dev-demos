package cn.wwinter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @Date: 2024/9/26
 * @Author: zhangdd
 */
public class MySpringApplication {
    public static void main(String[] args) {
        // 使用 AnnotationConfigApplicationContext 加载配置类
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // 获取 MessagePrinter bean 并调用其方法
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        printer.printMessage();
    }
}
