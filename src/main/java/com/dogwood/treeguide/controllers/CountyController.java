package com.dogwood.treeguide.controllers;

import com.dogwood.treeguide.data.csv.CSVConverter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping
public class CountyController {

    @GetMapping(path = "tree/all")
    public ArrayList<HashMap<String, String>> getAllTrees(){
        return CSVConverter.findAllTrees();
    }

    @GetMapping(path = "tree/county")
    public HashMap<String, List<String>> getAllCounties(){
        return CSVConverter.findAllCounties();
    }


}

