package cn.hurrican.consumerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 伪Http客户端消费服务
 *
 * @author Hurrican
 * @create 2018/12/26  18:28
 * @since 1.0.0
 */
@FeignClient(value = "service-client")
public interface AppConfigFeignService {

    @RequestMapping(value = "/queryConfig", method = RequestMethod.GET)
    String getConfig();
}
