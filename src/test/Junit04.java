package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junit04 {

	@Before
	public void setUp() throws Exception {
		
		System.out.println("Before Class Code Before Test");
		
	}

	@After
	public void tearDown() throws Exception {
		
		System.out.println("After Class Code");
		
	}

	@Test
	public void test() {

		System.out.println("Test Method Code");
		
	}
	@Test
	public void test1() {

		System.out.println("Test1 Method Code");
		
	}

}
