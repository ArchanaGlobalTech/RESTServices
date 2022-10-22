package org.archanasweets.RESTEndPoints.Repo;

import org.archanasweets.RESTEndPoints.Entity.HomeData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeDataRepo extends JpaRepository<HomeData, Integer> {

}
