package com.cg.mts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Course;
import com.cg.mts.repository.CourseRepository;



@Service
public class CourseServiceImpl implements ICourseService{
	
	@Autowired(required=true)
	CourseRepository repository;

	//addCourse()
	public Course addCourse(Course c) {
		return repository.save(c);
	}

	//removeCourse()
	public String removeCourse(int id) {
		Course c1=repository.findById(id).get(); 
		if(c1==null) { 
			return "No record present with given id"; 
		} 
		else { 
			repository.delete(c1); 
			return"Course deleted sucessfully";
		}
	}

	//updateCourse()
	public Course updateCourse(int id, Course c) {
		Course c1=repository.findById(id).get(); 
		
		if(c1!=null) { 
			c1.setCourseId(c.getCourseId()); 
			c1.setCourseName(c.getCourseName());
			c1.setCourseDuration(c.getCourseDuration());
			c1.setCourseStartDate(c.getCourseStartDate());
			c1.setCourseEndDate(c.getCourseEndDate());
			c1.setCourseFees(c.getCourseFees());
			
			return repository.save(c1); 
		} 
		else 
			return c1;
	}

	//viewCourse()- ID based
	public Course viewCourse(int id) {
		return repository.findById(id).get();
	}

	//viewAllCourse()
	public List<Course> viewAllCourse() {
		return repository.findAll();
	}
	
}
