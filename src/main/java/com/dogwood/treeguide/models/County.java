package com.dogwood.treeguide.models;

import com.dogwood.treeguide.models.csv.CSVConverter.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Entity
public class County {

    @Id
    @Autowired
    @GeneratedValue
    private Long id;
    private List<String> allCounties = new ArrayList<>(Arrays.asList("Arkansas","Ashley","Baxter","Benton","Boone","Bradley","Calhoun","Carroll","Chicot","Clark","Clay","Cleburne","Cleveland","Columbia","Conway","Craighead","Crawford","Crittenden","Cross","Dallas","Desha","Drew","Faulkner","Franklin","Fulton","Garland","Grant","Greene","Hempstead","Hot Spring","Howard","Independence","Izard","Jackson","Jefferson","Johnson","Lafayette","Lawrence","Lee","Lincoln","Little River","Logan","Lonoke","Madison","Marion","Miller","Mississippi","Monroe","Montgomery","Nevada","Newton","Ouachita","Perry","Phillips","Pike","Poinsett","Polk","Pope","Prairie","Pulaski","Randolph","Saline","Scott","Searcy","Sebastian","Sevier","Sharp","St. Francis","Stone","Union","Van Buren","Washington","White","Woodruff","Yell"));

    public County(Long id, List<String> allCounties) {
        this.id = id;
        this.allCounties = allCounties;
    }

    public County() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getAllCounties() {
        return allCounties;
    }

    public void setAllCounties(List<String> allCounties) {
        this.allCounties = allCounties;
    }
}
