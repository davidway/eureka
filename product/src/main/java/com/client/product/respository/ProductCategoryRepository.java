package com.client.product.respository;

import com.client.product.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductCategoryRepository  extends JpaRepository<ProductCategory,Integer> {
    List<ProductCategory> findByCategoryType(List<Integer> categoryTypeList);
}
