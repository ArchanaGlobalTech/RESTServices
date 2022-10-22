package org.archanasweets.RESTEndPoints.Entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Data
@Component
@Table(name = "menu_item_table")
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "menu_item_id")
    private int menuItemId;
    @Column(name = "menu_item_name")
    private String menuItemName;
    @Column(name = "menu_item_category")
    private String menuItemCategory;
    @Column(name = "menu_item_price")
    private int menuItemPrice;
    @Column(name = "menu_item_description")
    private String menuItemDescription;
    @Column(name = "menu_today_special_ind")
    private String menuTodaySpecialInd;
    @Column(name = "menu_best_seller_ind")
    private String menuBestSellerInd;
    @Column(name = "menu_image_file_name")
    private String menuImageFileName;
    @Column(name = "menu_availability_ind")
    private String menuAvailabilityInd;

}
