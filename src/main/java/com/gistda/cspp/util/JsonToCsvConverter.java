package com.gistda.cspp.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonToCsvConverter {
    public List<Object> readJsonFiles(List<String> jsonFilePaths) throws IOException {
        List<Object> dataList = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        for (String jsonFilePath : jsonFilePaths) {
            ObjectReader objectReader = objectMapper.readerFor(Object.class);
            dataList.addAll(objectReader.<List<Object>>readValue(new File(jsonFilePath)));
        }
        return dataList;
    }

    public void writeCsv(String csvFilePath, List<Object> dataList) throws IOException {
        CsvMapper csvMapper = new CsvMapper();
        CsvSchema csvSchema = csvMapper.schemaFor(Object.class).withHeader();
        ObjectWriter objectWriter = csvMapper.writerFor(Object.class).with(csvSchema);
        objectWriter.writeValue(new File(csvFilePath), dataList);
    }

    public static void main(String[] args) throws IOException {
        List<String> jsonFilePathsAfImg = new ArrayList<>();
        jsonFilePathsAfImg.add("AFIMG_20230131.json");
        jsonFilePathsAfImg.add("AFIMG_20230202.json");

        List<String> jsonFilePathsAfMod = new ArrayList<>();
        jsonFilePathsAfMod.add("AFMOD_20230131.json");
        jsonFilePathsAfMod.add("AFMOD_20230202.json");

        String csvFilePathAfImg = "afimg.csv";
        String csvFilePathAfMod = "afmod.csv";

        JsonToCsvConverter converterAfImg = new JsonToCsvConverter();
        List<Object> dataListAfImg = converterAfImg.readJsonFiles(jsonFilePathsAfImg);
        converterAfImg.writeCsv(csvFilePathAfImg, dataListAfImg);

        JsonToCsvConverter converterAfMod = new JsonToCsvConverter();
        List<Object> dataListAfMod = converterAfMod.readJsonFiles(jsonFilePathsAfMod);
        converterAfMod.writeCsv(csvFilePathAfMod, dataListAfMod);
    }
}
