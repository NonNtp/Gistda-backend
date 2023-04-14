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
public class AfMod {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String viirsId;

    private Double latitude ;

    private Double longitude ;

    private Double m13Brightness ;

    private Float resolutionAlongScan ;

    private Float resolutionAlongTrack ;

    private Integer detectionConfidence ;

    private Double firePower ;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dataDate ;
}
