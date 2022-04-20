package com.cg.mts.service;

import java.util.List;

import com.cg.mts.entities.AdmissionStatus;
import com.cg.mts.entities.Applicant;

public interface IApplicantService{
	Applicant addApplicant(Applicant a);
	Applicant updateApplicant(int id,Applicant ap);
	void deleteApplicant(int id);
	Applicant viewApplicant(int id);
	List<Applicant> viewAllApplicant();
	List<Applicant> viewAllApplicantsByStatus(AdmissionStatus status);

}
