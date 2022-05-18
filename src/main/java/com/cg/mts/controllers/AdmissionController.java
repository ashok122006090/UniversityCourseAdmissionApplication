package com.cg.mts.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.mts.entities.Admission;
import com.cg.mts.service.AdmissionService;
import com.cg.mts.service.IAdmissionService;

@RestController
//@RequestMapping("/")

public class AdmissionController implements IAdmissionService {
	@Autowired(required=true)
	AdmissionService service;
	@RequestMapping(value="/retrieve",method=RequestMethod.GET)
	public List<Admission> getAllAdmissions(){
		System.out.println("controller");
		return service.getAllAdmissions(); }
	
	@RequestMapping(value="/adm/{id}",method=RequestMethod.GET)
	public Admission getAdmission(@PathVariable  int Id ){
		return service.getAdmissionById(Id);
	}

		@RequestMapping(value="/adm/{id}",method=RequestMethod.POST)
		public Admission addAdmission(@RequestBody Admission e) {
			return service.addAdmission(e);
		}
		@RequestMapping(value="/update/{id}",method=RequestMethod.PUT)
		public Admission updateAdmission(@PathVariable int  id,@RequestBody Admission e) {
			return service.updateAdmission(id,e);
		}
		//remove
		@RequestMapping(value="/cancel/{id}",method=RequestMethod.DELETE)
		public String deleteAdmission(@PathVariable int id) {
			return service.deleteAdmission(id);
		}
	@GetMapping("/showalladmissionbycourse/courseid/{id}")
		public List<Admission> showAllAdmissionsByCourseId(@PathVariable int id)
		{
			return service.showAllAdmissionsByCourseId(id);
		}
		@GetMapping("/showalladmissionbydate/date/{admissionDate}")
		public List<Admission> showAllAdmissionsByDate(@PathVariable LocalDate admissionDate)
		{
			return service.showAllAdmissionsByDate(admissionDate);
		}
		
		
		
}
		
	


