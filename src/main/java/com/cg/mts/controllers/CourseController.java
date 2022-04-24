
package com.cg.mts.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.mts.entities.Course;
import com.cg.mts.exception.CourseAlreadyExistsException;
import com.cg.mts.exception.IdNotFoundException;
import com.cg.mts.service.ICourseService;
import com.cg.mts.service.CourseServiceImpl;

@RestController
public class CourseController {
	@Autowired(required=true)
	ICourseService service;
	
	//addCourse(course):Course
	@PostMapping(value="/course/add")
	public Course addCourse(@RequestBody Course c)throws CourseAlreadyExistsException {
		return service.addCourse(c);
	}
	
	//removeCourse(int):Course
	@DeleteMapping(value="/course/delete/{id}")
	public String removeCourse(@PathVariable int id) {
		return service.removeCourse(id);
	}
	
	//updateCourse(Course):Course
	@PutMapping(value="/course/update/{id}") 
	public Course updateStudent(@PathVariable int id,@RequestBody Course c)throws IdNotFoundException { 
		return service.updateCourse(id,c); 
	}
	
	//viewCourse(int):Course
	@GetMapping(value="/course/{id}")
	public Course  viewCourse(@PathVariable int id)throws IdNotFoundException {
		return service.viewCourse(id);
	}
	
	//viewAllCourses():List<Course>
	@GetMapping(value="/course/retrieve")
	public List<Course> viewAllCourse(){
		return service.viewAllCourse();
	}
}

