package com.shashank.employeeboss;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeBossRepository {

    Map<String,Employee> employeeMap=new HashMap<>();
    Map<String,Boss> bossMap=new HashMap<>();

    public String addEmployee(Employee employee){
        String name=employee.getName();
        if(employeeMap.containsKey(name)){
            return "Already employee is there";
        }
        employeeMap.put(name,employee);
        return "Employee added successfully";
    }
    public String addBoss(Boss boss) {
        String name = boss.getName();
        if (bossMap.containsKey(name)) {
            return "Already boss is there";
        }
        bossMap.put(name, boss);
        return "Boss added successfully";
    }
}
