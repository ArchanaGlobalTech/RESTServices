package org.archanasweets.RESTEndPoints.Repo;

import org.archanasweets.RESTEndPoints.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

    List<Category> findByMenuItemCategory(String menuItemCategory);
}
