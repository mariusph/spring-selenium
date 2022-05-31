package com.udemy.spring.springselenium;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSeleniumApplicationTests {

	@Test
	void contextLoads() {
		User user = new User(new Address(), new Salary());
		user.printDetails();
	}

}
