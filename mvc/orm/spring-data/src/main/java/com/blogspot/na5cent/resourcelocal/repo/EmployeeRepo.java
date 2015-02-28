/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blogspot.na5cent.resourcelocal.repo;

import com.blogspot.na5cent.resourcelocal.model.Employee;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author anonymous
 */
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

    Employee findByEmail(String email);

    List<Employee> findByFirstNameLike(String name);

    @Query("SELECT emp FROM Employee emp WHERE LOWER(emp.firstName) LIKE ?1 OR LOWER(emp.lastName) LIKE ?1")
    List<Employee> findByNameLike(String name);
}
