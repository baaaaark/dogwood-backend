package com.dogwood.treeguide.models;

import java.util.ArrayList;

public class County {

    String countyName;
    ArrayList<String> speciesList = new ArrayList<>();

    public County(String countyName, ArrayList<String> speciesList) {
        this.countyName = countyName;
        this.speciesList = speciesList;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public ArrayList<String> getSpeciesList() {
        return speciesList;
    }

    public void setSpeciesList(ArrayList<String> speciesList) {
        this.speciesList = speciesList;
    }
}
