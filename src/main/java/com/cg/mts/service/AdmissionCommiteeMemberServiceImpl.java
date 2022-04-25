package com.cg.mts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Admission;
import com.cg.mts.entities.AdmissionCommiteeMember;
import com.cg.mts.entities.AdmissionStatus;
import com.cg.mts.entities.Applicant;
import com.cg.mts.exception.ACMIdNotFoundException;
import com.cg.mts.repository.AdmissionCommiteeMemberRepository;

@Service
public  class AdmissionCommiteeMemberServiceImpl implements IAdmissionCommiteeMemberService{
	@Autowired(required=true)
	AdmissionCommiteeMemberRepository repository;

	//addAdmissionCommiteeMember()
	public AdmissionCommiteeMember addAdmissionCommiteeMember(AdmissionCommiteeMember acm) {
		return repository.save(acm);
	}

	//removeAdmissionCommiteeMember()
	public String removeAdmissionCommiteeMember(int id) {
		AdmissionCommiteeMember  acm1=repository.findById(id).get(); 
		if(acm1==null) { 
			return "No record present with given id"; 
		} 
		else { 
			
			
			repository.delete(acm1); 
			return"Member deleted sucessfully";
		}
	}

	//updateAdmissionCommiteeMember()
	public AdmissionCommiteeMember updateAdmissionCommiteeMember (int id, AdmissionCommiteeMember acm) {
		AdmissionCommiteeMember acm1=repository.findById(id).get(); 
		
		if(acm1!=null) { 
			acm1.setAdminId(acm. getAdminId()); 
			acm1.setAdminName(acm.getAdminName());
			acm1.setAdminContact(acm.getAdminContact());
			
			
			return repository.save(acm1); 
		} 
		else 
			return acm1;
	}

	//viewAdmissionCommiteeMember()- ID based
	public ResponseEntity<AdmissionCommiteeMember> viewAdmissionCommiteeMember(int id) throws ACMIdNotFoundException{
		AdmissionCommiteeMember acm =  repository.findById(id).orElseThrow(()->new ACMIdNotFoundException("No member with this id"));
		return ResponseEntity.ok().body(acm);
	}

	//viewAllAdmissionCommiteeMember()
	public List<AdmissionCommiteeMember> viewAllAdmissionCommiteeMember() {
		return repository.findAll();
	}
	
	public AdmissionStatus provideAdmissionResult(Applicant applicant,Admission admission)
	{
		return applicant.getStatus();
		
		
	}

	
}
