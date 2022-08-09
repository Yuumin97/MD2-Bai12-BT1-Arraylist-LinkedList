package rikkei.academy.service;

import rikkei.academy.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductServiceIMPL implements IProductService {
    public static List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(1, 1500 ,"iphone 13pro max"));
        productList.add(new Product(2, 800 ,"iphone 13pro"));
        productList.add(new Product(3, 650 ,"iphone 13"));
        productList.add(new Product(4, 1000 ,"iphone 12pro max"));
        productList.add(new Product(5, 700 ,"iphone 12pro"));
        productList.add(new Product(6, 800 ,"iphone 11pro max"));
        productList.add(new Product(7, 750 ,"SamSum Galaxy note 20 Ultra"));
        productList.add(new Product(8, 600 ,"SamSum Galaxy note 10 Lite"));
        productList.add(new Product(9, 1300 ,"SamSum Galaxy note 20 Ultra 5G"));
        productList.add(new Product(10, 1100 ,"SamSum Galaxy Z Fold3"));
        productList.add(new Product(11, 520 ,"SamSum Galaxy A73 5G"));
        productList.add(new Product(12, 870 ,"SamSum Galaxy S22 Plus"));
        productList.add(new Product(13, 350 ,"SamSum Galaxy A53 5G"));
        productList.add(new Product(14, 700 ,"ASUS ROG Phone 5"));
        productList.add(new Product(15, 720 ,"Xiaomi 12"));

    }

    @Override
    public  List<Product> sortByPrice() {
        Collections.sort(productList);
        return productList;
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

}
