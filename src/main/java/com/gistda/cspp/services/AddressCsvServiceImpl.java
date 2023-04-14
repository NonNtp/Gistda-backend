package com.gistda.cspp.services;

import com.gistda.cspp.dto.AddressCsvRecord;
import com.opencsv.bean.CsvToBeanBuilder;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

@Service
public class AddressCsvServiceImpl implements AddressCsvService {
    @Override
    public List<AddressCsvRecord> convertAddressCsv(File addressCsvFile) {
        try {
            List<AddressCsvRecord> addressCsvRecords = new CsvToBeanBuilder<AddressCsvRecord>(new FileReader(addressCsvFile))
                    .withType(AddressCsvRecord.class)
                    .build().parse();
            return addressCsvRecords;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
