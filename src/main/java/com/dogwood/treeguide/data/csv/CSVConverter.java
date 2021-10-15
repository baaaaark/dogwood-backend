package com.dogwood.treeguide.data.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.*;
import java.util.*;

public class CSVConverter {


    private static Boolean isDataLoaded = false;
    private static ArrayList<HashMap<String, String>> allTrees;
    private static HashMap<String, String> eachTree;
    private static TreeMap<String, List<HashMap<String, String>>> allCounties = new TreeMap<>();

    public static ArrayList<HashMap<String, String>> findAllTrees() {

        loadData();

        return allTrees;
    }

    public static TreeMap<String, List<HashMap<String, String>>> findAllCounties() {

        loadData(); //returns an HashMap<String, String> of

        for (HashMap<String, String> row : allTrees) {

            String treeName = row.get("scientific_name");
            String countyList = row.get("county");

            List<String> treeCountyList = new ArrayList<>(Arrays.asList(countyList.substring( 3 , countyList.length() - 1 ).split(", ")));

            for (String county: treeCountyList) {
                if (allCounties.containsKey(county)) {
                    allCounties.get(county).add(eachTree);
                }
                else {
                    allCounties.put(county, new ArrayList<HashMap<String, String>>());
                    allCounties.get(county).add(eachTree); //this is where a map of each species will go

                }
            }
        }
        return allCounties;
    }

    private static void loadData() {

        if (isDataLoaded) {
            return;
        }

        try {

            Reader in = new FileReader("/home/jason/Development/Projects/Dogwood/dogwood-backend/src/main/java/com/dogwood/treeguide/data/csv/LOCATION_DATA.csv");
            CSVParser parser = CSVFormat.RFC4180.withFirstRecordAsHeader().parse(in);
            List<CSVRecord> records = parser.getRecords();
            int numberOfColumns = records.get(0).size();
            String[] headers = parser.getHeaderMap().keySet().toArray(new String[numberOfColumns]);

            allTrees = new ArrayList<>();

            for (CSVRecord record : records) {
                HashMap<String, String> newTree = new HashMap<>();

                for (String headerLabel : headers) {

                    newTree.put(headerLabel, record.get(headerLabel));
                }

                allTrees.add(newTree);
            }

            isDataLoaded = true;

        } catch (IOException e) {
            System.out.println("Failed to load county data");
            e.printStackTrace();
        }
    }
}
