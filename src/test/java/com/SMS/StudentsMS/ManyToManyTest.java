package com.SMS.StudentsMS;

import com.SMS.StudentsMS.models.AadharCard;
import com.SMS.StudentsMS.models.School;
import com.SMS.StudentsMS.models.Student;
import com.SMS.StudentsMS.models.Subjects;
import com.SMS.StudentsMS.services.StudentServices;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.security.auth.Subject;
import java.util.*;

@SpringBootTest
public class ManyToManyTest {
    @Autowired
    private StudentServices studentServices;
    private static SessionFactory sessionFactory;
    private Session session;
    @Test
    void saveSS(){

        Student s1 = new Student();
        s1.setName("ABCd");
        s1.setPhone(17351367L);
        s1.setGradeClass(6);

        AadharCard aadharCard1 = new AadharCard();
        aadharCard1.setAadharNumber("1234 1235 4568");
        s1.setAadharCard(aadharCard1);

        Student s2 = new Student();
        s2.setName("defg");
        s2.setPhone(17351367L);
        s2.setGradeClass(6);

        AadharCard aadharCard2 = new AadharCard();
        aadharCard2.setAadharNumber("1234 1236 4568");
        s2.setAadharCard(aadharCard2);

        Student s3 = new Student();
        s3.setName("WXYZ");
        s3.setPhone(17351367L);
        s3.setGradeClass(6);

        AadharCard aadharCard3 = new AadharCard();
        aadharCard3.setAadharNumber("1234 1236 4569");
        s3.setAadharCard(aadharCard3);

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);

        Subjects subject1 = new Subjects();
        subject1.setSubject("Spring");

        Subjects subject2 = new Subjects();
        subject2.setSubject("Java");

        Subjects subject3 = new Subjects();
        subject3.setSubject("Angular");

        Set<Subjects> subjectList = new HashSet<>();
        subjectList.add(subject1);
        subjectList.add(subject2);
        subjectList.add(subject3);

        for (Student stud :students){
            stud.setSubjects(subjectList);
            for(Subjects subject : subjectList){
                subject.getStudent().add(stud);
            }
            //session.persist(subject);

        }
        for(Student student :students) {
            studentServices.addStudent(student);
        }
    }
}
