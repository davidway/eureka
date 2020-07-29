package com.client.product.service.impl;

import com.client.product.dataobject.ProductInfo;
import com.client.product.respository.ProductInfoRepository;
import com.client.product.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    ProductInfoRepository productInfoRepository;
    @Override
    public List<ProductInfo> findUpAll() {
            return productInfoRepository.findAll();
    }
}
