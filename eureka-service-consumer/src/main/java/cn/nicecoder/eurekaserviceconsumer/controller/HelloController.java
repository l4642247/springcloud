package cn.nicecoder.eurekaserviceconsumer.controller;

import cn.nicecoder.eurekaserviceconsumer.service.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jack on 2017/7/20.
 */
@RestController
public class HelloController {
    @Autowired
    HelloRemote helloRemote;

    @RequestMapping(value = "/hello")
    public String hello() {
        return helloRemote.helloProvider();
    }
}
