package com.cg.mts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.mts.entities.Applicant;
import com.cg.mts.service.ApplicantService;
import com.cg.mts.service.IApplicantService;

@RestController
public class ApplicantController{
	@Autowired
	ApplicantService service;
	
	@PostMapping("applicant/add")
	public Applicant addApplicant(@RequestBody Applicant a)
	{
		return service.addApplicant(a);
	}
}
