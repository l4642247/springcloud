package cn.nicecoder.eurekaserviceprovider3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient  //表示发现服务和向注册中心进行服务注册

public class EurekaServiceProvider3Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceProvider3Application.class, args);
    }

}
