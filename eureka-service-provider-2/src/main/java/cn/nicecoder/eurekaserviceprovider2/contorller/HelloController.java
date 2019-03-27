package cn.nicecoder.eurekaserviceprovider2.contorller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping(value = "/hello/provider")
    public String helloProvider(){
        return "I am is provider no.2";
    }
}
