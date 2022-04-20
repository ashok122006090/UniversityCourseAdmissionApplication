package com.cg.mts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.cg.mts.entities.UniversityStaffMember;

import com.cg.mts.repository.IUniversityStaffRepository;

@Service
public class UniversityStaffService implements IUniversityStaffService {
	@Autowired
	IUniversityStaffRepository repository;
	@Override
	public UniversityStaffMember addUniversityStaffMember(UniversityStaffMember a) {
		 
			return repository.save(a);

		}
	
	
	
	public UniversityStaffMember updateUniversityStaffMember(int id, UniversityStaffMember e) {
		
		UniversityStaffMember e1 = repository.findById(id).get();
		if(e1!=null) {
			e1.setPassword(e.getPassword());
			e1.setRole(e.getRole());
			return repository.save(e1);
		}
		else
		
		return null;
	}

	public UniversityStaffMember getUniversityStaffMemberById(int id) 
		{
			return repository.findById(id).get();
		}

	public String deleteUniversityStaffMember(int id) {
		UniversityStaffMember e1=repository.findById(id).get();
		if(e1==null)
		{
			return "no record present with given id";
		}
		else {
			repository.delete(e1);
			return"StaffMember removed sucessfully";
		}
		
	}

	public List<UniversityStaffMember> getAllUniversityStaffMember() {
		return  repository.findAll();
		
	}



	
	}
 abstract class UniversityStaffService1  implements ICourseService{
		
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



	
	}

	 


	
	
	



