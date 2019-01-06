package cn.hurrican.hystrixconsumer.controller;

import cn.hurrican.hystrixconsumer.service.AppConfigService4Feign;
import cn.hurrican.hystrixconsumer.service.AppConfigService4Ribbon;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private AppConfigService4Ribbon appConfigService4Ribbon;

    @Autowired
    private AppConfigService4Feign appConfigService4Feign;

    @RequestMapping(value = "/ribbon/getAppConfig4Zuul", produces = "application/json;charset=UTF-8")
    public String getAppConfig() {
        return appConfigService4Ribbon.getAppConfig() + "  ribbon";
    }


    @RequestMapping(value = "/feign/queryAppConfig4Zuul", produces = "application/json;charset=UTF-8")
    public String queryAppConfig() {
        return appConfigService4Feign.getAppConfig() + "  feign";
    }

}
