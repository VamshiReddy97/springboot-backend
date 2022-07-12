package com.javaintern.springbootbackend.repository;

import com.javaintern.springbootbackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    //all crud operations write her
}
