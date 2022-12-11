package com.example.Nestemployeeapp_backend.dao;

import com.example.Nestemployeeapp_backend.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    @Query(value = "SELECT `id`,`confirm_password`,`designation`, `email`, `emp_code`, `name`, `password`, `phone`, `username` FROM `employee` WHERE `username` =:username AND `password` =:password",nativeQuery = true)
    List<Employee>userLogin(@Param("username")String username,@Param("password")String password);

}
