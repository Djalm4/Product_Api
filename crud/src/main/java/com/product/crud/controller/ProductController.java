package com.product.crud.controller;

import com.product.crud.model.Product;
import com.product.crud.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public List<Product> getAll() {return productService.getAll();}

    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable Long id){
        Product product = productService.getById(id);
        return ResponseEntity.ok(product);
    }


    @PostMapping
    public Product create(@RequestBody Product product) {return productService.save(product);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {productService.deleteById(id);}

    @PutMapping("/{id}")
    public ResponseEntity<Product>  update(@PathVariable Long id, @RequestBody Product product){
        Product updateProduct = productService.update(id, product);
        return ResponseEntity.ok(updateProduct);
    }
}
