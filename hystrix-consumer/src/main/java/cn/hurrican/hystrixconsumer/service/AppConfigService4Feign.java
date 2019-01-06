package cn.hurrican.hystrixconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Feign中使用熔断器
 *
 * @author Hurrican
 * @create 2019/1/2  15:54
 * @since 1.0.0
 */
@FeignClient(value = "SERVICE-CLIENT", fallback = AppConfigService4FeignImpl.class)
public interface AppConfigService4Feign {

    @RequestMapping(value = "queryConfig", method = RequestMethod.GET)
    String getAppConfig();
}
