package com.shashank.employeeboss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeBossService {

    @Autowired
    EmployeeBossRepository employeeBossRepository;

    public String addEmployee(Employee employee){
        return employeeBossRepository.addEmployee(employee);
    }
    public String addBoss(Boss boss){
        return employeeBossRepository.addBoss(boss);
    }
}
