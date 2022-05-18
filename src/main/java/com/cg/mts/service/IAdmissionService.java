package com.cg.mts.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cg.mts.entities.Admission;
//import com.cg.mts.exceptions.AdmissionNotFoundException;

public interface IAdmissionService {
Admission addAdmission(Admission e);

Admission updateAdmission (int id,Admission e);
public String deleteAdmission(int id);
//ResponseEntity<Admission> showAdmission(int id) ;
//public List<Admission>showAllAdmisssion();
public List<Admission> showAllAdmissionsByCourseId(int courseId);
public List<Admission> showAllAdmissionsByDate(LocalDate admissionDate);
//
//List<Admission> showAllAdmission();

List<Admission> getAllAdmissions();


}