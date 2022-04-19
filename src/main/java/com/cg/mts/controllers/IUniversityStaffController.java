package com.cg.mts.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.cg.mts.entities.UniversityStaffMember;

import com.cg.mts.service.UniversityStaffService;

@RestController
public class IUniversityStaffController {
	@Autowired
		UniversityStaffService service;
	
	@PostMapping("/Staff/add")
	public UniversityStaffMember addUniversityStaffMember(@RequestBody UniversityStaffMember a) {
		return service.addUniversityStaffMember(a);
	}
	
	@RequestMapping(value ="/update/{id}",method = RequestMethod.PUT)
	public UniversityStaffMember updateUniversityStaffMember(@PathVariable int id, @RequestBody UniversityStaffMember e) {
		return service.updateUniversityStaffMember(id,e);
	}
	
	@RequestMapping(value = "/View/{id}",method = RequestMethod.GET)
	public UniversityStaffMember getUniversityStaffMemberById(@PathVariable int id) {
		return service.getUniversityStaffMemberById(id);
	}
	
	@RequestMapping(value="/remove/{id}",method=RequestMethod.DELETE)
	public String deleteUniversityStaffMember(@PathVariable int id) {
		return service.deleteUniversityStaffMember(id);
	}
	
	@RequestMapping(value="/ViewAll",method=RequestMethod.GET)
	public List<UniversityStaffMember> getAllUniversityStaffMember(){
		return service.getAllUniversityStaffMember();
	}
	
}