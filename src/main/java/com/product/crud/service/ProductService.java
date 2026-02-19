package com.product.crud.service;

import com.product.crud.model.Product;
import com.product.crud.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAll() {return productRepository.findAll();}

    public Product getById(Long id) {return productRepository.findById(id).
            orElseThrow(() -> new RuntimeException("Product not found with id: " + id));}

    public Product save(Product product ){return productRepository.save(product);}

    public void deleteById(Long id) {productRepository.deleteById(id);}

    public Product update(Long id, Product product){
        Product existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setValue(product.getValue());

        return productRepository.save(existingProduct);
    }
}
