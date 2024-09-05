package com.fortuneprac.CrudOperation.controller;

import com.fortuneprac.CrudOperation.entity.Product;
import com.fortuneprac.CrudOperation.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products") // Base URL mapping for the controller
public class ProductController {

    @Autowired
    private ProductService service;

    // Add a product
    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }

    // Add multiple products
    @PostMapping("/addAll")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    }

    // Retrieve all products
    @GetMapping("/all")
    public List<Product> findAllProducts() {
        return service.getProducts();
    }

    // Retrieve product by ID
    @GetMapping("/{id}")
    public Product findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }

    // Retrieve product by name
    @GetMapping("/name/{name}")
    public Product findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    // Update product
    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

    // Delete product by ID
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }
}
