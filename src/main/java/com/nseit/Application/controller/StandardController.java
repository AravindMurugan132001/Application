package com.nseit.Application.controller;

import com.nseit.Application.model.Standard;
import com.nseit.Application.service.StandardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping

public class StandardController {

    @Autowired
    public StandardService standardService;

    @PostMapping
    public void addStandard(@RequestBody Standard standard){
        standardService.addStandard(standard);
    }

    @PutMapping
    public void updateStandard(@RequestBody Standard standard){
        standardService.updateStandard(standard);
    }
    @GetMapping("/all")
    public List<Standard> viewStandard( ){
        return standardService.viewStandard();
    }
    @DeleteMapping("/{id}")
    public void deleteStandard(@PathVariable int id){
        standardService.deleteStandard(id);
    }



}
