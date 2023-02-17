package com.SMS.StudentsMS.services;

import com.SMS.StudentsMS.models.School;
import com.SMS.StudentsMS.models.Student;
import com.SMS.StudentsMS.repository.SchoolRepository;
import com.SMS.StudentsMS.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolServices {
    @Autowired
    private SchoolRepository schoolRepository;

    public void addSchool(School sc){
        schoolRepository.save(sc);
    }

    public School findById(Integer id){
        return schoolRepository.findById(id).get();
    }

    public List<School> getAllSchool(){
        return schoolRepository.findAll();
    }

}
