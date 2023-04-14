package com.gistda.cspp.services;

import com.gistda.cspp.dto.AddressCsvRecord;
import com.gistda.cspp.dto.AfImgCsvRecord;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
@Service
public class AfImgCsvServiceImpl implements AfImgCsvService {
    @Override
    public List<AfImgCsvRecord> convertAfImgCsv(File afImgCsvFile) {
        try {
            List<AfImgCsvRecord> afImgCsvRecords = new CsvToBeanBuilder<AfImgCsvRecord>(new FileReader(afImgCsvFile))
                    .withType(AfImgCsvRecord.class)
                    .build().parse();
            return afImgCsvRecords;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
