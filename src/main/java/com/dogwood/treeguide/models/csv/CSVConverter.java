package com.dogwood.treeguide.models.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CSVConverter {

    private static final String COUNTY_DATA = "TreeLocationData.csv";
    private static Boolean isDataLoaded = false;

    private static ArrayList<HashMap<String, String>> allCounties;

    public static ArrayList<HashMap<String, String>> findAll() {

        loadData();

        return allCounties;
    }

    private static void loadData() {


        if (isDataLoaded) {
            return;
        }

        try {

            Reader in = new FileReader(COUNTY_DATA);
            CSVParser parser = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
            List<CSVRecord> records = parser.getRecords();
            Integer numberOfColumns = records.get(0).size();
            String[] headers = parser.getHeaderMap().keySet().toArray(new String[numberOfColumns]);

            allCounties = new ArrayList<>();

            for (CSVRecord record : records) {
                HashMap<String, String> newCounty = new HashMap<>();

                for (String headerLabel : headers) {
                    newCounty.put(headerLabel, record.get(headerLabel));
                }

                allCounties.add(newCounty);
            }

            // flag the data as loaded, so we don't do it twice
            isDataLoaded = true;

        } catch (IOException error) {
            System.out.println("Failed to load job data");
            error.printStackTrace();
        }
    }

}
