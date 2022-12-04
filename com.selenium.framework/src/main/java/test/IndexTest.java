package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.IndexPage;

public class IndexTest extends TestBase{
	IndexPage ip;
	@Test
	public void logoTest()
	{
		ip=new IndexPage();
		boolean result=ip.validateLogo();
		Assert.assertTrue(result);
		
	}
	@Test
	public void titleTest()
	{
		String actTitle=ip.getPageTitle();
		Assert.assertEquals(actTitle,"Amazon.com. Spend less. Smile more.");
	}
}
