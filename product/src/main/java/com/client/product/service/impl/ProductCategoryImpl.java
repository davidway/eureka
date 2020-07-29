package com.client.product.service.impl;

import com.client.product.dataobject.ProductCategory;
import com.client.product.respository.ProductCategoryRepository;
import com.client.product.service.CategoryService;
import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductCategoryImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository categoryRepository;
    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryType) {
       return categoryRepository.findByCategoryType(categoryType);
    }
}
