package com.example.HRM.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Division {
    @Id
    @Column(name = "id",length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String division;
//    @OneToMany(mappedBy = "division")
//    private List<Employee> employees;



}
