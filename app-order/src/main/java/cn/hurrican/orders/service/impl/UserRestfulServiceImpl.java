package cn.hurrican.orders.service.impl;

import cn.hurrican.model.AppUser;
import cn.hurrican.orders.service.UserRestfulService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author Hurrican
 * @Date 2019/5/8  16:55
 * @since 1.0.0
 */
@Slf4j
@Service
public class UserRestfulServiceImpl implements UserRestfulService {
    @Override
    public AppUser queryUserById(Long id) {
        log.error("调用服务超时，返回默认值null");
        return null;
    }
}
