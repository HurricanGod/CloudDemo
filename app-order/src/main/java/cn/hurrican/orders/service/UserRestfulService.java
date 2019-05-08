package cn.hurrican.orders.service;

import cn.hurrican.model.AppUser;
import cn.hurrican.orders.service.impl.UserRestfulServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Hurrican
 * @create 2019/5/8  11:00
 * @since 1.0.0
 */

@FeignClient(name = "app-user", fallback = UserRestfulServiceImpl.class)
public interface UserRestfulService {

    /**
     * 根据id查询用户信息
     *
     * @param id 用户id
     * @return AppUser
     */
    @RequestMapping(value = "/user/queryUserById", produces = "application/json;charset=UTF-8")
    AppUser queryUserById(@RequestParam("id") Long id);
}
