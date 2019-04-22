package com.lxq.springboot.api.service.impl;

import com.lxq.springboot.api.entity.UserEntity;
import com.lxq.springboot.api.feign.ProviderServiceFeign;
import com.lxq.springboot.api.service.IConsumerService;
import com.lxq.springboot.base.BaseApiService;
import com.lxq.springboot.base.ResponseBase;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author Ncish
 * @Description
 * @Date 2019-04-21 21:09
 * @Modified By：
 * Company http://www.66ac.com
 */
@RestController
public class ConsumerServiceImpl extends BaseApiService implements IConsumerService {

    @Autowired
    private ProviderServiceFeign providerServiceFeign;

    @RequestMapping("/consumerToProvider")
    public String consumerToProvider(String name) {

        UserEntity userEntity = providerServiceFeign.getProvider(name);

        return userEntity==null?"没有找到用户信息":userEntity.toString();
    }

    //没有解决服务雪崩效应
    @RequestMapping("/consumerToProviderUserInfo")
    public ResponseBase consumerToProviderUserInfo() {

        return providerServiceFeign.getUserInfo();

    }

    //解决服务雪崩效应
    //服务降级返回到另一个方法，给一个友好的提示；@HystrixCommand默认开启线程池隔离方式,服务降级，服务熔断
    @HystrixCommand(fallbackMethod = "consumerToProviderUserInfoHystrixFallback")
    @RequestMapping("/consumerToProviderUserInfoHystrix")
    public ResponseBase consumerToProviderUserInfoHystrix() {
        System.out.println("consumerToProviderUserInfoHystrix线程池名称："+ Thread.currentThread().getName());
        return providerServiceFeign.getUserInfo();

    }

    //服务降级处理提示类
    public ResponseBase consumerToProviderUserInfoHystrixFallback(){
        return setResultSuccess("服务降级处理---- 服务器忙，请稍后再试！");
    }

    //消费者服务接口
    @RequestMapping("/consumerInfo")
    public ResponseBase consumerInfo() {
        System.out.println("consumerInfo线程池名称："+ Thread.currentThread().getName());

        return setResultSuccess();
    }


}
