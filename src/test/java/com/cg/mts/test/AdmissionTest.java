package com.cg.mts.test;


    import static org.junit.Assert.assertEquals;
	import static org.junit.jupiter.api.Assertions.assertEquals;
	import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.List;

	import java.util.stream.Collectors;
	import java.util.stream.Stream;

	import org.junit.runner.RunWith;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.test.context.SpringBootTest;
	import org.springframework.boot.test.mock.mockito.MockBean;
	import org.springframework.test.context.junit4.SpringRunner;

import com.cg.mts.entities.Admission;
import com.cg.mts.repository.AdmissionRepository;
import com.cg.mts.service.AdmissionService;



	@RunWith(SpringRunner.class)
	@SpringBootTest
	public class AdmissionTest {
	
		@MockBean
		private  AdmissionRepository repository;
		@Autowired
		private  AdmissionService service;
		
		public void getAllAdmissionTest() {
			when(repository.findAll()).thenReturn(Stream.of(new Admission(1,2, 3, LocalDate.parse("2022-03-19")),new Admission(2,4, 4, LocalDate.parse("2042-03-19"))).collect(Collectors.toList()));
			assertEquals(2,service.getAllAdmissions().size());
		}
}
