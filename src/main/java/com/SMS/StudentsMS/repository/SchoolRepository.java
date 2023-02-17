package com.SMS.StudentsMS.repository;

import com.SMS.StudentsMS.models.School;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<School,Integer> {
}
