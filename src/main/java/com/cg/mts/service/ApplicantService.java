package com.cg.mts.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Applicant;
import com.cg.mts.repository.ApplicantRepository;

@Service
public class ApplicantService implements IApplicantService{
	@Autowired
	ApplicantRepository repository;
	
	@Override
	public Applicant addApplicant(Applicant a) {
		return repository.save(a);
	}


}
