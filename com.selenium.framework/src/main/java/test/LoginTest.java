package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.TestBase;
import pages.IndexPage;
import pages.LoginPage;
import util.ExcelUtil;

public class LoginTest extends TestBase{
	IndexPage ip;
	LoginPage lp;
	@Test(dataProvider= "tempTestData")
	public void loginTest(String uname,String pwd) throws InterruptedException
	{
		System.out.println("LoginTest class");
		System.out.println(uname+"  "+pwd);
		ip=new IndexPage();
		lp=ip.clickSignInBtn();
		lp.login(uname, pwd);
	}
	@DataProvider(name = "tempTestData")
	public Object[][] tempTestData() throws Exception {

		String[][] testData = ExcelUtil.getExcelDataIn2DArray(System.getProperty("user.dir")+"\\src\\main\\java\\testData\\loginTestData.xlsx", "loginSheet");
		return testData;
	}
}
