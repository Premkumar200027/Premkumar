package test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Run extends Same {
public static void main(String[] args) throws InterruptedException, IOException {
		
		openUrl();
		newUrl("https://www.facebook.com/");
		newMax();
		seeTittle();
		getUrl();
		
		WebElement d = driver.findElement(By.xpath("//h2[contains(text(),'you')]"));
		gText(d);
		
		WebElement c = driver.findElement(By.xpath("//input[@type='password']"));
		gAtt(c);
		
		WebElement f = driver.findElement(By.name("email"));
		eMail(f, "saranyamahadev");
		
		WebElement f1 = driver.findElement(By.name("pass"));
		eMail(f1, "saranya");
		
		eSelect(f);
		
		WebElement x = driver.findElement(By.xpath("//button[@name='login']"));
		newClick(x);
		
		Thread.sleep(2000);
		
		newUrl1("http://www.greenstechnologys.com/");
		
        WebElement s = driver.findElement(By.xpath("//a[text()='COURSES']"));
		cNew(s);
		WebElement d1 = driver.findElement(By.xpath("//span[text()='Data Science Training']"));
	    nCourse(d1);
		WebElement d4 = driver.findElement(By.xpath("//span[text()='Machine Learning Training'] "));
		d4.click();
	    //nTranie(d4);
	    Thread.sleep(3000);
		
		newChrome("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement c1 = driver.findElement(By.xpath("(//a[text()=' 5000 '])"));
		WebElement d2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		
		newUrl2(c1, d2);
		
		newChrome("https://demo.automationtesting.in/Alerts.html");
		WebElement o = driver.findElement(By.xpath("(//a[@class='analystic'])[1] "));
		o.click();
		WebElement g = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		g.click();
		
		Thread.sleep(2000);
		newOk();
		WebElement l1 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		l1.click();
		WebElement q = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		q.click();
		Thread.sleep(2000);
		withOk();
		WebElement q1 = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		q1.click();
		WebElement q2 = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
		q2.click();
		Thread.sleep(2000);
		withOr();
		
		//("https://www.flipkart.com/account/login?ret=/");
		
		//WebElement v = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
//		copyName(v, "saranyarevathi");
//		//newRobo(v);
		
		
		

		newName("https://www.facebook.com/");
		
		WebElement v1 = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		createBotn(v1);
		createBtn(v1);
		v1.click();
		Thread.sleep(2000);
		WebElement lab = driver.findElement(By.xpath("//label[text()='Male']"));
		lab.click();
		newBtn(lab);
		melaBtn("http://greenstech.in/selenium-course-content.html");
		
		WebElement z = driver.findElement(By.xpath("(//div[@class='container-fluid'])[2]"));
		scrollDown(z);
		WebElement x1 = driver.findElement(By.xpath("//div[@class='header-logo-greens']"));
		scrollUp(x1);
		
		screenShot();
		
		
		
}
}
