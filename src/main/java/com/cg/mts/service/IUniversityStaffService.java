package com.cg.mts.service;

import com.cg.mts.entities.UniversityStaffMember;

public interface IUniversityStaffService {
	
//addStaff() call
UniversityStaffMember addUniversityStaffMember(UniversityStaffMember a);

//removeStaff() call
String deleteUniversityStaffMember(int id);

//updateStaff() call
UniversityStaffMember updateUniversityStaffMember(int id, UniversityStaffMember e);

//ViewStaff()call
UniversityStaffMember getUniversityStaffMemberById(int id);

//ViewAll() call 
 List<UniversityStaffMember> getAllUniversityStaffMember();
}
