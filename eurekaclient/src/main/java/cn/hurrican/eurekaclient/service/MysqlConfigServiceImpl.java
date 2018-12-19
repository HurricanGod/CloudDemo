package cn.hurrican.eurekaclient.service;

import cn.hurrican.model.MySqlConfig;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Hurrican
 * @Date 2018/12/19  9:33
 * @since 1.0.0
 */
@Service
public class MysqlConfigServiceImpl implements MysqlConfigService {
    @Override
    public List<MySqlConfig> getConfig() {
        ArrayList<MySqlConfig> list = new ArrayList<>(10);
        MySqlConfig config = new MySqlConfig();
        config.setDb("test");
        config.setVersion(System.currentTimeMillis());
        config.setHost("127.0.0.1");
        config.setUser("root");
        list.add(config);
        return list;
    }
}
