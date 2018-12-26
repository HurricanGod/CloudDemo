package cn.hurrican.consumerfeign.controller;

import cn.hurrican.consumerfeign.service.AppConfigFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Feign消费服务Web层
 *
 * @author Hurrican
 * @Date 2018/12/26  18:36
 * @since 1.0.0
 */
@RestController
public class AppConfigFeignController {

    @Autowired
    private AppConfigFeignService appConfigFeignService;


    @RequestMapping(value = "/getConfig")
    public String getConfig() {
        return appConfigFeignService.getConfig();
    }

}
