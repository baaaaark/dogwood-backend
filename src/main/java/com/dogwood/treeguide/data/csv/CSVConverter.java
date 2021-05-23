package com.dogwood.treeguide.data.csv;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.*;
import java.util.*;

public class CSVConverter {


    private static Boolean isDataLoaded = false;
    private static ArrayList<HashMap<String, String>> allTrees;
    private static HashMap<String, List<String>> allCounties = new HashMap<>();

    public static ArrayList<HashMap<String, String>> findAllTrees() {

        loadData();

        return allTrees;
    }

    public static HashMap<String, List<String>> findAllCounties() {

        loadData();

        List<String> allCountyArray = new ArrayList<>(Arrays.asList("Arkansas","Ashley","Baxter","Benton","Boone","Bradley","Calhoun","Carroll","Chicot","Clark","Clay","Cleburne","Cleveland","Columbia","Conway","Craighead","Crawford","Crittenden","Cross","Dallas","Desha","Drew","Faulkner","Franklin","Fulton","Garland","Grant","Greene","Hempstead","Hot Spring","Howard","Independence","Izard","Jackson","Jefferson","Johnson","Lafayette","Lawrence","Lee","Lincoln","Little River","Logan","Lonoke","Madison","Marion","Miller","Mississippi","Monroe","Montgomery","Nevada","Newton","Ouachita","Perry","Phillips","Pike","Poinsett","Polk","Pope","Prairie","Pulaski","Randolph","Saline","Scott","Searcy","Sebastian","Sevier","Sharp","St. Francis","Stone","Union","Van Buren","Washington","White","Woodruff","Yell"));

        for (HashMap<String, String> row : allTrees) {

            String treeName = row.get("scientific_name");
            String countyList = row.get("county");
            countyList = countyList.substring( 3 , countyList.length() - 1 );
            String[] treeCountyArray = countyList.split(", ");
            List<String> treeCountyList = new ArrayList<>(Arrays.asList(treeCountyArray));

            for (String allCounty: allCountyArray) {
                List<String> countyTreeList =  new ArrayList<>();

                for (String county : treeCountyList) {
                    if (county.toLowerCase().contains(allCounty.toLowerCase())) {
                        countyTreeList.add(treeName);
                    }
                    allCounties.put(county, countyTreeList);
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
            Integer numberOfColumns = records.get(0).size();
            String[] headers = parser.getHeaderMap().keySet().toArray(new String[numberOfColumns]);

            allTrees = new ArrayList<>();

            for (CSVRecord record : records) {
                HashMap<String, String> newCounty = new HashMap<>();

                for (String headerLabel : headers) {

                    newCounty.put(headerLabel, record.get(headerLabel));
                }

                allTrees.add(newCounty);
            }

            isDataLoaded = true;

        } catch (IOException e) {
            System.out.println("Failed to load county data");
            e.printStackTrace();
        }
    }
}
