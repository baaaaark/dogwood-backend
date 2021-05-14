package com.dogwood.treeguide.controllers;

import com.dogwood.treeguide.data.CountyRepository;
import com.dogwood.treeguide.models.County;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
public class CountyController {

    @Autowired
    private CountyRepository countyRepository;

    @GetMapping(path="/county")
    public @ResponseBody Iterable<County> displayAllCounties() {
        return countyRepository.findAll();
    }

}

