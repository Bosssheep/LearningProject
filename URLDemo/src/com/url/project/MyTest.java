package com.url.project;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyTest {

	private static Methods test = new Methods();
	
/*	@Before
	public void setUp() throws Exception {
		test.clear();
	}*/

	@Test
	public void testMethod() {
		assertEquals(false,test.Method("" , "I"));
		assertEquals(true,test.Method("" , ""));
		assertEquals(false,test.Method("ILOVECODE" , "ILOVE"));
		assertEquals(true,test.Method("ILOVECODE" , "ILOVECODE"));
		assertEquals(true,test.Method("CODELOVEI" , "ILOVECODE"));
		assertEquals(true,test.Method("CODELOVEI" , "EDOCEVOLI"));
	}

}
