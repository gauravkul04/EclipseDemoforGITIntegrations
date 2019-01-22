package testofAutomation;

import org.testng.annotations.Test;

public class TFirstAutomatedProgram {
	
	@Test(priority=1,description="This test case will verify the login functionlity")
	public void loginapplication() 
	{
		System.out.println("This is First Script");
	}

	@Test(priority=2, description="Add test case")
	public void selectitems() 
	{
		System.out.println("Item Selected ");
	}
	@Test(priority=3)
	public void logoutApllication() 
	{
		System.out.println("logout successfully ");
	}
}
