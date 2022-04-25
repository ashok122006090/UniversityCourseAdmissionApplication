package com.cg.mts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.mts.entities.UniversityStaffMember;
@Repository
public interface UniversityStaffRepository extends JpaRepository<UniversityStaffMember,Integer>{
	

}