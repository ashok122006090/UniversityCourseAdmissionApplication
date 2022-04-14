package com.cg.mts.entities;

import java.time.LocalDate;

public class Course {
	int courseid;
	String coursename;
	String courseduration;
	LocalDate coursestarttime;
	LocalDate courseendtime;
	String coursefees;
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public String getCourseduration() {
		return courseduration;
	}
	public void setCourseduration(String courseduration) {
		this.courseduration = courseduration;
	}
	public LocalDate getCoursestarttime() {
		return coursestarttime;
	}
	public void setCoursestarttime(LocalDate coursestarttime) {
		this.coursestarttime = coursestarttime;
	}
	public LocalDate getCourseendtime() {
		return courseendtime;
	}
	public void setCourseendtime(LocalDate courseendtime) {
		this.courseendtime = courseendtime;
	}
	public String getCoursefees() {
		return coursefees;
	}
	public void setCoursefees(String coursefees) {
		this.coursefees = coursefees;
	}
	public Course(int courseid, String coursename, String courseduration, LocalDate coursestarttime,
			LocalDate courseendtime, String coursefees) {
		super();
		this.courseid = courseid;
		this.coursename = coursename;
		this.courseduration = courseduration;
		this.coursestarttime = coursestarttime;
		this.courseendtime = courseendtime;
		this.coursefees = coursefees;
	}
	

}
