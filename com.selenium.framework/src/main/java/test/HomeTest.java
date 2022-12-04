package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.IndexPage;
import pages.LoginPage;

public class HomeTest {
	
	HomePage hp;
	@Test 
	public void cartTest()
	{
		System.out.println("in HomeTest");
		hp=new HomePage();
		boolean result=hp.validateCart();
		Assert.assertTrue(result);
	}
}
