package com.bjsxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

//@SpringBootApplication
//@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.bjsxt.feign")
//@EnableCircuitBreaker
@SpringCloudApplication//相当于springbootapplication，enablediscoveryclient和enableCircuitBreaker
public class OrderApp {
    public static void main(String[] args) {
        SpringApplication.run(OrderApp.class, args);
    }

    /**
     * 向容器中定义RestTemplate对象
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
    }
}
