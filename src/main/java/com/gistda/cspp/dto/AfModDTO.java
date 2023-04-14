package com.gistda.cspp.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Builder
@Data
public class AfModDTO {
    private Long id;
    private String viirsId;
    private Double latitude ;
    private Double longitude ;
    private Double m13Brightness ;
    private Float resolutionAlongScan ;
    private Float resolutionAlongTrack ;
    private Integer detectionConfidence ;
    private Double firePower ;
    private LocalDate dataDate ;
}
