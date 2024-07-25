package com.example.orderservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(name = "product-service", url = "http://localhost:8085")

public interface ProductClient {
    @GetMapping("/products/{id}")
    Product getProductById(@PathVariable("id") Long id);

    @GetMapping("/products/all")
    List<Product> getAllProducts();

    @PostMapping("/products/save")
    Product save(@RequestBody Product product);

}
