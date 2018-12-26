package cn.hurrican.eurekaclient.controller;

import cn.hurrican.eurekaclient.service.MysqlConfigService;
import cn.hurrican.model.MySqlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Hurrican
 * @Date 2018/12/24  11:30
 * @since 1.0.0
 */

@RestController
public class AppConfigController {

    @Autowired
    private MysqlConfigService mysqlConfigService;

    @Value("${server.port}")
    private String port;


    @RequestMapping(value = "/queryConfig", produces = "application/json;charset=UTF-8")
    public List<MySqlConfig> queryConfig() {
        List<MySqlConfig> config = mysqlConfigService.getConfig();
        config.forEach(ele -> ele.setHost(ele.getHost() + ":" + port));
        return config;
    }

}
