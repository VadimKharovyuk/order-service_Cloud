package com.example.orderservice;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/orders/{id}/product")
    public Product getProductById(@PathVariable Long id) {
        return orderService.getProductById(id);
        //http://localhost:8080/orders/1/product
    }
    @GetMapping("/orders/products/all")
    public List<Product> productList(){
        return orderService.productList();
        //http://localhost:8080/orders/products/all
    }
    @PostMapping("/orders/products/save")
    public Product save(@RequestBody Product product){
        return orderService.save(product);
        //http://localhost:8080/orders/products/save
    }
}
