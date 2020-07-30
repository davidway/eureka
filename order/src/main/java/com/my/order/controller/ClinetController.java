package com.my.order.controller;

import com.client.product.vo.ProductInfoOutput;
import com.my.order.config.ProductClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@Slf4j
public class ClinetController {
 /*   @Autowired
    private LoadBalancerClient loadBalancerClient;
    @Autowired
    private RestTemplate restTemplate;
*/
        @Autowired
        private ProductClient productClient;
    @GetMapping("/getProductMsg")
    public String getProductMsg(){
       String response = productClient.weiqiang();
        log.info("response={}",response);
        log.info("response={}",response);
        return response;
    }

    @GetMapping("/getProductList")
    public String getProductList(){
       List<ProductInfoOutput> productInfoList = productClient.listForOrder(Arrays.asList("164103465734242707"));
       log.info("response={}",productInfoList);
       return "ok";

    }
}
