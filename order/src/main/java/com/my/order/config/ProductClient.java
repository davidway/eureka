package com.my.order.config;

import com.client.product.vo.ProductInfoOutput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name="product")
public interface ProductClient {
    @GetMapping("/msg")
    public String weiqiang();

    //getMapping不行，RequestBody必须是post
    @PostMapping("/product/listForOrder")
    public List<ProductInfoOutput> listForOrder(@RequestBody List<String> productIdList);
}
