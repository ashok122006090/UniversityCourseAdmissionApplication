package com.cg.mts.service;


import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.AdmissionStatus;
import com.cg.mts.entities.Applicant;
import com.cg.mts.exceptions.ApplicantNotFoundException;
import com.cg.mts.repository.ApplicantRepository;

@Service
public class ApplicantService implements IApplicantService{
	@Autowired
	ApplicantRepository repository;
	
	@Override
	public Applicant addApplicant(Applicant a) {
		return repository.save(a);
	}


	@Override
	public List<Applicant> viewAllApplicant() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public ResponseEntity<Applicant> viewApplicant(int id) throws ApplicantNotFoundException{
		
		Applicant a1=repository.findById(id)
		.orElseThrow(()->new ApplicantNotFoundException("No applicant with this id"));
		return ResponseEntity.ok().body(a1);
	}

	@Override
	public List<Applicant> viewAllApplicantsByStatus(AdmissionStatus status) {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Applicant updateApplicant(int id,Applicant ap) {
		Applicant ap1=repository.findById(id).get();
		if(ap1!=null)
		{
			ap1.setApplicantId(ap.getApplicantId());
			ap1.setApplicantName(ap.getApplicantName());
			ap1.setMobileNumber(ap.getMobileNumber());
			ap1.setApplicantDegree(ap.getApplicantDegree());
			ap1.setApplicantGraduationPercent(ap.getApplicantGraduationPercent());
			return repository.save(ap1);
		}
		else
			return ap;
		
	}

	@Override
	public void deleteApplicant(int id){
		Applicant a1=repository.findById(id).get();
				
		if(a1==null)
			System.out.println("no record find with given id");
		
		else {
			repository.delete(a1);
			System.out.println("record deleted successfully");
		}
	
		
	}


}
