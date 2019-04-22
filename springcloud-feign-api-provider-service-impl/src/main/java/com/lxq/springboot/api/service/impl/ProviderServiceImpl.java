package com.lxq.springboot.api.service.impl;

import com.lxq.springboot.api.entity.UserEntity;
import com.lxq.springboot.api.service.IProviderService;
import com.lxq.springboot.base.BaseApiService;
import com.lxq.springboot.base.ResponseBase;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Ncish
 * @Description
 * @Date 2019-04-21 17:43
 * @Modified By：
 * Company http://www.66ac.com
 */
@RestController
public class ProviderServiceImpl extends BaseApiService implements IProviderService {

    @RequestMapping("/getProvider")
    public UserEntity getProvider(@RequestParam("name") String name) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(name);
        userEntity.setAge(22);
        return userEntity;
    }

    public ResponseBase getUserInfo() {
        try{
            //会员服务接口产生1.5秒的延迟
            Thread.sleep(1500);
        } catch(Exception e){

        }
        return setResultSuccess("消费者服务接口调用提供者服务接口成功......");
    }
}
