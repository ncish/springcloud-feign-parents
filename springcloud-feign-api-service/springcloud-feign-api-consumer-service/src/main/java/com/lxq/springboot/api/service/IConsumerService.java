package com.lxq.springboot.api.service;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Ncish
 * @Description
 * @Date 2019-04-21 21:05
 * @Modified By：
 * Company http://www.66ac.com
 */
public interface IConsumerService {
    //消费者调用提供者信息 feign
    @RequestMapping("/consumerToProvider")
    public String consumerToProvider(String name);
}
