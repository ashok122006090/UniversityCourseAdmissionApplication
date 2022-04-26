package com.cg.mts.service;
import org.springframework.http.ResponseEntity;

import com.cg.mts.entities.Admission;
import com.cg.mts.exception.AdmissionNotFoundException;

public interface IAdmissionService {
Admission addAdmission(Admission e);

Admission updateApplicant(int id,Admission e);
public String deleteAdmission(int id);
ResponseEntity<Admission> showAdmission(int id) throws AdmissionNotFoundException;
}