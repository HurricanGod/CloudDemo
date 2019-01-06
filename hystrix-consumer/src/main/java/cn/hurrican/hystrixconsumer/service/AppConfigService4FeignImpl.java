package cn.hurrican.hystrixconsumer.service;

import org.springframework.stereotype.Service;

/**
 * @author Hurrican
 * @Date 2019/1/2  15:59
 * @since 1.0.0
 */
@Service
public class AppConfigService4FeignImpl implements AppConfigService4Feign {
    @Override
    public String getAppConfig() {
        return "server too busy —— feign hystrix";
    }
}
