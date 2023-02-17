package com.SMS.StudentsMS;

import com.SMS.StudentsMS.models.AadharCard;
import com.SMS.StudentsMS.models.Student;
import com.SMS.StudentsMS.services.StudentServices;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentsMsApplicationTests {
	@Autowired
	private StudentServices studentServices;

	@Test
	void contextLoads() {
		Student s1 = new Student();
		s1.setName("Hrushikesh");
		s1.setPhone(17351367L);
		s1.setGradeClass(6);

		AadharCard aadharCard = new AadharCard();
		aadharCard.setAadharNumber("1234 1234 4567");
		s1.setAadharCard(aadharCard);
		studentServices.addStudent(s1);


		List<Student> slist = studentServices.getAllStudent();
		System.out.println(slist);
	}

}
