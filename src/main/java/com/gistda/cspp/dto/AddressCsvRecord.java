package com.gistda.cspp.dto;

import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressCsvRecord {
    @CsvBindByName(column= "AD_LEVEL")
    private Long adLevel;
    @CsvBindByName(column = "TA_ID")
    private Long taId;
    @CsvBindByName(column = "TAMBON_T")
    private String tambonT;
    @CsvBindByName(column = "TAMBON_E")
    private String tambonE;
    @CsvBindByName(column = "AM_ID")
    private Long amId;
    @CsvBindByName(column = "AMPHOE_T")
    private String amphoeT;
    @CsvBindByName(column = "AMPHOE_E")
    private String amphoeE;
    @CsvBindByName(column = "CH_ID")
    private Long chId;
    @CsvBindByName(column = "CHANGWAT_T")
    private String changwatT;
    @CsvBindByName(column = "CHANGWAT_E")
    private String changwatE;
    @CsvBindByName(column = "LAT")
    private Float latitude;
    @CsvBindByName(column = "LONG")
    private Float longitude;
}
