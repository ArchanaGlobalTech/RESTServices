package org.archanasweets.RESTEndPoints.Controller;

import lombok.extern.slf4j.Slf4j;
import org.archanasweets.RESTEndPoints.Entity.HomeData;
import org.archanasweets.RESTEndPoints.Service.HomeDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@CrossOrigin
@RequestMapping(path = "/sweetpeople")
public class MainController {

    @Autowired
    HomeDataService homeDataService;

    @GetMapping(path = "/home")
    public HomeData getHomePage(){
        return homeDataService.getHomePageData();
    }

    @GetMapping(path = "/menu")
    public String getMenuPage(){
        return "menu";
    }

    @GetMapping(path = "/about")
    public String getAboutPage(){
        return "about";
    }

    @GetMapping(path = "/contact")
    public String getContactPage(){
        return "contact";
    }

    @GetMapping(path = "/reservation")
    public String getReservationPage(){
        return "reservation";
    }

    @GetMapping(path = "/service")
    public String getServicePage(){
        return "service";
    }

    @GetMapping(path = "/testimonial")
    public String getTestimonialPage(){
        return "testimonial";
    }
}