package test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class Junit05 {
	
	public String name;
	public int age;
	
	public Junit05(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	
	
	@Test
	public void test()
	{
		System.out.println("Name is : " + name + " and Age is : " + age);
		
	}
	
	
	@Parameters
	public static Collection<Object[]> parameters()
	{
		Object [][] data = new Object[3][2];
		data[0][0] = "Rajendra Babu";
		data[0][1] = 33;
		data[1][0] = "Vasu";
		data[1][1] = 32;
		data[2][0] = "Santosh";
		data[2][1] = 32;
		return Arrays.asList(data);
	}

	
	
}
