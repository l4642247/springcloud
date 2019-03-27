package cn.nicecoder.eurekaserviceprovider1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello/provider")
    public String helloProvider(){
        return "I am is provider no.1";
    }
}
