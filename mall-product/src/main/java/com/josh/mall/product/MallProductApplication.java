package com.josh.mall.product;

import com.josh.mall.product.entity.BrandEntity;
import com.josh.mall.product.service.BrandService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 *  1. integrate the mybatis-plus
 *      1).import the dependencies
 *      2)configuration
 *          1.database
 *              1.database drive
 *              2.configure it at application.yml
 *          2.mybatis-plus
 *              1.mapperscan
 *              2.configure the address of mapper file
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.josh.mall.product.dao")
public class MallProductApplication {

    public String hello() {
        return "Hello, World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
