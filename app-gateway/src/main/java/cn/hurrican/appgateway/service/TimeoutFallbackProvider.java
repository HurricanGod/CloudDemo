package cn.hurrican.appgateway.service;

import cn.hurrican.model.ResMessage;
import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 * @author Hurrican
 * @Date 2019/5/8  17:45
 * @since 1.0.0
 */
@Slf4j
@Service
public class TimeoutFallbackProvider implements FallbackProvider {
    @Override
    public String getRoute() {
        return "*";
    }

    @Override
    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        log.error("调用服务超时：[route={}],异常信息：{}", route, cause.getMessage(), cause);
        return new ClientHttpResponse() {
            @Override
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.GATEWAY_TIMEOUT;
            }

            @Override
            public int getRawStatusCode() throws IOException {
                return HttpStatus.GATEWAY_TIMEOUT.value();
            }

            @Override
            public String getStatusText() throws IOException {
                return HttpStatus.GATEWAY_TIMEOUT.getReasonPhrase();
            }

            @Override
            public void close() {

            }

            @Override
            public InputStream getBody() throws IOException {
                ResMessage<Map<String, Object>> resMessage = new ResMessage<>(-1, "服务器繁忙！");
                return new ByteArrayInputStream(JSON.toJSONString(resMessage).getBytes());
            }

            @Override
            public HttpHeaders getHeaders() {
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON);
                return headers;
            }
        };
    }
}
