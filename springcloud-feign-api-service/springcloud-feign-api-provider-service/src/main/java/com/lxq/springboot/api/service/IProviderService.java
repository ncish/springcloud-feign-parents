package com.lxq.springboot.api.service;

import com.lxq.springboot.api.entity.UserEntity;
import com.lxq.springboot.base.ResponseBase;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author Ncish
 * @Description
 * @Date 2019-04-21 17:36
 * @Modified By：
 * Company http://www.66ac.com
 */
public interface IProviderService {
    @RequestMapping("/getProvider")
    public UserEntity getProvider(@RequestParam("name") String name);

    @RequestMapping("/getUserInfo")
    public ResponseBase getUserInfo();

}
