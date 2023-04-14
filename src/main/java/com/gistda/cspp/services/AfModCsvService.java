package com.gistda.cspp.services;

import com.gistda.cspp.dto.AfModCsvRecord;

import java.io.File;
import java.util.List;

public interface AfModCsvService {
    List<AfModCsvRecord> convertAfModCsv(File afModCsvFile) ;
}
