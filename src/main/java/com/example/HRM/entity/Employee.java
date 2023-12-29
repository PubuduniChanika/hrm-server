package com.example.HRM.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Employee {
    @Id
    @Column(length = 45)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String nic;
    private String pfn;
    private String mobile;
    private String whatsapp;
    private String emergency;
    private String email;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "status_id", referencedColumnName = "id")
    private Status status;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "division_id", referencedColumnName = "id")
    private Division division;

    public Employee(String name, String nic, String pfn, String mobile, String whatsapp, String emergency, String email, Status status, Division division) {
        this.name = name;
        this.nic = nic;
        this.pfn = pfn;
        this.mobile = mobile;
        this.whatsapp = whatsapp;
        this.emergency = emergency;
        this.email = email;
        this.status = status;
        this.division = division;
    }


}

