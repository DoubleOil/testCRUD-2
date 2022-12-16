package com.example.testCRUD2.emplyeeservice;


import com.example.testCRUD2.employeeentity.EmployeeEntity;
import com.example.testCRUD2.employeeropository.EmployeeRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


    private static EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository =employeeRepository;
        ;
    }

    public List<EmployeeEntity> getListAll() {

        return employeeRepository.findAll();
    }
    public EmployeeEntity getEmployeeById(long id) {

        return employeeRepository.findById(id).get();
    }
    public void save(EmployeeEntity employeeEntity) {

        employeeRepository.save(employeeEntity);
    }

    public void delete(long id) {
        employeeRepository.deleteById(id);
    }
}
