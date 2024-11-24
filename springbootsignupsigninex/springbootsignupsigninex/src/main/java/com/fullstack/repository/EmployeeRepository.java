package com.fullstack.repository;

import com.fullstack.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // Custom Method

    Employee findByEmpEmailIdAndEmpPassword(String empEmailId, String empPassword);


}
