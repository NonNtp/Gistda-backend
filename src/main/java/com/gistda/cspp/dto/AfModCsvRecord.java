package com.gistda.cspp.dto;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AfModCsvRecord {
    @CsvBindByName(column = "viirs_id")
    private Integer viirsID ;
    @CsvBindByName(column = "latitude")
    private Double latitudeCSV ;
    @CsvBindByName(column = "longitude")
    private Double longitudeCSV ;
    @CsvBindByName(column = "brightness")
    private Double m13Brightness ;
    @CsvBindByName(column = "resolution_along_scan")
    private Float resolutionAlongScan ;
    @CsvBindByName(column = "resolution_along_track")
    private Float resolutionAlongTrack ;
    @CsvBindByName(column = "detection_confidence")
    private Integer detectionConfidence ;
    @CsvBindByName(column = "fire_power")
    private Double firePower ;
    @CsvBindByName(column = "date")
    @CsvDate("yyyy-MM-dd")
    private LocalDate dataDate ;
}
