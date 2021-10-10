package com.example.faculty.controller;

import com.example.faculty.entity.Faculty;
import com.example.faculty.service.FacultyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/faculty")
@Slf4j
public class FacultyController {

    @Autowired
    private FacultyService facultyService;

    @PostMapping("/add")
    private Faculty saveFaculty(@RequestBody Faculty faculty){
        log.info("saveFaculty in controller");
        return facultyService.saveFaculty(faculty);
    }

    @GetMapping("/{id}")
    private Faculty findFacultyById(@PathVariable("id") Long facultyId){
        log.info("findFacultyById in controller");
        return facultyService.findFacultyById(facultyId);
    }

    @GetMapping("/")
    private String home(){ return "hdashfjhdsajkfhsjdakf";}
}
