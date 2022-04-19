package com.cg.mts.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Admission;
import com.cg.mts.repository.AdmissionRepository;



@Service
	
	public class AdmissionService {
		
		@Autowired
		AdmissionRepository repository;
		
		public List<Admission> getAllAdmissions(){
			return repository.findAll();
			
		}
		public Admission getAdmissionById(int Id) {
			return repository.findById(Id).get();
		}
 public Admission addAdmission(Admission e) {
	 return repository.save(e);
 }
 
 public Admission updateAdmission(int id,Admission e) {
	 Admission e1= repository.findById(id).get();
 if (e1!=null) {
	 e1.setCourseId(e.getCourseId());
	 e1.setApplicationId(e.getApplicationId());
	 e1.setAdmissionDate(e.getAdmissionDate());
	 return repository.save(e1);
 }
     
     else 
    	 return e1 ;
	}
 public String deleteAdmission(int id) {
		Admission e1=repository.findById(id).get();
		if(e1==null)
		{
			return "no record present with given id";
		}
		else {
			repository.delete(e1);
			return"admission deleted sucessfully";
		}
	}


}



