package com.TestNG.TestNGProject;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class DataProvier {
	
	@Parameter({"UserName","Password"})
	@Test
	public void login(String un,String pw) {
		System.out.println(un+pw);
		
		
		
	}

}
