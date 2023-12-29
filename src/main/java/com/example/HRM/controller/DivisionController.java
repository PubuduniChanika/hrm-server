package com.example.HRM.controller;

import com.example.HRM.entity.Division;
import com.example.HRM.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee/v1")
@CrossOrigin("http://localhost:3000")
public class DivisionController {
    @Autowired
    private DivisionService divisionService;

    @GetMapping("/get-all-divisions")
    public List<Division> viewAllDivisions() {
        return divisionService.viewAllDivisions();
    }
}
