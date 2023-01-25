/**
 * @author abhit - aryan9
 * CIS175 - Spring 2023
 * Jan 24, 2023
 */
package model;

public class StudentBusinessLogic {
	
	public String studentWelcomeMessage(Student student) {
		
		return "Hello " + student.getName() + "! "
				+ "Welcome to East City High School. Your student ID is: " + student.getStudentId();
	}

	public boolean isStudentInHighSchool(Student student) {
		
		if(student.getAge() >= 14 && student.getAge() <= 18) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isStudentIdValid(Student student) {
		
		String str = student.getStudentId();
		if(str.length() != 6) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public boolean isStudentPassing(Student student) {
		
		if(student.getStudentGPA() > 2.00) {
			return true;
		}
		else {
			return false;
		}
	}
}
