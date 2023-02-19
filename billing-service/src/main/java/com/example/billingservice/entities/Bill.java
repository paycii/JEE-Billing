package com.example.billingservice.entities;

import com.example.billingservice.model.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
@Entity
@Data
@AllArgsConstructor @NoArgsConstructor
public class Bill {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date billingDate;
    @OneToMany(mappedBy = "bill")
    private Collection<ProductItem> productItems;

    private Long customerID;
    @Transient
    private Customer customer;

    public Bill(Date billingDate, Collection<ProductItem> productItems, Long customerID, Customer customer) {
        this.billingDate = billingDate;
        this.productItems = productItems;
        this.customerID = customerID;
        this.customer = customer;
    }
}
