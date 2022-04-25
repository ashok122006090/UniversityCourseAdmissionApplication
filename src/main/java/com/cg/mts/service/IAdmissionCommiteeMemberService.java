package com.cg.mts.service;



import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cg.mts.entities.Admission;
import com.cg.mts.entities.AdmissionCommiteeMember;
import com.cg.mts.entities.AdmissionStatus;
import com.cg.mts.entities.Applicant;

public interface IAdmissionCommiteeMemberService {

		//addAdmissionCommiteeMember() call
		AdmissionCommiteeMember addAdmissionCommiteeMember(AdmissionCommiteeMember acm);

		//removeAdmissionCommiteeMember() call
		String removeAdmissionCommiteeMember(int id);

		//UpdateAdmissionCommiteeMember() call
		AdmissionCommiteeMember updateAdmissionCommiteeMember(int id, AdmissionCommiteeMember acm);

		//viewAdmissionCommiteeMember()-ID based call
		ResponseEntity<AdmissionCommiteeMember> viewAdmissionCommiteeMember(int id);
		
		//viewAllAdmissionCommiteeMember() call
		List<AdmissionCommiteeMember> viewAllAdmissionCommiteeMember();
		
		AdmissionStatus provideAdmissionResult(Applicant getapplicantId, Admission adm);



}

