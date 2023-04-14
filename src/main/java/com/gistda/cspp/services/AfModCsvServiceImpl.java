package com.gistda.cspp.services;

import com.gistda.cspp.dto.AfImgCsvRecord;
import com.gistda.cspp.dto.AfModCsvRecord;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

@Service
public class AfModCsvServiceImpl implements AfModCsvService {
    @Override
    public List<AfModCsvRecord> convertAfModCsv(File afModCsvFile) {
        try {
            List<AfModCsvRecord> afModCsvRecords = new CsvToBeanBuilder<AfModCsvRecord>(new FileReader(afModCsvFile))
                    .withType(AfModCsvRecord.class)
                    .build().parse();
            return afModCsvRecords;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
