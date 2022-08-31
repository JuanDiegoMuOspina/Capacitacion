package com.juan.clase;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoMicroApplicationTests {
	@Autowired
	private ControllerCalculadora contro;

	@Test
	void contextLoads() {
	}
	@Test
	void sumar1() {
		contro.convertirDolaresPesos(500);
		
	}

}
