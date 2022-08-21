package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Same {
	
	public static WebDriver driver;
	//1
	public static void openUrl() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	//2
	public static void newUrl(String url) {
		driver.get(url);
	}
	//3
	public static void newMax() {
		driver.manage().window().maximize();
	}//4
	public static void seeTittle() {
		String t = driver.getTitle();
		System.out.println(t);
	}//5
	public static void getUrl() {
		String c = driver.getCurrentUrl();
        System.out.println(c);
	}//6
    public static void gText(WebElement s) {
	  String t = s.getText();
	  System.out.println(t);
	}//7
    public static void gAtt(WebElement S) {
		String a = S.getAttribute("aria-label");
		System.out.println(a);
	}
    //8
	public static void eMail(WebElement e, String value) {
		e.sendKeys(value);
	}
	//9
	public static void eSelect(WebElement r) {
		Actions A = new Actions(driver);
		A.doubleClick(r).perform();
	}//10
//	public static void copyAll(WebElement t) throws AWTException {
//		Robot R = new Robot();
//		R.keyPress(KeyEvent.VK_CONTROL);
//		R.keyPress(KeyEvent.VK_C);
//		R.keyRelease(KeyEvent.VK_C);  //39
//		R.keyRelease(KeyEvent.VK_CONTROL);
//		R.keyPress(KeyEvent.VK_TAB);
//		R.keyRelease(KeyEvent.VK_TAB);
//		R.keyPress(KeyEvent.VK_CONTROL);
//		R.keyPress(KeyEvent.VK_V);            //40
//		R.keyRelease(KeyEvent.VK_V);
//		R.keyRelease(KeyEvent.VK_CONTROL);
//	}//11
	public static void newClick(WebElement d) {
		d.click();
	}//12
	public static void newUrl1(String url) {
		driver.navigate().to(url);
	}//13
	public static void cNew(WebElement t) {
		Actions A = new Actions(driver);
		A.moveToElement(t).perform();
	}//14
	public static void nCourse(WebElement s) {
		Actions A = new Actions(driver);
		A.moveToElement(s).perform();
	}//15
	public static void nTranie(WebElement d3) {
		Actions A = new Actions(driver);
		A.moveToElement(d3).perform();
		A.click();
	}//16
	public static void newChrome(String url) {
		driver.navigate().to(url);

	}//17
	public static void newUrl2(WebElement l, WebElement l1) {
		Actions A= new Actions(driver);
		A.dragAndDrop(l, l1).perform();
	}
	//18
	public static void newChro(String url) {
		driver.navigate().to(url);

	}//19
	public static void newAlert(WebElement s) {
	//Alert S = driver.switchTo().alert();
    s.click();
	}//20
	public static void newAlert1(WebElement t) {
		t.click();
	}
	//21
	public static void newOk() {
		Alert S = driver.switchTo().alert();
		S.accept();
	}//22
	public static void newAlert2(WebElement s) {
		s.click();
	}//23
	public static void newAlert3(WebElement f) {
		f.click();
	}//24
	public static void withOk() {
		Alert S = driver.switchTo().alert();
		S.dismiss();
	}//25
	public static void withOut(WebElement j) {
		j.click();
	}//26
	
	public static void withOutOk(WebElement d) {
		d.click();
	}
	//27
	public static void withOr() {
		Alert S = driver.switchTo().alert();
		String t = S.getText();
		System.out.println(t);
		S.accept();
	}
	//28
//	public static void newChrome3(String url) {
//		driver.navigate().to(url);
//	}//29
//	public static void copyName(WebElement a, String value) {
//		a.sendKeys(value);
//	}
//	//30
//	public static void newRobo(WebElement c) throws AWTException {
//		Robot r = new Robot();		
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_C);
//		r.keyRelease(KeyEvent.VK_C);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//
//	}
	//31
	public static void newName(String value) {
		driver.navigate().to(value);
	}//32
	public static void createBotn(WebElement d) {
		boolean dis = d.isDisplayed();
		System.out.println(dis);
	}//33
	public static void createBtn(WebElement k) {
		boolean ena = k.isEnabled();
        System.out.println(ena);
	}//34
	public static void newBtn(WebElement s) {
		//s.click();
		boolean sel = s.isSelected();
		System.out.println(sel);
	}//35
	public static void melaBtn(String url) {
		driver.navigate().to(url);
	}//36
	public static void scrollDown(WebElement s) {
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView(true)", s);
	}//37
	public static void scrollUp(WebElement x) {
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoCiew(false)", x);
	}//38
	
	public static  void screenShot() throws IOException {
		TakesScreenshot sh = (TakesScreenshot)driver;
		File sren = sh.getScreenshotAs(OutputType.FILE);
		File F = new File("C:\\Users\\ELCOT\\SeleniumDay7\\screenshot\\prem.png");
		FileUtils.copyFile(sren, F);
	
	}

}
