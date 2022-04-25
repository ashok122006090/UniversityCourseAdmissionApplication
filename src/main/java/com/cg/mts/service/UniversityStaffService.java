package com.cg.mts.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.mts.exception.UniversityStaffException;
import com.cg.mts.entities.Course;
import com.cg.mts.entities.UniversityStaffMember;
import com.cg.mts.repository.CourseRepository;
import com.cg.mts.repository.UniversityStaffRepository;


@Service
public class UniversityStaffService implements IUniversityStaffService  {
	@Autowired
	UniversityStaffRepository repository;
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





	public ResponseEntity<UniversityStaffMember> getUniversityStaffMemberById(int id) throws UniversityStaffException{
		UniversityStaffMember e1 = repository.findById(id)
	.orElseThrow(()-> new UniversityStaffException ("no Staff with this id"));
		return ResponseEntity.ok().body(e1);
	}


        @Autowired(required=true) 
		CourseRepository courserepository;

		//addCourse()
		public Course addCourse(Course c) {
			return courserepository.save(c);
		}

		//removeCourse()
		public String removeCourse(int id) {
			Course c1=courserepository.findById(id).get();
			if(c1==null) { 
				return "No record present with given id"; 
			} 
			else { 
				courserepository.delete(c1); 
				return"Course deleted sucessfully";
			}
		}

		//updateCourse()
		public Course updateCourse(int id, Course c) {
			Course c1=courserepository.findById(id).get(); 
			
			if(c1!=null) { 
				c1.setCourseId(c.getCourseId()); 
				c1.setCourseName(c.getCourseName());
				c1.setCourseDuration(c.getCourseDuration());
				c1.setCourseStartDate(c.getCourseStartDate());
				c1.setCourseEndDate(c.getCourseEndDate());
				c1.setCourseFees(c.getCourseFees());
				
				return courserepository.save(c1); 
			} 
			else 
				return c1;
		}



	
	}