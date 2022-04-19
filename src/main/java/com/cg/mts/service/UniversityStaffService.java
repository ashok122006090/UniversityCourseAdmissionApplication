package com.cg.mts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Course;
import com.cg.mts.entities.UniversityStaffMember;
import com.cg.mts.repository.CourseRepository;
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


	
	
	



