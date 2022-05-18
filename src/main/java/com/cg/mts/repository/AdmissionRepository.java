package com.cg.mts.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Admission;


@Repository
public interface AdmissionRepository  extends JpaRepository<Admission,Integer>{
	//List<Admission> findByDate(LocalDate admissionDate);

}
