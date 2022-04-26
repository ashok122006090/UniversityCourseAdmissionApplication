package com.cg.mts.test;
import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.when;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.cg.mts.entities.AdmissionCommiteeMember;
import com.cg.mts.repository.AdmissionCommiteeMemberRepository;
import com.cg.mts.service.AdmissionCommiteeMemberServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdmissionCommiteeMemberTest {
	@MockBean
	private  AdmissionCommiteeMemberRepository repository;
	@Autowired
	private  AdmissionCommiteeMemberServiceImpl service;
	
	public void viewAllAdmissionCommiteeMemberTest() {
		when(repository.findAll()).thenReturn(Stream.of(new AdmissionCommiteeMember (103,"bobby","7708523388"), new AdmissionCommiteeMember(104,"akhil","7736278956")).collect(Collectors.toList()));
		assertEquals(2,service.viewAllAdmissionCommiteeMember().size());
	}

}
