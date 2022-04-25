package com.cg.mts.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cg.mts.entities.UniversityStaffMember;
import com.cg.mts.exception.UniversityStaffException;

public interface IUniversityStaffService {

	//addStaff() call
	UniversityStaffMember addUniversityStaffMember(UniversityStaffMember a);

	//removeStaff() call
	String deleteUniversityStaffMember(int id);

	//updateStaff() call
	UniversityStaffMember updateUniversityStaffMember(int id, UniversityStaffMember e);

	//ViewStaff()call
	ResponseEntity<UniversityStaffMember> getUniversityStaffMemberById(int id) throws UniversityStaffException;

	//ViewAll() call 
	List<UniversityStaffMember> getAllUniversityStaffMember();
}