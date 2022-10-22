package org.archanasweets.RESTEndPoints.Entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Data
@Entity(name = "home_meta_data")
public class HomeData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "home_data_key")
    private Integer homeDataKey;
    @Column(name = "title_text")
    private String titleText;
    @Column(name = "telephone_number")
    private String telephoneNumber;
    @Column(name = "telephone_number_text")
    private String telephoneNumberText;
    @Column(name = "center_carousal_header")
    private String centerCarousalHeader;
    @Column(name = "center_carousal_line_1")
    private String centerCarousalLine1;
    @Column(name = "center_carousal_line_2")
    private String centerCarousalLine2;
    @Column(name = "center_carousal_line_3")
    private String centerCarousalLine3;
    @Column(name = "center_carousal_line_4")
    private String centerCarousalLine4;
    @Column(name = "tile_header_1")
    private String tileHeader1;
    @Column(name = "tile_header_2")
    private String tileHeader2;
    @Column(name = "tile_header_3")
    private String tileHeader3;

    public HomeData() {
    }
}
