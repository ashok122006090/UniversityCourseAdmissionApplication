package com.cg.mts.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.mts.entities.Admission;
import com.cg.mts.service.AdmissionService;


@RestController
//@RequestMapping("/")

public class AdmissionController {
	
	@Autowired(required=true)
	AdmissionService service;
	
	@RequestMapping(value="/retrieve",method=RequestMethod.GET)
	public List<Admission> getAllAdmissions(){
		System.out.println("controller");
		return service.getAllAdmissions(); }
		
		@RequestMapping(value="/adm/{id}",method=RequestMethod.GET)
		public Admission getAdmissionById(@PathVariable int id ) {
			return service.getAdmissionById(id);
		}
		@RequestMapping(value="/add",method=RequestMethod.POST)
		public Admission addAdmission(@RequestBody Admission e) {
			return service.addAdmission(e);
		}
		@RequestMapping(value="/update/{id}",method=RequestMethod.PUT)
		public Admission updateAdmission(@PathVariable int  id,@RequestBody Admission e) {
			return service.updateAdmission(id,e);
		}
		@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
		public String deleteAdmission(@PathVariable int id) {
			return service.deleteAdmission(id);
		}

}
		
	


