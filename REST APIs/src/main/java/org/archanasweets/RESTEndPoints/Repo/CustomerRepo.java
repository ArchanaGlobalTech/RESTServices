package org.archanasweets.RESTEndPoints.Repo;

import org.archanasweets.RESTEndPoints.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
