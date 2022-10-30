package org.archanasweets.RESTEndPoints.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.archanasweets.RESTEndPoints.Entity.Category;
import org.archanasweets.RESTEndPoints.Entity.HomeData;
import org.archanasweets.RESTEndPoints.Entity.Menu;
import org.archanasweets.RESTEndPoints.Entity.Pricing;
import org.archanasweets.RESTEndPoints.Repo.CategoryRepo;
import org.archanasweets.RESTEndPoints.Repo.MenuRepo;
import org.archanasweets.RESTEndPoints.Repo.PricingRepo;
import org.archanasweets.RESTEndPoints.Service.HomeDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Slf4j
@RestController
@CrossOrigin
@RequestMapping(path = "/sweetpeople")
public class MainController {

    @Autowired
    HomeDataService homeDataService;

    @Autowired
    MenuRepo menuRepo;

    @Autowired
    CategoryRepo categoryRepo;

    @Autowired
    PricingRepo pricingRepo;

    @GetMapping(path = "/home")
    public HomeData getHomePage(){
        return homeDataService.getHomePageData();
    }

    @GetMapping(path = "/category/sweets")
    public List<Category> getSweetCategories(String menuItemCategory) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        menuItemCategory = "Sweet";
        return categoryRepo.findByMenuItemCategory(menuItemCategory);
    }

    @GetMapping(path = "/category/savouries")
    public List<Category> getSavouriesCategories(String menuItemCategory) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        menuItemCategory = "Savouries";
        return categoryRepo.findByMenuItemCategory(menuItemCategory);
    }

    @GetMapping(path = "/items/{menuItemSubCategory}")
    public List<Menu> getMenuItems(@PathVariable String menuItemSubCategory) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return menuRepo.findByMenuItemSubCategory(menuItemSubCategory);
    }
    @GetMapping(path = "/pricing/{menuItemId}")
    public List<Pricing> getPricing(@PathVariable int menuItemId) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return pricingRepo.findByMenuItemId(menuItemId);
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
