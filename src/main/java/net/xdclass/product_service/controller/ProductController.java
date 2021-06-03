package net.xdclass.product_service.controller;

import net.xdclass.product_service.domain.Product;
import net.xdclass.product_service.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author chengcheng123
 * @date 2021/6/1 23:45
 */
@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private ProductService productService;


    @RequestMapping("/list")
    public Object listProduct(){
        return productService.listProduct();
    }

    @RequestMapping("/findById")
    public Object findById(@RequestParam("id") int id) throws InterruptedException {
       // TimeUnit.SECONDS.sleep(10);

        Product product = productService.findById(id);
        Product result = new Product();
        BeanUtils.copyProperties(product,result);
        result.setName(result.getName()+"--data from " +this.serverPort);
        return result;
    }

}
