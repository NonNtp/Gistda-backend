package com.gistda.cspp.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AddressDTO {
    private Long id;
    private Long adLevel;
    private Long sdtId;
    private String subDistrictT;
    private String subDistrictE;
    private Long dtId;
    private String districtT;
    private String districtE;
    private Long pvId;
    private String provinceT;
    private String provinceE;
    private Float latitude;
    private Float longitude;

}
