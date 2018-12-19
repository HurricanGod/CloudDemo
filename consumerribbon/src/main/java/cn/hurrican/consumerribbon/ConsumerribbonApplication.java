package cn.hurrican.consumerribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


/**
 * @author Hurrican
 * @Date 2018/12/18  10:10
 * @since 1.0.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
public class ConsumerribbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerribbonApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}

