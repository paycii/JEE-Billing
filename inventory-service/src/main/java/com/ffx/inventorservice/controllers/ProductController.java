package com.ffx.inventorservice.controllers;


import com.ffx.inventorservice.entities.Product;
import com.ffx.inventorservice.repositories.ProductRepo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
@AllArgsConstructor
public class ProductController {

    private ProductRepo productRepository;

    @GetMapping("/")
    public List<Product> getAllCustomer(){
        return productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Product getCustomerById(@PathVariable("id") Long id){
        return productRepository.findById(id).get();
    }
}
