package com.cg.mts.service;


import java.util.List;

import com.cg.mts.entities.AdmissionCommiteeMember;

public interface IAdmissionCommiteeMemberService {

		//addAdmissionCommiteeMember() call
		AdmissionCommiteeMember addAdmissionCommiteeMember(AdmissionCommiteeMember acm);

		//removeAdmissionCommiteeMember() call
		String removeAdmissionCommiteeMember(int id);

		//UpdateAdmissionCommiteeMember() call
		AdmissionCommiteeMember updateAdmissionCommiteeMember(int id, AdmissionCommiteeMember acm);

		//viewAdmissionCommiteeMember()-ID based call
		AdmissionCommiteeMember viewAdmissionCommiteeMember(int id);
		
		//viewAllCourse() call
		List<AdmissionCommiteeMember> viewAllAdmissionCommiteeMember();

	}