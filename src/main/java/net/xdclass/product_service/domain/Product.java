package net.xdclass.product_service.domain;

import java.io.Serializable;

/**
 * @author chengcheng123
 * @date 2021/6/1 23:54
 */
public class Product implements Serializable {
    private  int id;
    private  String name;
    //价格
    private int price;
    //数量
    private  int store;

    public Product() {
    }

    public Product(int id, String name, int price, int store) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.store = store;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStore() {
        return store;
    }

    public void setStore(int store) {
        this.store = store;
    }
}
