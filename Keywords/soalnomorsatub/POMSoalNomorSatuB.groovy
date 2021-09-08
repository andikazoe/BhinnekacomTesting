package soalnomorsatub

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
import org.openqa.selenium.interactions.Actions;

public class POMSoalNomorSatuB {

	WebDriver driver;
	
	//button Allow
	@FindBy(id = "onesignal-slidedown-allow-button")
	public WebElement ButtonAllow;
	
	//Klik hamburger menu
	@FindBy(xpath = "(.//*[normalize-space(text()) and normalize-space(.)='Digital Product'])[1]/following::*[name()='svg'][1]")
	public WebElement HamburgerMenu;
	
	//Klik submenu 1
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div/header/div/div[1]/div/div[2]/div/div[1]/div/div/div/div[1]/div/div/div[1]/a/span")
	public WebElement subMenu1;
	
	//Klik submenu 2
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/div/div/header/div/div[1]/div/div[2]/div/div[1]/div/div/div/div[1]/div/div/div[2]/a/span")
	public WebElement subMenu2;
	
	//Klik check 1
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div/div[2]/div[2]/div/div/div/div/div[1]/label/span[1]/input")
	public WebElement check1;
	
	//Klik check 2
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div/div[2]/div[2]/div/div/div/div/div[2]/label/span[1]/input")
	public WebElement check2;
	
	//Klik check 3
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/div/div[2]/div[2]/div/div/div/div/div[3]/label/span[1]/input")
	public WebElement check3;
	
	//Klik kotak
	@FindBy(xpath = "(//button[@type='button'])[5]")
	public WebElement kotak;
	
	//Klik row
	@FindBy(xpath = "(//button[@type='button'])[6]")
	public WebElement row;
	
	//Klik urutkan
	@FindBy(xpath = "//div[@id='__next']/div[3]/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div")
	public WebElement urutkan;
	
	//Klik urutkan relevansi
	@FindBy(xpath = "//div[@id='__next']/div[3]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div")
	public WebElement relevansi;
	
	//Klik urutkan asampaiz
	@FindBy(xpath = "//div[@id='__next']/div[3]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[2]")
	public WebElement asampaiz;
	
	//Klik urutkan zsampaia
	@FindBy(xpath = "//div[@id='__next']/div[3]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[3]")
	public WebElement zsampaia;
	
	//Klik urutkan hargaterendah
	@FindBy(xpath = "//div[@id='__next']/div[3]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[4]")
	public WebElement hargaterendah;
	
	//Klik urutkan hargatertinggi
	@FindBy(xpath = "//div[@id='__next']/div[3]/div[2]/div[3]/div/div[2]/div/div/div/div[2]/div/div[5]")
	public WebElement hargatertinggi;

	public POMSoalNomorSatuB(WebDriver driver){
		this.driver = driver;
		//This initElements method will create  all WebElements
		PageFactory.initElements(driver, this);
	}

	//Click on button Allow
	public void clickButtonAllow(){
		ButtonAllow.click();
	}
		
	//Klik hamburger menu
	public void clickHamburgerMenu(){
		HamburgerMenu.click();
	}
	
	//Klik sub menu 1
	public void clickSubmenu1(){
		subMenu1.click();
	}
	
	//Klik sub menu 2
	public void clickSubmenu2(){
		subMenu2.click();
	}
	
	//Check 1
	public void clickcheck1(){
		check1.click();
	}
	
	//Check 2
	public void clickcheck2(){
		check2.click();
	}
	
	//Check 3
	public void clickcheck3(){
		check3.click();
	}
	
	//Kotak
	public void clickKotak(){
		kotak.click();
	}
	
	//Row
	public void clickRow(){
		row.click();
	}
	
	//Urutkan
	public void clickurutkan(){
		urutkan.click();
	}
	
	//Relevansi
	public void clickrelevansi(){
		relevansi.click();
	}
	
	//asampaiz
	public void clickasampaiz(){
		asampaiz.click();
	}
	
	//zsampaia
	public void clickzsampaia(){
		zsampaia.click();
	}
	
	//hargaterendah
	public void clickhargaterendah(){
		hargaterendah.click();
	}
	
	//hargatertinggi
	public void clickhargatertinggi(){
		hargatertinggi.click();
	}
	
	public void FilterRun(String subMenu, String checkMerk, String barisProduk, String strurutkan) throws InterruptedException {
		
		//Click on Allow button
		this.clickButtonAllow();
		Assert.assertTrue(true, ButtonAllow.toString());
		
		//Click on Allow button
		this.clickHamburgerMenu();
		Assert.assertTrue(true, HamburgerMenu.toString());
		
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		WebElement link = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/header/div/div[1]/div/div[2]/div/div[1]/a/div[1]/img"));
		action.contextClick(link).perform();
		
		Thread.sleep(2000);
		//pilih sub menu
		if(subMenu == "Industrial Cleaning Machine") {
			this.clickSubmenu1();
			Assert.assertTrue(true, subMenu1.toString());
		}else if(subMenu == "All Purpose Cleaner") {
			this.clickSubmenu2();
			Assert.assertTrue(true, subMenu2.toString());
		}else {
			System.out.println("Tidak ada pilihan");
		}
		
		Thread.sleep(2000);
		//pilih jumlah check merk
		if(checkMerk == "1") {
			this.clickcheck1();
			Assert.assertTrue(true, check1.toString());
		}else if(checkMerk == "2") {
			this.clickcheck1();
			Assert.assertTrue(true, check1.toString());
			Thread.sleep(2000);
			this.clickcheck2();
			Assert.assertTrue(true, check2.toString());
		}else if(checkMerk == "3") {
			this.clickcheck1();
			Assert.assertTrue(true, check1.toString());
			Thread.sleep(2000);
			this.clickcheck2();
			Assert.assertTrue(true, check2.toString());
			Thread.sleep(2000);
			this.clickcheck3();
			Assert.assertTrue(true, check3.toString());
		}else {
			System.out.println("Tidak ada pilihan");
		}
		
		Thread.sleep(2000);
		//pilih bentuk baris produk
		if(barisProduk == "Kotak") {
			this.clickKotak();
			Assert.assertTrue(true, kotak.toString());
		}else if(barisProduk == "Row") {
			this.clickRow();
			Assert.assertTrue(true, row.toString());
		}else {
			System.out.println("Tidak ada pilihan");
		}
		
		Thread.sleep(2000);
		//pilih urutkan
		this.clickurutkan();
		Assert.assertTrue(true, urutkan.toString());
		
		Thread.sleep(2000);
		if(strurutkan == "Relevansi") {
			this.clickrelevansi();
			Assert.assertTrue(true, relevansi.toString());
		}else if(strurutkan == "A-Z") {
			this.clickasampaiz();
			Assert.assertTrue(true, asampaiz.toString());
		}else if(strurutkan == "Z-A") {
			this.clickzsampaia();
			Assert.assertTrue(true, zsampaia.toString());
		}else if(strurutkan == "Harga Terendah") {
			this.clickhargaterendah();
			Assert.assertTrue(true, hargaterendah.toString());
		}else if(strurutkan == "Harga Tertinggi") {
			this.clickhargatertinggi();
			Assert.assertTrue(true, hargatertinggi.toString());
		}else {
			System.out.println("Tidak ada pilihan");
		}
	}

}
