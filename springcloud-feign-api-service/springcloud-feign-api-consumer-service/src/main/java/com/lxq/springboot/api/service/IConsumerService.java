package com.lxq.springboot.api.service;

import com.lxq.springboot.base.ResponseBase;
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

    //消费者接口调用提供者接口
    @RequestMapping("/consumerToProviderUserInfo")
    public ResponseBase consumerToProviderUserInfo();

    //消费者接口
    @RequestMapping("/consumerInfo")
    public ResponseBase consumerInfo();
}
