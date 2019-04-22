package com.lxq.springboot.api.service.impl;

import com.lxq.springboot.api.entity.UserEntity;
import com.lxq.springboot.api.service.IProviderService;
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
public class ProviderServiceImpl implements IProviderService {

    @RequestMapping("/getProvider")
    public UserEntity getProvider(@RequestParam("name") String name) {
        UserEntity userEntity = new UserEntity();
        userEntity.setName(name);
        userEntity.setAge(22);
        return userEntity;
    }
}
