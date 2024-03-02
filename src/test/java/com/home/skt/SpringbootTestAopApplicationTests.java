package com.home.skt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.home.skt.my.MyInterface;


@SpringBootTest
class SpringbootTestAopApplicationTests {
	
	@Autowired
	private MyInterface myInterface;

//	@Test
	void abc() {
		myInterface.contextLoads();
	}

}
