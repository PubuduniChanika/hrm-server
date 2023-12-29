package com.example.HRM.service;

import com.example.HRM.entity.Status;
import com.example.HRM.exception.NotFoundException;
import com.example.HRM.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StatusServiceImpl implements StatusService{
    @Autowired
    private StatusRepository statusRepository;
    @Override
    public List<Status> viewAllStatus(){
        List<Status> allStatus = statusRepository.findAll();
        if(allStatus.size()>0) {
            return allStatus;
        }else{
            throw new NotFoundException("Employees Not Found");
        }
    }
}
