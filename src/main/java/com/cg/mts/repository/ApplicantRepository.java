package com.cg.mts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Applicant;

@Repository
public interface ApplicantRepository extends JpaRepository<Applicant,Integer>{
	


}