package com.cg.mts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Course;
import com.cg.mts.exception.CourseAlreadyExistsException;
import com.cg.mts.exception.IdNotFoundException;
import com.cg.mts.repository.CourseRepository;




@Service
public class CourseServiceImpl implements ICourseService{
	
	@Autowired(required=true)
	CourseRepository repository;

	
	//addCourse()
	public Course addCourse(Course c) {
		Course c1=repository.findById(c.getCourseId()).orElse(null);
		if(c1==null)
			return repository.save(c);
		else
			throw new CourseAlreadyExistsException("Course already exists!");
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
		Course c1=repository.findById(id).orElse(null);
		
		if(c1==null) throw new IdNotFoundException("Sorry you can not update. No Course with this Id found!");
		
		else {
			c1.setCourseId(c.getCourseId()); 
			c1.setCourseName(c.getCourseName());
			c1.setCourseDuration(c.getCourseDuration());
			c1.setCourseStartDate(c.getCourseStartDate());
			c1.setCourseEndDate(c.getCourseEndDate());
			c1.setCourseFees(c.getCourseFees());
		
			return repository.save(c1);
		} 
	}

	//viewCourse()- ID based
	public Course viewCourse(int id) {
		return repository.findById(id).orElseThrow(()->new IdNotFoundException("Invalid Course-ID! No course for the ID provided by you is found."));
	}

	//viewAllCourse()
	public List<Course> viewAllCourse() {
		return repository.findAll();
	}
	
}
