package com.client.product.service.impl;

import com.client.product.ProductApplicationTests;
import com.client.product.service.CategoryService;
import com.netflix.discovery.converters.Auto;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ProductCategoryImplTest extends ProductApplicationTests {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findByCategoryTypeIn() {
            List list = categoryService.findByCategoryTypeIn(Arrays.asList(11,22));
        Assert.assertEquals(list.size()>0,true);
    }
}