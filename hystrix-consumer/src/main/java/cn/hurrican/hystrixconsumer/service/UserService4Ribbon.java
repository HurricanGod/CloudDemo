package cn.hurrican.hystrixconsumer.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Hurrican
 * @create 2019/1/2  15:27
 * @since 1.0.0
 */
@Service
public class UserService4Ribbon {


    @Autowired
    private RestTemplate restTemplate;


    @HystrixCommand(fallbackMethod = "getDefaultUserInfo")
    public String getUserInfo() {
        String url = "http://SERVICE-CLIENT/queryConfig";
        ResponseEntity<List> responseEntity = restTemplate.getForEntity(url, List.class);
        List list = responseEntity.getBody();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return list == null ? "[]" : objectMapper.writeValueAsString(list);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }


    public String getDefaultUserInfo() {
        return "server too busy —— ribbon hystrix";
    }
}
