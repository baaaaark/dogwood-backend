//package com.dogwood.treeguide.controllers;
//
//import com.dogwood.treeguide.data.TreeRepository;
//import com.dogwood.treeguide.models.Tree;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;


//@RequestMapping
//public class TreeController {
//
//    @Autowired
//    private TreeRepository treeRepository;
//
//    @GetMapping(path="/tree")
//    public @ResponseBody Iterable<Tree> displayAllTrees() {
//        return treeRepository.findAll();
//    }
//}
