package ffx.customerservice.controllers;

import ffx.customerservice.entities.Customer;
import ffx.customerservice.repositories.CustomerRepo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
@AllArgsConstructor
public class CustomerController {

    private CustomerRepo customerRepository;

    @GetMapping
    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable("id") Long id){
        return customerRepository.findById(id).get();
    }
}
