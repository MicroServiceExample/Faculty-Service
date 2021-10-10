package com.example.faculty.service;

import com.example.faculty.entity.Faculty;
import com.example.faculty.repository.FacultyRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FacultyService {

    @Autowired
    private FacultyRepository facultyRepository;

    public Faculty saveFaculty(Faculty faculty){
        log.info("saveFaculty");
        return facultyRepository.save(faculty);
    }

    public Faculty findFacultyById(Long facultyId){
        log.info("findFacultyById");
        return facultyRepository.findById(facultyId).get();
    }
}
