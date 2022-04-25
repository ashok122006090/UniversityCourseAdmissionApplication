package com.cg.mts.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
//creates a table named "course" in the database
public class Course {
	
	//Primary key- courseID
	@Id
	int courseId;
	
	//validation for variable courseName
	@NotEmpty(message = "Course-Name sould not be empty")
	String courseName;
	
	//validation for variable courseDuration
	@Pattern(regexp = "[1-6]{1}",message = "Course-Duration must be within the range 1 to 6 Years")
	String courseDuration;
	
	LocalDate courseStartDate;
	LocalDate courseEndDate;
	
	//validation for variable courseFees
	@Digits(integer=5, fraction=2)
	@Min(value = 50000)
	String courseFees;
	
	//Default constructor Course()
	public Course() {
	}
	
	//Parameterized constructor
	public Course(int courseId, String courseName, String courseDuration, LocalDate courseStartDate,
			LocalDate courseEndTime, String courseFees) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.courseStartDate = courseStartDate;
		this.courseEndDate = courseEndTime;
		this.courseFees = courseFees;
	}
	
	//getters and setters
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDuration() {
		return courseDuration;
	}
	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}
	public LocalDate getCourseStartDate() {
		return courseStartDate;
	}
	public void setCourseStartDate(LocalDate courseStartDate) {
		this.courseStartDate = courseStartDate;
	}
	public LocalDate getCourseEndDate() {
		return courseEndDate;
	}
	public void setCourseEndDate(LocalDate courseEndDate) {
		this.courseEndDate = courseEndDate;
	}
	public String getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(String courseFees) {
		this.courseFees = courseFees;
	}
	
	//toString() Method
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDuration=" + courseDuration
				+ ", courseStartDate=" + courseStartDate + ", courseEndTime=" + courseEndDate + ", courseFees="
				+ courseFees + "]";
	}
}