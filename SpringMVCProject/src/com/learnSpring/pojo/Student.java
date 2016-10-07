
package com.learnSpring.pojo;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

import com.learnSpring.validators.IsOldEnough;

/**
 * @author kaminy.doraisami This class is a student pojo with certain validations in place
 *
 */
public class Student {
	
	@NotBlank(message="Please enter a name")
	@Size(min=2, max =30, message="Name should be within 2 and 30 characters")
	private String studentName;
	
	@Pattern(regexp="[a-zA-Z]{2}\\d{5}", message="Student ID should be 2 letters followed by 5 digits")
	private String studentId;
	
	@Past(message="Date of Birth cannot be in future")
	@IsOldEnough
	private Date studentDOB;
	
	private Address studentAddress;
	private String studentMobile;
	private ArrayList<String> studentSkills;
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(String studentMobile) {
		this.studentMobile = studentMobile;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}
	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}
	
	
}
