package cn.hurrican.hystrixconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 断路器启动类
 *
 * @author Hurrican
 * @Date 2018/12/28  10:23
 * @since 1.0.0
 */

@SpringBootApplication
public class HystrixConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HystrixConsumerApplication.class, args);
    }

}

