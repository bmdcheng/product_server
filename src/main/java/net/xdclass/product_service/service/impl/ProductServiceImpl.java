package net.xdclass.product_service.service.impl;

import net.xdclass.product_service.domain.Product;
import net.xdclass.product_service.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/**
 * @author chengcheng123
 * @date 2021/6/1 23:59
 */
@Service
public class ProductServiceImpl implements ProductService {
    private static final HashMap<Integer,Product> CACHMAP =new HashMap<>();

    static{
        Product product1 = new Product(1, "冰箱", 100, 100);
        Product product2 = new Product(2, "冰棒", 100, 100);
        Product product3= new Product(3, "冰锤", 100, 100);

        CACHMAP.put(product1.getId(),product1);
        CACHMAP.put(product2.getId(),product2);
        CACHMAP.put(product3.getId(),product3);
    }

    @Override
    public List<Product> listProduct() {

        Collection<Product> values = CACHMAP.values();

        return new ArrayList<>(values);
    }

    @Override
    public Product findById(int id) {

        return CACHMAP.get(id);
    }
}
