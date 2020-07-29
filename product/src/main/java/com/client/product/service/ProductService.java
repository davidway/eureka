package com.client.product.service;

import com.client.product.dataobject.ProductInfo;

import java.util.List;

public interface ProductService {
    List<ProductInfo> findUpAll();
}
