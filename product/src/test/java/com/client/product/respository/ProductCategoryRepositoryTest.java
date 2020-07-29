package com.client.product.respository;

import com.client.product.dataobject.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
    @Autowired
    ProductCategoryRepository productCategoryRepository;
    @Test
    public void test(){
        System.out.println("productCategoryRepository = " + Arrays.asList(11,12));
    }

    @Test
    public void findByCategoryType() {
        List<ProductCategory> list=productCategoryRepository.findByCategoryType(Arrays.asList(11,22));
    }
}