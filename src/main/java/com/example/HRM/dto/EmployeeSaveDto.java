package com.example.HRM.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeSaveDto {
private String name;
    private String nic;
    private String pfn;
    private String mobile;
    private String whatsapp;
    private String emergency;
    private String email;
    private int status;
    private int division;
}
