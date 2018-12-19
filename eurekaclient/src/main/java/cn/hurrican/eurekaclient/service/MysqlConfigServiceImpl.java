package cn.hurrican.eurekaclient.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Hurrican
 * @Date 2018/12/19  9:33
 * @since 1.0.0
 */
@Service
public class MysqlConfigServiceImpl implements MysqlConfigService {
    @Override
    public List<Map<String, String>> getConfig() {
        ArrayList<Map<String, String>> list = new ArrayList<>(10);
        HashMap<String, String> map = new HashMap<>(4);
        map.put("host", "127.0.0.1");
        map.put("user", "root");
        map.put("version", "1.0.0");
        list.add(map);
        return list;
    }
}
