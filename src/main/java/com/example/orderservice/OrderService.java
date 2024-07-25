package com.example.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private ProductClient productClient;

    public Product getProductById(Long id) {
        return productClient.getProductById(id);
    }
    public List<Product> productList() {
        return productClient.getAllProducts();
    }
    public Product save(Product product){
        return productClient.save(product);
    }

}
