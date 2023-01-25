import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Student;
import model.StudentBusinessLogic;


/**
 * @author abhit - aryan9
 * CIS175 - Spring 2023
 * Jan 24, 2023
 */

public class StudentTest {
	String name = "Seth";
	String id = "975672";
	StudentBusinessLogic studentBL = new StudentBusinessLogic();
	Student student = new Student(name, id);

	@Before
	public void setUp() throws Exception {
		
	}
	
	@Test
	public void testStudentWelcomeMessage() {
		String studentMessage = "Hello Seth! Welcome to East City High School. Your student ID is: 975672";
		assertEquals(studentMessage, studentBL.studentWelcomeMessage(student));
	}
	
	@Test
	public void testStudentIsInHighSchool() {
		student.setAge(15);
		assertTrue(studentBL.isStudentInHighSchool(student));
	}
	
	@Test
	public void testStudentIsNotInHighSchool() {
		student.setAge(32);
		assertFalse(studentBL.isStudentInHighSchool(student));
	}
	
}
