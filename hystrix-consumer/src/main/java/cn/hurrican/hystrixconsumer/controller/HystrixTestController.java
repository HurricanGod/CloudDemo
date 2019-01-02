package cn.hurrican.hystrixconsumer.controller;

import cn.hurrican.hystrixconsumer.service.UserService4Feign;
import cn.hurrican.hystrixconsumer.service.UserService4Ribbon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 断路器控制器
 *
 * @author Hurrican
 * @Date 2019/1/2  15:32
 * @since 1.0.0
 */
@RestController
public class HystrixTestController {

    @Autowired
    private UserService4Ribbon userService4Ribbon;

    @Autowired
    private UserService4Feign userService4Feign;

    @RequestMapping(value = "/ribbon/getUserInfo", produces = "application/json;charset=UTF-8")
    public String getUserInfo() {
        return userService4Ribbon.getUserInfo();
    }


    @RequestMapping(value = "/feign/getUserInfo", produces = "application/json;charset=UTF-8")
    public String queryUserInfo() {
        return userService4Feign.getUserInfo();
    }

}
