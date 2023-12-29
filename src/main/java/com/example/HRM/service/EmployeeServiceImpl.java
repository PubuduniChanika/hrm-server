package com.example.HRM.service;

import com.example.HRM.dto.EmployeeSaveDto;
import com.example.HRM.dto.ViewEmployeeDto;
import com.example.HRM.entity.Employee;
import com.example.HRM.exception.NotFoundException;
import com.example.HRM.repository.DivisionRepository;
import com.example.HRM.repository.EmployeeRepository;
import com.example.HRM.repository.StatusRepository;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private StatusRepository statusRepository;
    @Autowired
    private DivisionRepository divisionRepository;

    @Override
    public String saveEmployee(EmployeeSaveDto employeeSaveDto){
        Employee employee = new Employee(
                employeeSaveDto.getName(),
                employeeSaveDto.getNic(),
                employeeSaveDto.getPfn(),
                employeeSaveDto.getMobile(),
                employeeSaveDto.getWhatsapp(),
                employeeSaveDto.getEmergency(),
                employeeSaveDto.getEmail(),
                statusRepository.getReferenceById(employeeSaveDto.getStatus()),
                divisionRepository.getReferenceById(employeeSaveDto.getDivision())

        );
        employeeRepository.save(employee);

        return "saved!!!";
    }

    @Override
    public List<ViewEmployeeDto> viewAllEmployees() {
        List<Employee> allEmployees = employeeRepository.findAll();
        if(allEmployees.size()>0) {
            List<ViewEmployeeDto> viewEmployeeDtos = modelMapper.map(allEmployees, new TypeToken<List<ViewEmployeeDto>>() {
            }.getType());
            return viewEmployeeDtos;
        }else{
            throw new NotFoundException("Employees Not Found");
        }
    }
}
