package com.cg.mts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Course;
import com.cg.mts.exception.IdNotFoundException;
import com.cg.mts.repository.CourseRepository;


public interface ICourseService {

	//addCourse() call
	Course addCourse(Course c);

	//removeCourse() call
	String removeCourse(int id);

	//UpdateCourse() call
	Course updateCourse(int id, Course c);

	//viewCourse()-ID based call
	Course viewCourse(int id) ;
	
	//viewAllCourse() call
	List<Course> viewAllCourse();

}
