package cn.hurrican.hystrixconsumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 网关测试服务器
 *
 * @author Hurrican
 * @Date 2019/1/3  18:19
 * @since 1.0.0
 */
@RestController
public class ZuulTestController {


    @RequestMapping(value = "/ribbon/queryHostname", produces = "application/json;charset=UTF-8")
    public String queryRibbonHostname() {
        return "ribbon_SERVICE-CLIENT";
    }


    @RequestMapping(value = "/feign/queryHostname", produces = "application/json;charset=UTF-8")
    public String queryFeignHostname() {
        return "feign_SERVICE-CLIENT";
    }

}
