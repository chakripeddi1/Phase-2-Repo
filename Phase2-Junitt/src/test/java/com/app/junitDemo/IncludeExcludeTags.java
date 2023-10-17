package com.app.junitDemo;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.IncludeTags;



@IncludeTags({"devlopment"})  
@ExcludeTags({"prod"})
public class IncludeExcludeTags {

	
	@Test
	@Tag("devlopment")
	public void devtest1()
	{
		System.out.println("test Case development1");
	}
	
	@Test
	@Tag("devlopment")
	public void devTest2()
	{
		System.out.println("test Case development 2");
	}
	
	
	@Test
	@Tag("Qa")
	public void qatest1()
	{
		System.out.println("test Case QA 1");
	}
	
	
@Test
@Tag("Qa")
	public void qatest2()
	{
		System.out.println("test Case QA 2");
	}


@Test
@Tag("prod")
public void prodTest1()
{
	System.out.println("test Case Production 1");
}


@Test
@Tag("prod")
public void prodtest2()
{
	System.out.println("test Case Production 2");
}
	
	
	
	
}
