package com.client.product.dataobject;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data
//@Table
@Entity
public class ProductInfo {
    @Id //主键
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private Integer productStock;
    private String productDescription;
    private String productIcon;
    private Integer productStatus;
    private Integer  categoryType;
    private Date createTime;
    private Date  updateTime;


}
