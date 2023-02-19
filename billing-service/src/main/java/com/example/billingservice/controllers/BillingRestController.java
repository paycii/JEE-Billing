package com.example.billingservice.controllers;

import com.example.billingservice.entities.Bill;
import com.example.billingservice.feign.CustomerRestClient;
import com.example.billingservice.feign.ProductItemRestClient;
import com.example.billingservice.repository.BillRepository;
import com.example.billingservice.repository.ProductItemRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/bills")
@AllArgsConstructor
public class BillingRestController {
    private BillRepository billRepository;
    private ProductItemRepository productItemRepository;
    private CustomerRestClient customerRestClient;
    private ProductItemRestClient productItemRestClient;

    @GetMapping(path="/fullBill/{id}")
    public Bill getBill(@PathVariable Long id){
        return billRepository.findById(id).get();
    }

    @GetMapping
    public List<Bill> bills(){
        return billRepository.findAll();
    }
}
