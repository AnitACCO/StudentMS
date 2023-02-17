package com.SMS.StudentsMS;

import com.SMS.StudentsMS.models.AadharCard;
import com.SMS.StudentsMS.models.School;
import com.SMS.StudentsMS.models.Student;
import com.SMS.StudentsMS.services.SchoolServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class OneToManyTests {

    @Autowired
    private SchoolServices schoolServices;

    @Test
    void saveStudents(){
        School school1 = new School();
        school1.setSchool_name("Accolite");
        school1.setAddress("Bangalore");

        Student s1 = new Student();
        s1.setName("ABC");
        s1.setPhone(17351367L);
        s1.setGradeClass(6);

        AadharCard aadharCard1 = new AadharCard();
        aadharCard1.setAadharNumber("1234 1234 4568");
        s1.setAadharCard(aadharCard1);

        Student s2 = new Student();
        s2.setName("def");
        s2.setPhone(17351367L);
        s2.setGradeClass(6);

        AadharCard aadharCard2 = new AadharCard();
        aadharCard2.setAadharNumber("1234 1234 4568");
        s2.setAadharCard(aadharCard2);

        Student s3 = new Student();
        s3.setName("XYZ");
        s3.setPhone(17351367L);
        s3.setGradeClass(6);

        AadharCard aadharCard3 = new AadharCard();
        aadharCard3.setAadharNumber("1234 1234 4569");
        s3.setAadharCard(aadharCard3);

        school1.getStudents().add(s1);
        school1.getStudents().add(s2);
        school1.getStudents().add(s2);

        schoolServices.addSchool(school1);
    }

}
