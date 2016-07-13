package com.learning.repository;

import com.learning.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by amits on 13/07/16.
 */
@Repository
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
