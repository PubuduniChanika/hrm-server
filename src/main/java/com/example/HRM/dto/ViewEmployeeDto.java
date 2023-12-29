package com.example.HRM.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ViewEmployeeDto {
    private String nic;
    private String name;
    private String pfn;
    private String mobile;
    private String whatsapp;
    private String emergency;
    private String email;
    private String status;
    private String division;
}

