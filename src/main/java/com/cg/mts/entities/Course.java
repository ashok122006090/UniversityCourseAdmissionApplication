package com.cg.mts.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	int courseId;
	String courseName;
	String courseDuration;
	LocalDate courseStartDate;
	LocalDate courseEndTime;
	String courseFees;
	public Course() {
		// TODO Auto-generated constructor stub
	}
	public Course(int courseId, String courseName, String courseDuration, LocalDate courseStartDate,
			LocalDate courseEndTime, String courseFees) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.courseStartDate = courseStartDate;
		this.courseEndTime = courseEndTime;
		this.courseFees = courseFees;
	}
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
	public LocalDate getCourseEndTime() {
		return courseEndTime;
	}
	public void setCourseEndTime(LocalDate courseEndTime) {
		this.courseEndTime = courseEndTime;
	}
	public String getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(String courseFees) {
		this.courseFees = courseFees;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDuration=" + courseDuration
				+ ", courseStartDate=" + courseStartDate + ", courseEndTime=" + courseEndTime + ", courseFees="
				+ courseFees + "]";
	}
	
	
	

}
