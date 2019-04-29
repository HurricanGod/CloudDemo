package cn.hurrican.zuulfilter.service;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 授权过滤器
 *
 * @author Hurrican
 * @Date 2019/1/7  9:56
 * @since 1.0.0
 */
@Component
public class OauthFilter extends ZuulFilter implements ApplicationContextAware {


    private ApplicationContext context;

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String token = request.getParameter("token");
        if (StringUtils.isBlank(token)) {
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);
            HttpServletResponse response = requestContext.getResponse();
            try {
                PrintWriter writer = response.getWriter();
                writer.write("token is empty");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }


    public ApplicationContext getContext() {
        return context;
    }

    public void setContext(ApplicationContext context) {
        this.context = context;
    }
}
