package org.archanasweets.RESTEndPoints.Service;

import org.archanasweets.RESTEndPoints.Entity.HomeData;
import org.archanasweets.RESTEndPoints.Repo.HomeDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class HomeDataService {

    @Autowired
    HomeDataRepo homeDataRepo;

    public HomeData getHomePageData(){

        HomeData homeData = homeDataRepo.findAll().get(0);
        return homeData;
    }
}
