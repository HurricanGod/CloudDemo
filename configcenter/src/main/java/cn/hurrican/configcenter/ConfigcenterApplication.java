package cn.hurrican.configcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Hurrican
 * @Date 2018/12/18  10:10
 * @since 1.0.0
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigcenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigcenterApplication.class, args);
    }

}

