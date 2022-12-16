package com.example.testCRUD2.employeerestcontroller;


import com.example.testCRUD2.employeeentity.EmployeeEntity;
import com.example.testCRUD2.emplyeeservice.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class EmployeeRestController {

    @Autowired
    public EmployeeService employeeService;

    @GetMapping("/api")
    public List<EmployeeEntity> getListAll(){

        return employeeService.getListAll();

    }@GetMapping("/api/{id}")
    public EmployeeEntity getEmployeeById(@PathVariable long id){

        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/api/add")
    public long add(@RequestBody EmployeeEntity employeeEntity){
        employeeService.save(employeeEntity);
        return employeeEntity.getId();
    }

    @PutMapping("/api/update/{id}")
    public EmployeeEntity update(@RequestBody EmployeeEntity employeeEntity , @PathVariable long id){
        employeeEntity.setId(id);
        employeeService.save(employeeEntity);
        return employeeEntity;
    }

    @DeleteMapping("/api/delete/{id}")
    public void delete(@PathVariable long id){
        employeeService.delete(id);
    }


}
