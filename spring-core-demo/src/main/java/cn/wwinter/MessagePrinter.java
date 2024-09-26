package cn.wwinter;

/**
 * @Description:
 * @Date: 2024/9/26
 * @Author: zhangdd
 */
public class MessagePrinter {
    private final MessageService service;

    public MessagePrinter(MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
