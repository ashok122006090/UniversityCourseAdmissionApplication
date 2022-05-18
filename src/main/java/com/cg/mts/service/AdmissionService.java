package com.cg.mts.service;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Admission;
//import com.cg.mts.exceptions.AdmissionNotFoundException;
import com.cg.mts.repository.AdmissionRepository;

@Service
	public class AdmissionService implements IAdmissionService {
		
		@Autowired
		AdmissionRepository repository;
	@Override	
	public List<Admission> getAllAdmissions(){
		return repository.findAll();
		
	}
	public Admission getAdmissionById(int Id) {
		return repository.findById(Id).get();
	}
//		public Admission getAdmissionById(int Id) {
//			return repository.findById(Id).get();
//		}
		@Override
 public Admission addAdmission(Admission e) {
	 return repository.save(e);
 }
		@Override
 public Admission updateAdmission( int id,Admission e) {
	 Admission e1= repository.findById(id).get();
 if (e1!=null) {
	 
	 
	 e1.setCourseId(e.getCourseId());
	 e1.setApplicationId(e1.getApplicationId());
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
// public ResponseEntity<Admission> viewAdmission(int id)throws AdmissionNotFoundException {
//	 Admission a1=repository.findById(id)
//				.orElseThrow(()->new AdmissionNotFoundException("No admission with this id"));
//				return ResponseEntity.ok().body(a1);
//	
//}
public List<Admission> showAllAdmissionsByCourseId(int id) {
	// TODO Auto-generated method stub
	return null;
}
public List<Admission> showAllAdmissionsByDate(LocalDate admissionDate) {
	// TODO Auto-generated method stub
	return null;
}
public Admission getAdmission() {
	// TODO Auto-generated method stub
	return null;
}


//@Override
//public List<Admission> showAllAdmissionsByCourseId(int courseId) {
//	// TODO Auto-generated method stub
//	return (List<Admission>) repository.findById(courseId).get();
//}
//@Override
//public List<Admission> showAllAdmissionsByDate(LocalDate admissionDate) {
//	// TODO Auto-generated method stub
//	return repository.findByDate(admissionDate);
}
//@Override
//public List<Admission> showAllAdmissionsByCourseId(int courseId)  {
//	// TODO Auto-generated method stub
//	return repository.findAll();
//}
//@Override
//public ResponseEntity<Admission> viewAdmission(int id) {
//	// TODO Auto-generated method stub
//	return null;
//}
//@Override
//public ResponseEntity<Admission> viewAdmission(int id) {
//	// TODO Auto-generated method stub
//	return null;
//}

//public ResponseEntity<Admission> viewApplicant(int id) {
//	// TODO Auto-generated method stub
//	return null;
//}
//@Override
//public List<Admission> showAllAdmissionsByCourseId(int courseId) {
//	// TODO Auto-generated method stub
//	return repository.findAll();
//}
//@Override
//public List<Admission> showAllAdmisssion() {
////	// TODO Auto-generated method stub
//	return repository.findAll();
//}
//@Override
//public ResponseEntity<Admission> showAdmission(int id) {
//	// TODO Auto-generated method stub
//	return null;



//@Override
//public ResponseEntity<Admission> viewApplicant(int id) throws AdmissionNotFoundException {
//	// TODO Auto-generated method stub
//	return null;
//}







