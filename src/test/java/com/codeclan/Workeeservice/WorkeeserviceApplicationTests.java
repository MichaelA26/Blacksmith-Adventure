package com.codeclan.Workeeservice;

import com.codeclan.Workeeservice.models.Workee;
import com.codeclan.Workeeservice.repositories.WorkeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WorkeeserviceApplicationTests {

	@Autowired
	WorkeeRepository workeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createWorkee(){
		Workee valdek = new Workee("Valdek", 10, 001, "courageousvaldek@theblacksmiths.med");
		workeeRepository.save(valdek);
	}

}
