package soalnomorsatua

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import soalnomorsatu.*;

public class TCSoalNomorSatuA {

	@Keyword
	public void RunBhineka(String search, String strEmail, String strPassword,
			String TmbhBrgProduct, String TmbhBrgChart) {
		WebDriver driver;
		POMSoalNomorSatuA produk;

		System.setProperty("webdriver.chrome.driver", "C:\\Bhinneka Testing\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(GlobalVariable.Link_Bhinneka);
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		Thread.sleep(3000);

		produk = new POMSoalNomorSatuA(driver);
		produk.ProdukRun(search,strEmail,strPassword,TmbhBrgProduct,TmbhBrgChart);
		
		Thread.sleep(5000);
		driver.close();
	}
}
