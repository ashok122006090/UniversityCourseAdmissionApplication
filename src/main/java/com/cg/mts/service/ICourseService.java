package com.cg.mts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Course;
import com.cg.mts.repository.CourseRepository;


public interface ICourseService {
	
	//List<Course> viewAllCourse();

	Course addCourse(Course c);

	/*String removeCourse(int id);

	Course updateCourse(int id, Course c);

	Course viewCourse(int id);*/

}
