package cn.hurrican.appuser.controller;

import cn.hurrican.model.AppUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author Hurrican
 * @Date 2019/5/8  11:28
 * @since 1.0.0
 */
@Slf4j
@RestController
@RequestMapping(value = "/user")
public class AppUserController {

    @Value("${server.port:-1}")
    private Integer instanceId;

    @RequestMapping(value = "/queryUserById", produces = "application/json;charset=UTF-8")
    public AppUser queryUserById(Long id) {
        log.info("id = {}", id);
        try {
            Thread.sleep(id);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        AppUser appUser = new AppUser();
        appUser.setId(id);
        appUser.setUsername("Hurrican-" + instanceId);
        appUser.setRegisterTime(new Date());
        return appUser;
    }
}
