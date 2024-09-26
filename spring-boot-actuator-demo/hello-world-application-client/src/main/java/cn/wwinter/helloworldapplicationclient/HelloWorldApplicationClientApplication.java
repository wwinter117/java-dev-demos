package cn.wwinter.helloworldapplicationclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorldApplicationClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplicationClientApplication.class, args);
    }

    @GetMapping("/echo")
    public String helloWorld() {
        return "Hello World!";
    }
}
