package com.lxq.springboot.api.service;

import com.lxq.springboot.api.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Ncish
 * @Description
 * @Date 2019-04-21 17:36
 * @Modified By：
 * Company http://www.66ac.com
 */
public interface IProviderService {
    @RequestMapping("/getProvider")
    public UserEntity getProvider(String name);
}
