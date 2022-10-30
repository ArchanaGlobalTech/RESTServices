package org.archanasweets.RESTEndPoints.Repo;

import org.archanasweets.RESTEndPoints.Entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepo extends JpaRepository<Cart, Integer> {

}
