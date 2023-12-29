package com.example.HRM.service;

import com.example.HRM.dto.EmployeeSaveDto;
import com.example.HRM.dto.ViewEmployeeDto;
import java.io.IOException;
import java.util.List;

public interface EmployeeService{
    String saveEmployee(EmployeeSaveDto employeeSaveDto);
    List<ViewEmployeeDto> viewAllEmployees();
}
