package com.gistda.cspp.services;

import com.gistda.cspp.dto.AfImgCsvRecord;

import java.io.File;
import java.util.List;

public interface AfImgCsvService {
    List<AfImgCsvRecord> convertAfImgCsv(File afImgCsvFile) ;
}
