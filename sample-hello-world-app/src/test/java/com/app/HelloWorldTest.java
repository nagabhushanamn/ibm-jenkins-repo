package com.app;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {
	
	private HelloWorld helloWorld;
	
	@Before
	public void setup() {
		helloWorld=new HelloWorld();
	}
	
	@Test
	public void sayHelloTest() {
		String msg=helloWorld.sayHello();
		assertEquals("Messages are Not Equal", "Hello! IBM", msg);
	}
	

}
