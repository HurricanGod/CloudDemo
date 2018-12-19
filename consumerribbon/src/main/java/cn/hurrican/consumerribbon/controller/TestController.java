package cn.hurrican.consumerribbon.controller;

import cn.hurrican.model.MySqlConfig;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "/getConfig")
    public String getConfig() {
        String url = "http://SERVICE-CLIENT/queryConfig";
        ResponseEntity<MySqlConfig> entity = restTemplate.getForEntity(url, MySqlConfig.class);
        MySqlConfig body = entity.getBody();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(body);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

}
