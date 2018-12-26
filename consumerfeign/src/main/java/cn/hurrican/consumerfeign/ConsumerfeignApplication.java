package cn.hurrican.consumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Hurrican
 * @Date 2018/12/24  11:31
 * @since 1.0.0
 */

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
public class ConsumerfeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerfeignApplication.class, args);
    }

}

