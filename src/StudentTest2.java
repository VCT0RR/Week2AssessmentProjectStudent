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


public class StudentTest2 {
	
	StudentBusinessLogic studentBL = new StudentBusinessLogic();
	Student student = new Student("Bruce", "112358");

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testStudentGPAIsPassing() {
		student.setStudentGPA(3.14);
		assertTrue(studentBL.isStudentPassing(student));
	}
	
	@Test
	public void testStudentGPAIsNotPassing() {
		student.setStudentGPA(1.89);
		assertFalse(studentBL.isStudentPassing(student));
	}
	
	@Test
	public void testStudentIdIsValid() {
		student.setStudentId("993456");
		assertTrue(studentBL.isStudentIdValid(student));
	}
	
	@Test
	public void testStudentIdIsNotValid() {
		student.setStudentId("5700");
		assertFalse(studentBL.isStudentIdValid(student));
	}

}
