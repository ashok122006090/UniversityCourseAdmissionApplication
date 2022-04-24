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

import com.cg.mts.entities.AdmissionStatus;
import com.cg.mts.entities.Applicant;
import com.cg.mts.exceptions.ApplicantNotFoundException;
import com.cg.mts.service.ApplicantService;


@RestController
public class ApplicantController{
	@Autowired
	ApplicantService service;
	
	@PostMapping(value="/applicant/add")
	public Applicant addApplicant(@RequestBody Applicant a)
	{
		return service.addApplicant(a);
	}
	
	@GetMapping("/applicant/all")
	public List<Applicant> viewAllApplicant()
	{
		return service.viewAllApplicant();
	}
	@GetMapping("/applicant/id/{id}")
	public ResponseEntity<Applicant> viewApplicant(@PathVariable int id)throws ApplicantNotFoundException
	{
		return service.viewApplicant(id);
	}
	
	@GetMapping("/applicant/status/{status}")
	public  List<Applicant> viewAllApplicantsByStatus(@PathVariable("status") AdmissionStatus status)
	{
		return service.viewAllApplicantsByStatus(status);
	}
	@PutMapping("/applicant/update/{id}")
	public Applicant updateApplicant(@PathVariable int id,@RequestBody Applicant ap)
	{
		return service.updateApplicant(id, ap);
	}
	@DeleteMapping("/applicant/delete/{id}")
	public void deleteApplicant(@PathVariable int id)
	{
		service.deleteApplicant(id);
	}
}
