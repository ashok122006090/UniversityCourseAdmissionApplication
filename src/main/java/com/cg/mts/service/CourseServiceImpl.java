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

	public Course addCourse(Course c) {
		return repository.save(c);
	}

	/*@Override
	public List<Course> viewAllCourse() {
		// TODO Auto-generated method stub
		return null;
	}*/
	
	

}
