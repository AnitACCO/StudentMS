package com.SMS.StudentsMS.repository;

import com.SMS.StudentsMS.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}