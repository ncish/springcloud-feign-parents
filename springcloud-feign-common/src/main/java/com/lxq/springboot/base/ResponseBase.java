package com.lxq.springboot.base;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author Ncish
 * @Description 统一规范响应接口信息
 * @Date 2019-04-22 12:05
 * @Modified By：
 * Company http://www.66ac.com
 */
@Data
@Slf4j
public class ResponseBase {
    private Integer rtnCode;
    private String msg;
    private Object data;

    public ResponseBase(){};

    public ResponseBase(Integer trnCode,String msg,Object data){
        super();
        this.rtnCode = rtnCode;
        this.msg = msg;
        this.data = data;
    }

    public static void main(String[] args) {
        ResponseBase responseBase = new ResponseBase();
        responseBase.setData("123456");
        responseBase.setMsg("sucess");
        responseBase.setRtnCode(200);
        System.out.println(responseBase.toString());
        log.info("springcloud - lxq");
    }

    @Override
    public String toString() {
        return "ResponseBase{" +
                "rtnCode=" + rtnCode +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
