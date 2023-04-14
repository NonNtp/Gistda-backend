package com.gistda.cspp.services;

import com.gistda.cspp.dto.AddressCsvRecord;

import java.io.File;
import java.util.List;

public interface AddressCsvService {
    List<AddressCsvRecord> convertAddressCsv(File addressCsvFile) ;
}
