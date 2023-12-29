package com.example.HRM.service;

import com.example.HRM.entity.Division;
import com.example.HRM.exception.NotFoundException;
import com.example.HRM.repository.DivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DivisionServiceImpl implements DivisionService{
    @Autowired
    private DivisionRepository divisionRepository;
    @Override
    public List<Division> viewAllDivisions(){
        List<Division> allDivisions = divisionRepository.findAll();
        if(allDivisions.size()>0) {
            return allDivisions;
        }else{
            throw new NotFoundException("Employees Not Found");
        }
    }

}
