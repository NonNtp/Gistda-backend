package com.gistda.cspp.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "AD_LEVEL")
    private Long adLevel;
    @Column(name = "SDT_ID")
    private Long sdtId;
    @Column(name = "SUBDISTRICT_T")
    private String subDistrictT;
    @Column(name = "SUBDISTRICT_E")
    private String subDistrictE;
    @Column(name = "DT_ID")
    private Long dtId;
    @Column(name = "DISTRICT_T")
    private String districtT;
    @Column(name = "DISTRICT_E")
    private String districtE;
    @Column(name = "PV_ID")
    private Long pvId;
    @Column(name = "PROVINCE_T")
    private String provinceT;
    @Column(name = "PROVINCE_E")
    private String provinceE;
    @Column(name = "LATITUDE")
    private Float latitude;
    @Column(name = "LONGITUDE")
    private Float longitude;


}
