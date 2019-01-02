package cn.hurrican.hystrixconsumer.service;

import org.springframework.stereotype.Service;

/**
 * @author Hurrican
 * @Date 2019/1/2  15:59
 * @since 1.0.0
 */
@Service
public class UserService4FeignImpl implements UserService4Feign {
    @Override
    public String getUserInfo() {
        return "server too busy —— feign hystrix";
    }
}
