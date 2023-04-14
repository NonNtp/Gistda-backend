package com.gistda.cspp.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class AfImgDTO {
    private Long id;
    private String viirsId;
    private Double latitude ;
    private Double longitude ;
    private Double i04Brightness ;
    private Float resolutionAlongScan ;
    private Float resolutionAlongTrack ;
    private Integer detectionConfidence ;
    private Double firePower ;
    private Integer persistentAnomaly ;
    private LocalDate dataDate ;
}
