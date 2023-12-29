package com.example.HRM.controller;


import com.example.HRM.dto.EmployeeSaveDto;
import com.example.HRM.dto.ViewEmployeeDto;
import com.example.HRM.repository.EmployeeRepository;
import com.example.HRM.service.EmployeeService;
import com.example.HRM.util.mappers.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("employee/v1")
@CrossOrigin("http://localhost:3000")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private EmployeeRepository employeeRepository;


    @PostMapping("/save")
    public ResponseEntity<StandardResponse> saveEmployee(@RequestBody EmployeeSaveDto employeeSaveDto) {
        String message = employeeService.saveEmployee(employeeSaveDto);
        return new ResponseEntity<StandardResponse>(
                new StandardResponse(201,"success",message),
                HttpStatus.CREATED
        );
    }

    @GetMapping("/get-all-employees")
    public ResponseEntity<StandardResponse> viewAllEmployees() {
        List<ViewEmployeeDto> message = employeeService.viewAllEmployees();
        return new ResponseEntity<StandardResponse>(
                new StandardResponse(200,"success",message),
                HttpStatus.CREATED
        );

    }
//    @GetMapping("/get-all-employees")
//    public List<Employee> viewAllEmployees() {
//
//        return employeeRepository.findAll();
//    }
}
