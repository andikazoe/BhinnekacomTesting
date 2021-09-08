package soalnomorsatua

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

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

public class POMSoalNomorSatuA {

	WebDriver driver;

	//button Allow
	@FindBy(id = "onesignal-slidedown-allow-button")
	public WebElement ButtonAllow;

	//input search
	@FindBy(xpath = "//input[@id='searchProduct']")
	public WebElement InputSearch;

	//button search
	@FindBy(xpath = "//div[@id='searchProduct']/div/div")
	public WebElement ButtonSearch;

	//select list search result
	@FindBy(xpath = "//div[@id='searchProduct']/div[2]/div[2]/div/div/div/p")
	public WebElement listSearch;

	//Click on next add barang in product
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[6]/div/div/div/div/div/div[2]/div/button")
	public WebElement buttonAddBarangProduct;

	//Click on Add Chart button
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[8]/div/button[2]")
	public WebElement buttonAddChart;

	//Click on masuk button
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div[4]/div[2]/div/div[3]/button")
	public WebElement buttonMasuk;

	//Set email in textbox
	@FindBy(xpath = "//input[@id='email']")
	public WebElement inputEmail;

	//Click on next button
	@FindBy(xpath = "//button[@id='next']")
	public WebElement buttonNextEmail;

	//Set password in textbox
	@FindBy(xpath = "//input[@id='password']")
	public WebElement inputPassword;

	//Click on Masuk Password button
	@FindBy(xpath = "(//button[@type='button'])[2]")
	public WebElement buttonMasukPassword;

	//Click on next add chart button
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div[5]/div[2]/div/div[3]/button[2]/span")
	public WebElement buttonNextAddChart;

	//Click on next add barang in chart
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div[3]/div[1]/div[2]/div/div/div[2]/div[2]/div/div/div/div[2]/div/button")
	public WebElement buttonAddBarangChart;

	public POMSoalNomorSatuA(WebDriver driver){
		this.driver = driver;
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
	}

	//Click on button Allow
	public void clickButtonAllow(){
		ButtonAllow.click();
	}

	//Click on input search
	public void clickInputSearch(){
		InputSearch.click();
	}

	//Set search in textbox
	public void setSearch(String strSearch){
		InputSearch.sendKeys(strSearch);
	}

	//Click on button search
	public void clickButtonSearch(){
		ButtonSearch.click();
	}

	//Click on list search
	public void clicklistSearch(){
		listSearch.click();
	}

	//Click on next add barang in product
	public void clickbuttonAddBarangProduct(){
		buttonAddBarangProduct.click();
	}

	//Click on Add Chart button
	public void clickbuttonAddChart(){
		buttonAddChart.click();
	}

	//Click on masuk button
	public void clickbuttonMasuk(){
		buttonMasuk.click();
	}

	//Set email in textbox
	public void setEmail(String strEmail){
		inputEmail.sendKeys(strEmail);
	}

	//Click on next button
	public void clickbuttonNextEmail(){
		buttonNextEmail.click();
	}

	//Set password in textbox
	public void setPassword(String strPassword){
		inputPassword.sendKeys(strPassword);
	}

	//Click on Masuk Password button
	public void clickbuttonMasukPassword(){
		buttonMasukPassword.click();
	}

	//Click on next add chart button
	public void clickbuttonNextAddChart(){
		buttonNextAddChart.click();
	}

	//Click on next add barang in chart
	public void clickbuttonAddBarangChart(){
		buttonAddBarangChart.click();
	}

	public void ProdukRun(String strSearch, String strEmail, String strPassword,
			String TmbhBrgProduct, String TmbhBrgChart) throws InterruptedException {

		//Click on Allow button
		this.clickButtonAllow();
		Assert.assertTrue(true, ButtonAllow.toString());

		//Fill search
		this.clickInputSearch();
		Thread.sleep(3000);
		this.setSearch(strSearch);
		Assert.assertTrue(true, InputSearch.toString());

		//Click on search button
		this.clickButtonSearch();
		Assert.assertTrue(true, ButtonSearch.toString());

		//select list search result
		Thread.sleep(5000);
		this.clicklistSearch();
		Assert.assertTrue(true, listSearch.toString());

		//Click on Add Chart button
		Thread.sleep(3000);
		this.clickbuttonAddChart();
		Assert.assertTrue(true, buttonAddChart.toString());

		//Click on masuk button
		Thread.sleep(3000);
		this.clickbuttonMasuk();
		Assert.assertTrue(true, buttonMasuk.toString());

		//Set email in textbox
		Thread.sleep(3000);
		this.setEmail(strEmail);
		Assert.assertTrue(true, inputEmail.toString());

		//Click on next button
		this.clickbuttonNextEmail();
		Assert.assertTrue(true, buttonNextEmail.toString());

		//Set password in textbox
		Thread.sleep(3000);
		this.setPassword(strPassword);
		Assert.assertTrue(true, inputPassword.toString());

		//Click on Masuk Password button
		this.clickbuttonMasukPassword();
		Assert.assertTrue(true, buttonMasukPassword.toString());

		//Click on next add barang in chart
		Thread.sleep(2000);
		for (int tmbhProduct = 0; tmbhProduct <= TmbhBrgProduct; tmbhProduct++) {

			int finddataProduct = Integer.parseInt(TmbhBrgProduct);

			if (tmbhProduct == finddataProduct) {
				break;
			} else {
				Thread.sleep(3000);
				this.clickbuttonAddBarangProduct();
			}
		}
		Assert.assertTrue(true, buttonAddBarangChart.toString());

		//Click on Add Chart button after login
		Thread.sleep(3000);
		this.clickbuttonAddChart();
		Assert.assertTrue(true, buttonAddChart.toString());

		//Click on next add chart button
		Thread.sleep(3000);
		this.clickbuttonNextAddChart();
		Assert.assertTrue(true, buttonNextAddChart.toString());

		//Click on next add barang in chart
		Thread.sleep(2000);
		for (int tmbhChart = 0; tmbhChart <= TmbhBrgChart; tmbhChart++) {

			int finddataChart = Integer.parseInt(TmbhBrgChart);

			if (tmbhChart == finddataChart) {
				break;
			} else {
				Thread.sleep(3000);
				this.clickbuttonAddBarangChart();
			}
		}
		Assert.assertTrue(true, buttonAddBarangChart.toString());
	}

}
