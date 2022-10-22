package org.archanasweets.online.Controller;

import lombok.extern.slf4j.Slf4j;
import org.archanasweets.online.Domain.HomeMetaData;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Controller
@RequestMapping(path = "/sweetpeople")
public class MainController {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @GetMapping(path = "/home")
    public String getHomePage(Model model, RestTemplate restTemplate){

        HomeMetaData homeMetaData = restTemplate.getForObject(
                "http://localhost:8081/sweetpeople/home", HomeMetaData.class);
        model.addAttribute("metahome",homeMetaData);
        return "homepage";
    }

    @GetMapping(path = "/menu")
    public String getMenuPage(Model model){
        return "menu";
    }

    @GetMapping(path = "/about")
    public String getAboutPage(Model model){
        return "about";
    }

    @GetMapping(path = "/contact")
    public String getContactPage(Model model){
        return "contact";
    }

    @GetMapping(path = "/reservation")
    public String getReservationPage(Model model){
        return "reservation";
    }

    @GetMapping(path = "/service")
    public String getServicePage(Model model){
        return "service";
    }

    @GetMapping(path = "/testimonial")
    public String getTestimonialPage(Model model){
        return "testimonial";
    }
}
