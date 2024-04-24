package com.example.programming_project;


import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping(value= "/employee")

public class Employee {

    @CrossOrigin
    @RequestMapping(value = "/studenten" ,method = RequestMethod.GET)
    public String[] getEmployeeGood()
    {
        return new String[]{"Youmni", "Thomas"};
    }

    @CrossOrigin
    @GetMapping("/docent")
    public String[] getEmployeeBad()
    {
        return new String[]{"Johan", "Mehmet"};
    }
}