package cn.hurrican.eurekaclient.service;

import cn.hurrican.model.MySqlConfig;

import java.util.List;

/**
 * 获取MySQL配置信息的Service
 *
 * @author Hurrican
 * @create 2018/12/19  9:32
 * @since 1.0.0
 */
public interface MysqlConfigService {

    List<MySqlConfig> getConfig();

}
