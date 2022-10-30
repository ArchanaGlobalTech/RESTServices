package org.archanasweets.RESTEndPoints.Repo;

import org.archanasweets.RESTEndPoints.Entity.Pricing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PricingRepo extends JpaRepository<Pricing, Integer> {
    List<Pricing> findByMenuItemId(int menuItemId);
}
