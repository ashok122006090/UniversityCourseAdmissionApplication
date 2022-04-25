package com.cg.mts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.mts.entities.Admission;


@Repository
public interface AdmissionRepository  extends JpaRepository<Admission,Integer>{


}