package test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit_03 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.out.println("Before Class Code");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
		System.out.println("After Class Code");
	}

	@Test
	public void test() {
		
		System.out.println("Test Method Code");
	}
	
	@Test
	public void test1() {
		
		System.out.println("Test 1 Method Code");
	}

}
