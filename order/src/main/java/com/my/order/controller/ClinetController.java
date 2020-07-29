package com.my.order.controller;

import com.netflix.discovery.converters.Auto;
import com.netflix.loadbalancer.ILoadBalancer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@Slf4j
public class ClinetController {
    @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getProductMsg")
    public String getProductMsg(){
       /* RestTemplate template = new RestTemplate();
        String response = template.getForObject("http://localhost:8080/msg",String.class);
        log.info("response,{}",response);*/

        RestTemplate template = new RestTemplate();
        ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT");
        String url = String.format("http://%s:%s",serviceInstance.getHost(),serviceInstance.getPort());
        String response = template.getForObject(url,String.class);

 /*  String response = restTemplate.getForObject("http://PRODUCT/msg",String.class);*/
   log.info("response={}",response);
        return response;
    }
}
