/**
 * @author abhit - aryan9
 * CIS175 - Spring 2023
 * Jan 24, 2023
 */
package model;

public class Student {
	
	private String name;
	private String studentId;
	private int age;
	private double studentGPA;
	
	//public default no-arg constructor
	public Student() {
		
	}
	
	//public non-default constructor that takes 2 parameters of data type String and sets each of the 2 instance variable
	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the studentId
	 */
	public String getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the studentGPA
	 */
	public double getStudentGPA() {
		return studentGPA;
	}

	/**
	 * @param studentGPA the studentGPA to set
	 */
	public void setStudentGPA(double studentGPA) {
		this.studentGPA = studentGPA;
	}
}
