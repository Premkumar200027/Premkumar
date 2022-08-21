package BassClass;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Child extends Parent{
public static void main(String[] args) throws InterruptedException, AWTException {
		
		openChrome();
		openFb("https://www.facebook.com/");
		bigWindow();
		typeTitle();
		typeUrl();
		
		WebElement Name = driver.findElement(By.id("email"));
		sendName(Name, "premkumar@gmail.com");
		
		allSelect(Name);
		
		full(Name);
		
		saidClick(Name);
		
		Thread.sleep(3000);
		 
		copypk(Name);
		
		WebElement Key = driver.findElement(By.id("pass"));
		sendPassword(Key, "prem1234");
		
		WebElement para = driver.findElement(By.xpath("//h2[contains(text(),'and ')]"));
		paragraph(para);
		
		WebElement small = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		smallPara(small);
		
		WebElement but = driver.findElement(By.name("login"));
		loginClick(but);
		
		Thread.sleep(2000);
		
		openNewUrl("https://demo.guru99.com/test/drag_drop.html");
	
		WebElement taken1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		
		WebElement taken2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		take(taken1, taken2);
		
		fbRefresh();
		
		openNewUrl1("https://retail.onlinesbi.com/retail/login.htm");
		
		WebElement sbi = driver.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]"));
		sbiLoginClick(sbi);
		
		WebElement sbi1 = driver.findElement(By.xpath("//input[@title='Login']"));
		sbiLogin(sbi1);
		
		textOK();
		allOK();
		
		openNewUrl2("https://demo.automationtesting.in/Alerts.html");
		
		WebElement ok = driver.findElement(By.xpath("//a[text()='Alert with OK ']"));
		alertOk(ok);
		
		WebElement Oc = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		alertbutton(Oc);
		
		texti();
		okalert();
		
		WebElement ok1 = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		okCancel(ok1);
		
		WebElement ok2 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		okalert1(ok2);
		
		text1();
		
		okalert1();
		
		WebElement ok3 = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	    clickalert(ok3);
	    
	    WebElement ok4 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		clickalert1(ok4);
		
		textmy();
		
		clickalert2();
		
		WebElement ok5 = driver.findElement(By.id("demo1"));
		textget(ok5);
		
		gmap("https://www.google.co.in/maps/");
		
		WebElement ok6 = driver.findElement(By.xpath("//input[@autofocus='autofocus']"));
		vp(ok6, "Vadapalani");
		
		vpenter();
		
//		WebElement ok7 = driver.findElement(By.xpath("//img[@decoding='async']"));
//		img(ok7);
//		
//		WebElement ok8 = driver.findElement(By.xpath("//img[@jstcache='10']"));
//		fully(ok8);
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


}
