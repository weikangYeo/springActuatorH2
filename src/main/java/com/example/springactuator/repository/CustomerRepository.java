package com.example.springactuator.repository;

import com.example.springactuator.entity.Customer;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String> {

    List<Customer> findAll();

}
