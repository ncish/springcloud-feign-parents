package com.lxq.springboot.api.feign;

import com.lxq.springboot.api.service.IProviderService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @Author Ncish
 * @Description
 * @Date 2019-04-21 21:18
 * @Modified By：
 * Company http://www.66ac.com
 */

@FeignClient("app-feign-provider")
public interface ProviderServiceFeign extends IProviderService {



}
