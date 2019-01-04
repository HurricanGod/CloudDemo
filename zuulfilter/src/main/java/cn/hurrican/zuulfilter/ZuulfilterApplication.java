package cn.hurrican.zuulfilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 服务网关
 *
 * @author Hurrican
 * @Date 2019/1/3  17:57
 * @since 1.0.0
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
@EnableDiscoveryClient
public class ZuulfilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulfilterApplication.class, args);
    }

}

