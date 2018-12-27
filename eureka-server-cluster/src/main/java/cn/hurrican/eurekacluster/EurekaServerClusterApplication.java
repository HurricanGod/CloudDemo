package cn.hurrican.eurekacluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Server 集群
 *
 * @author Hurrican
 * @Date 2018/12/27  9:48
 * @since 1.0.0
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerClusterApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerClusterApplication.class, args);
    }

}

