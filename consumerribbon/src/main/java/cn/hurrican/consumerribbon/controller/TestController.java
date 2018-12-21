package cn.hurrican.consumerribbon.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * 测试RPC调用
 *
 * @author Hurrican
 * @Date 2018/12/21  9:37
 * @since 1.0.0
 */

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "/getConfig")
    public String getConfig() {
        String url = "http://SERVICE-CLIENT/queryConfig";
        ResponseEntity<List> responseEntity = restTemplate.getForEntity(url, List.class);
        List list = responseEntity.getBody();
        if (list == null) {
            return "";
        }
        list.forEach(System.out::println);
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(list);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

}
