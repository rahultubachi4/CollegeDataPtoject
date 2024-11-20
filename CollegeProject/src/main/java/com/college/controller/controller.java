package com.college.controller;


import com.college.entity.College;
import com.college.service.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class controller
{

    @Autowired
    private service ser;

    @PostMapping("/save")
    public College saveCollege( @RequestBody College college)
    {
        return ser.saveCollege(college);
    }

    @GetMapping("/findAll")
    public List<College> findAll()
    {
        return ser.findAll();
    }

    @GetMapping("/findById")
    public College findById(@RequestParam  int cid)
    {
        return ser.findById(cid);
    }

    @PutMapping("/update")
    public College collegeUpdate(@RequestBody College college)
    {
        return ser.collegeUpdate(college);
    }

    @DeleteMapping("/deleteById")
    public void deleteCollege(@RequestParam int cid)
    {
         ser.deleteCollege(cid);
    }
}
