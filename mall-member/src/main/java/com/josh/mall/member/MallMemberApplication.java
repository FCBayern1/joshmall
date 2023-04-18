package com.josh.mall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 1.openfeign
 * 2.interface which will tell springcloud that this interface need to call the remote service
 *  1.declare the method we want to call and the request url of it
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.josh.mall.member.dao")
@EnableFeignClients(basePackages = "com.josh.mall.member.feign")
public class MallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallMemberApplication.class, args);
    }

}
