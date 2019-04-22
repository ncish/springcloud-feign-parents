package com.lxq.springboot.base;

import org.springframework.stereotype.Component;

/**
 * @Author Ncish
 * @Description
 * @Date 2019-04-22 12:02
 * @Modified By：
 * Company http://www.66ac.com
 */
@Component
public class BaseApiService {
    public ResponseBase setResultError(Integer code,String msg){
        return serResult(code,msg,null);
    }

    //返回错误，可以传msg
    public ResponseBase setResultError(String msg){
        return serResult(500,msg,null);
    }

    //返回成功，可以传data值
    public ResponseBase setResultSuccess(Object data){
        return serResult(200,"处理成功",data);
    }

    //返回成功，没有data值
    public ResponseBase setResultSuccess(){
        return serResult(200,"处理成功",null);
    }

    //返回成功，没有data值
    public ResponseBase setResultSuccess(String msg){
        return serResult(200,msg,null);
    }

    //通用封装
    public ResponseBase serResult(Integer code,String msg,Object data){
        return new ResponseBase(code,msg,data);
    }

}
