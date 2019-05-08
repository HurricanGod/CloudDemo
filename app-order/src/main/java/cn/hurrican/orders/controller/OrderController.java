package cn.hurrican.orders.controller;

import cn.hurrican.model.AppUser;
import cn.hurrican.model.ResMessage;
import cn.hurrican.orders.service.UserRestfulService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 订单控制器
 *
 * @author Hurrican
 * @Date 2019/5/8  10:55
 * @since 1.0.0
 */
@Slf4j
@RestController
@RequestMapping(value = "/order")
public class OrderController {

    @Autowired
    private UserRestfulService userRestfulService;


    @RequestMapping(value = "/queryOrderInfo", produces = "application/json;charset=UTF-8")
    public ResMessage<Map<String, Object>> queryOrderInfo(Long uid) {
        ResMessage<Map<String, Object>> message = new ResMessage<>(new HashMap<>(8));

        try {
            AppUser appUser = userRestfulService.queryUserById(uid);
            message.safePut("appUser", appUser);
        } catch (Exception e) {
            log.error("查询订单出错：{}, {}", e.getMessage(), e.getClass(), e);
            message.safePut("exception", e);
        }

        return message;
    }


}
