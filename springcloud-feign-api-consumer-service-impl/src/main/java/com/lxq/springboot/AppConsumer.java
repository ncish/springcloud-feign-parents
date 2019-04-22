package com.lxq.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author Ncish
 * @Description
 * @Date 2019-04-21 21:28
 * @Modified By：
 * Company http://www.66ac.com
 */

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class AppConsumer {
    public static void main(String[] args) {
        SpringApplication.run(AppConsumer.class,args);
    }
}
