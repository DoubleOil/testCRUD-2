package com.example.testCRUD2.employeeropository;

import com.example.testCRUD2.employeeentity.EmployeeEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
}
