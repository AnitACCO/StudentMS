package com.SMS.StudentsMS.services;

import com.SMS.StudentsMS.models.Student;
import com.SMS.StudentsMS.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {

    @Autowired
    private StudentRepository studentRepository;

    public void addStudent(Student student){
        studentRepository.save(student);
    }

    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }

}
