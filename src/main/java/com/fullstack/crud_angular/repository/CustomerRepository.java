package com.fullstack.crud_angular.repository;

import com.fullstack.crud_angular.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository <Customer, Integer> {
}
