package com.example.HRM.controller;

import com.example.HRM.entity.Status;
import com.example.HRM.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("employee/v1")
@CrossOrigin("http://localhost:3000")
public class StatusController {
    @Autowired
    private StatusService statusService;

    @GetMapping("/get-all-status")
    public List<Status> viewAllStatus() {
        return statusService.viewAllStatus();
    }
}
