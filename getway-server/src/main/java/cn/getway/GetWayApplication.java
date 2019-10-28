package cn.getway;

/*
网关微服务
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableZuulProxy
@EnableSwagger2//开启swgger功能
public class GetWayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GetWayApplication.class,args);
    }
}
