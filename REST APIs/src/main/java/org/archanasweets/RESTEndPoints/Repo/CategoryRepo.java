package org.archanasweets.RESTEndPoints.Repo;

import org.archanasweets.RESTEndPoints.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
