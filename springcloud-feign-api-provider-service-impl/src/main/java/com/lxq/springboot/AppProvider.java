package com.lxq.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author Ncish
 * @Description
 * @Date 2019-04-21 17:40
 * @Modified By：
 * Company http://www.66ac.com
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class AppProvider {
    public static void main(String[] args) {
        SpringApplication.run(AppProvider.class,args);
    }
}
