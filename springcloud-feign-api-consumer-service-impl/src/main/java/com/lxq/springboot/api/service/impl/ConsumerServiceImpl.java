package com.lxq.springboot.api.service.impl;

import com.lxq.springboot.api.entity.UserEntity;
import com.lxq.springboot.api.feign.ProviderServiceFeign;
import com.lxq.springboot.api.service.IConsumerService;
import com.lxq.springboot.base.ResponseBase;
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
public class ConsumerServiceImpl implements IConsumerService {

    @Autowired
    private ProviderServiceFeign providerServiceFeign;

    @RequestMapping("/consumerToProvider")
    public String consumerToProvider(String name) {

        UserEntity userEntity = providerServiceFeign.getProvider(name);

        return userEntity==null?"没有找到用户信息":userEntity.toString();
    }

    @RequestMapping("/consumerToProviderUserInfo")
    public ResponseBase consumerToProviderUserInfo() {

        return providerServiceFeign.getUserInfo();

    }
}
