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
import org.springframework.web.bind.annotation.RestController;

import com.cg.mts.entities.Admission;
import com.cg.mts.entities.AdmissionCommiteeMember;
import com.cg.mts.entities.AdmissionStatus;
import com.cg.mts.entities.Applicant;
import com.cg.mts.exception.ACMIdNotFoundException;
import com.cg.mts.service.IAdmissionCommiteeMemberService;



@RestController
public class AdmissionCommiteeMemberController {
	@Autowired(required=true)
	IAdmissionCommiteeMemberService service;
	
	//addAdmissionCommiteeMember(AdmissionCommiteeMember):AdmissionCommiteeMember
	@PostMapping(value="/commiteemember/add")
	public AdmissionCommiteeMember addAdmissionCommiteeMember(@RequestBody AdmissionCommiteeMember acm) {
		return service.addAdmissionCommiteeMember(acm);
	}
	
	//removeAdmissionCommiteeMember(int):AdmissionCommiteeMember
	@DeleteMapping(value="/commiteemember/delete/{id}")
	public String removeAdmissionCommiteeMember(@PathVariable int id) {
		return service.removeAdmissionCommiteeMember(id);
	}
	
	//updateAdmissionCommiteeMember(AdmissionCommiteeMember):AdmissionCommiteeMember
	@PutMapping(value="/commiteemember/update/{id}") 
	public AdmissionCommiteeMember updateStudent(@PathVariable int id,@RequestBody AdmissionCommiteeMember acm) { 
		return service.updateAdmissionCommiteeMember(id,acm); 
	}
	
	//viewAdmissionCommiteeMember(int):AdmissionCommiteeMember
	@GetMapping(value="/commiteemember/{id}") 
	public ResponseEntity<AdmissionCommiteeMember> viewAdmissionCommiteeMember(@PathVariable int id) throws ACMIdNotFoundException {
		return service.viewAdmissionCommiteeMember(id);
	}
	
	//viewAllAdmissionCommiteeMember():List<AdmissionCommiteeMember>
	@GetMapping(value="/commiteemember/retrieve")
	public List<AdmissionCommiteeMember> viewAllAdmissionCommiteeMember(){
		return service.viewAllAdmissionCommiteeMember();
	}
	
	@GetMapping(value="/commiteemember/statusinfo/{getapplicantId}")
	public AdmissionStatus provideAdmissionResult(@PathVariable Applicant getapplicantId,@RequestBody Admission adm)
	{
		return service.provideAdmissionResult(getapplicantId,adm);
	}
}