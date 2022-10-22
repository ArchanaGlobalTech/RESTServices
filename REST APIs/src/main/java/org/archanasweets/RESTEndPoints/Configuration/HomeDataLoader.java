package org.archanasweets.RESTEndPoints.Configuration;


import lombok.extern.slf4j.Slf4j;
import org.archanasweets.RESTEndPoints.Entity.HomeData;
import org.archanasweets.RESTEndPoints.Repo.HomeDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("h2")
@Slf4j
public class HomeDataLoader implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    HomeData homeData;

    @Autowired
    HomeDataRepo homeDataRepo;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {

        homeData.setTitleText("Archana Sweets");
        homeData.setTelephoneNumber("044-24344440");
        homeData.setTelephoneNumberText("Call us for home delivery");
        homeData.setCenterCarousalHeader("Sweetening lives since 1984");
        homeData.setCenterCarousalLine1("Prompt Door Delivery");
        homeData.setCenterCarousalLine2("Freshly Made Sweets");
        homeData.setCenterCarousalLine3("A hygenic indulgence");
        homeData.setCenterCarousalLine4("Online Order Booking");
        homeData.setTileHeader1("Sweets");
        homeData.setTileHeader2("Savouries");
        homeData.setTileHeader3("Map");

        homeDataRepo.save(homeData);
    }
}
