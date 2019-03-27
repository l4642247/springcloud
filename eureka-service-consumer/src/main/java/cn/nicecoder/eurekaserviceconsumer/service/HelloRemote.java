package cn.nicecoder.eurekaserviceconsumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name= "service-provider")
public interface HelloRemote {
    //这个接口要和远程调用的接口一只，参数，接口名，返回类型
    @RequestMapping(value = "/hello/provider")
    public String helloProvider();
}