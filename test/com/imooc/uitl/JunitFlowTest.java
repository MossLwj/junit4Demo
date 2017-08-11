package com.imooc.uitl;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class JunitFlowTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("this is BeforeClass...");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("this is AfterClass...");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("this is Before...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("this is After...");
	}


}
