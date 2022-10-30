package org.archanasweets.RESTEndPoints.Repo;

import org.archanasweets.RESTEndPoints.Domain.CatSummary;
import org.archanasweets.RESTEndPoints.Entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MenuRepo extends JpaRepository<Menu, Integer> {

    List<Menu> findByMenuAvailabilityInd(String menuAvailabilityInd);

    @Query("select new org.archanasweets.RESTEndPoints.Domain.CatSummary(menuItemCategory, menuItemSubCategory, count(*)) from Menu group by menuItemCategory,menuItemSubCategory")
    List<CatSummary> findCountByCategories();
    @Query(value="select * from menu_item_table where menu_item_sub_category = ?1 limit 1",nativeQuery = true)
    Menu findOneByMenuItemSubCategory(String menuItemSubCategory);

    List<Menu>findByMenuItemSubCategory(String menuItemSubCategory);
}
