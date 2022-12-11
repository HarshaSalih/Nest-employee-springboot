package com.example.Nestemployeeapp_backend.controller;

import com.example.Nestemployeeapp_backend.dao.EmployeeDao;
import com.example.Nestemployeeapp_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController

public class EmployeeController {

    @Autowired
    private EmployeeDao dao;


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addEmployee",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> AddEmployee(@RequestBody Employee e)
    {
        System.out.println(e.getName().toString());
        dao.save(e);
        HashMap<String,String >map=new HashMap<>();
        map.put("status","success");
        return map;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/userLogin", consumes = "application/json", produces = "application/json")
    public HashMap<String,String> UserLogin(@RequestBody Employee e){
        List<Employee> result=(List<Employee>) dao.userLogin(e.getUsername(),e.getPassword());
        HashMap<String,String> map = new HashMap<>();
        if(result.size() ==0 ){
            map.put("status","failed");
        }else{
            map.put("status","success");
            map.put("userId",String.valueOf(result.get(0).getId()));
        }
        return map;
    }


}
