package com.home.skt.my;

import org.springframework.stereotype.Component;

import com.home.skt.aspects.MeasurePerformance;

@Component
public class MyClass implements MyInterface{

	@MeasurePerformance
	@Override
	public void contextLoads() {
		String testText = "";
		for(int i=0; i<1000; i++) {
			testText += i;
		}
		System.out.println(testText);
	}
}
