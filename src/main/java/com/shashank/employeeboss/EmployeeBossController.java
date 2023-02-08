package com.shashank.employeeboss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeBossController {

@Autowired
    EmployeeBossService employeeBossService;

@PostMapping("/add_employee")
public String addEmployee(@RequestBody Employee employee){
    return employeeBossService.addEmployee(employee);
}

    @PostMapping("/add_boss")
    public String addBoss(@RequestBody Boss boss){
        return employeeBossService.addBoss(boss);
    }

}
