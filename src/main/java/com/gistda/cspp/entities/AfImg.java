package com.gistda.cspp.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class AfImg {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dataDate ;
}
