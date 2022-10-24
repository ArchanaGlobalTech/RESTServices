package org.archanasweets.RESTEndPoints.Repo;

import org.archanasweets.RESTEndPoints.Entity.Pricing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PricingRepo extends JpaRepository<Pricing, Integer> {

}
