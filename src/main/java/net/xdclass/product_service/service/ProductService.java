package net.xdclass.product_service.service;

import net.xdclass.product_service.domain.Product;

import java.util.List;

/**
 * @author chengcheng123
 * @date 2021/6/1 23:57
 */
public interface ProductService {

    List<Product> listProduct();

    Product findById(int id);
}
