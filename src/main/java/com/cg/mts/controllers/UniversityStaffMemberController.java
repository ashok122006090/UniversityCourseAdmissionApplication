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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.mts.exception.UniversityStaffException;
import com.cg.mts.entities.Course;
import com.cg.mts.entities.UniversityStaffMember;
import com.cg.mts.service.ICourseService;
import com.cg.mts.service.IUniversityStaffService;
import com.cg.mts.service.UniversityStaffService;


@RestController
public class UniversityStaffMemberController {
	@Autowired
		UniversityStaffService service;
	//add staff
	@PostMapping("/Staff/add")
	public UniversityStaffMember addUniversityStaffMember(@RequestBody UniversityStaffMember a) {
		return service.addUniversityStaffMember(a);
	}
	
	//update staff
	@RequestMapping(value ="/Update/{id}",method = RequestMethod.PUT)
	public UniversityStaffMember updateUniversityStaffMember(@PathVariable int id, @RequestBody UniversityStaffMember a) {
		return service.updateUniversityStaffMember(id,a);
	}
	

	//view staff
	@GetMapping(value = "/View/{id}")
	public ResponseEntity<UniversityStaffMember> getUniversityStaffMemberById(@PathVariable int id) throws UniversityStaffException{
		return  service.getUniversityStaffMemberById(id);
	}

	//remove staff
	@RequestMapping(value="/remove/{id}",method=RequestMethod.DELETE)
	public String deleteUniversityStaffMember(@PathVariable int id) {
		return service.deleteUniversityStaffMember(id);
	}
	
	//viewall staff
	@RequestMapping(value="/ViewAll",method=RequestMethod.GET)
	public List<UniversityStaffMember> getAllUniversityStaffMember(){
		return service.getAllUniversityStaffMember();
	}
	
	@Autowired(required=true)
	UniversityStaffService courseservice;
	
	//addCourse(course):Course
	@PostMapping(value="/Course/add")
	public Course addCourse(@RequestBody Course c) {
		return courseservice.addCourse(c);
	}
	
	//removeCourse(int):Course
	@DeleteMapping(value="/Course/delete/{id}")
	public String removeCourse(@PathVariable int id) {
		return courseservice.removeCourse(id);
	}
	
	//updateCourse(Course):Course
	@PutMapping(value="/Course/Update/{id}") 
	public Course updateStudent(@PathVariable int id,@RequestBody Course c) { 
		return courseservice.updateCourse(id,c); 
	}
	

}
