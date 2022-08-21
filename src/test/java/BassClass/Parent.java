package BassClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parent {

	 public static WebDriver driver;
		//1
		public static void openChrome() {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		}
		//2
		public static void openFb(String url) {
	         	driver.get(url);
		}
		//3	
		public static void bigWindow() {
			driver.manage().window().maximize();
	    }	
		//4	
		public static void typeTitle() {
			String S = driver.getTitle();
	        System.out.println(S);
		}
		//5
		public static void typeUrl() {
	        System.out.println(driver.getCurrentUrl());
		}
		//6
		public static void sendName(WebElement Name,String value) {
			Name.sendKeys(value);
		}
		//7
		public static void allSelect(WebElement all) {
			Actions a = new Actions(driver);
				a.doubleClick(all).perform();
		    }
		
		public static void full(WebElement ok) throws AWTException {
			Robot R = new Robot();
            R.keyPress(KeyEvent.VK_CONTROL);
            R.keyPress(KeyEvent.VK_A);
            R.keyRelease(KeyEvent.VK_A);
            R.keyRelease(KeyEvent.VK_CONTROL);
		}
	    //8
		public static void saidClick(WebElement said) {
			Actions a = new Actions(driver);
				a.contextClick(said).perform();
	   }
		public static void copypk(WebElement ok) throws AWTException {
			Robot R = new Robot();
			for (int i = 0; i <=2; i++) {
				R.keyPress(KeyEvent.VK_DOWN);
				R.keyRelease(KeyEvent.VK_DOWN);
			}
			R.keyPress(KeyEvent.VK_ENTER);
			R.keyRelease(KeyEvent.VK_ENTER);
	   }
		//9	
		public static void sendPassword(WebElement Key,String value) {
			Key.sendKeys(value);
	    }
		//10
		public static void paragraph(WebElement para) {
			String S3 = para.getText();
	        System.out.println(S3);	
	    }
		//11
		public static void smallPara(WebElement small) {
			String S4 = small.getAttribute("class");
	        System.out.println(S4);
		}
		//12
		public static void loginClick(WebElement but) {
			but.click();
	    }	
		//13
		public static void openNewUrl(String url) {
			driver.navigate().to(url);
	    }	
		//14	
		public static void take(WebElement taken1,WebElement taken2) {
		Actions a = new Actions(driver);
	    a.dragAndDrop(taken1, taken2).perform();
	    }
		//15
		public static void fbRefresh() {
			driver.navigate().refresh();
	    }
		//16
		public static void openNewUrl1(String url) {
			driver.navigate().to(url);
		}
		//17
		public static void sbiLoginClick(WebElement but) {
			but.click();
		}
		//18
		public static void sbiLogin(WebElement but) {
			but.click();
		}
		//19
		public static void textOK() {
			Alert A =driver.switchTo().alert();
			String g = A.getText();
	        System.out.println(g);
		}
		//20
		public static void allOK() {
			Alert A =driver.switchTo().alert();
	        A.accept();
		}
		//21
		public static void openNewUrl2(String url) {
			driver.navigate().to(url);
	    }
		//22
		public static void alertOk(WebElement ok) {
			ok.click();
	    }
		//23
		public static void alertbutton(WebElement Oc) {
			Oc.click();
	    }
		//24
		public static void texti() {
			Alert A =driver.switchTo().alert();
	        String g = A.getText();
		    System.out.println(g);
		}
		//25
		public static void okalert() {
			Alert A =driver.switchTo().alert();
	        A.accept();
		}
		//26
		public static void okCancel(WebElement ok) {
			ok.click();
		}
		//27
		public static void okalert1(WebElement ok) {
			ok.click();
	    }
		//28
		public static void text1() {
			Alert A =driver.switchTo().alert();
			String g = A.getText();
            System.out.println(g);
		}
		//29
		public static void okalert1() {
			Alert A = driver.switchTo().alert();
            A.accept();
		}
		//30
		public static void clickalert(WebElement ok) {
			ok.click();
        }
		//31
		public static void clickalert1(WebElement ok) {
			ok.click();
        }
		//32
		public static void textmy() {
			Alert A =driver.switchTo().alert();
			A.sendKeys("S.PREMKUMAR");
		}
		//33
		public static void clickalert2() {
			Alert A =driver.switchTo().alert();
			A.accept();
        }
		//34
		public static void textget(WebElement ok) {
			String g = ok.getText();
            System.out.println(g);
		}
		//35
		public static void gmap(String url) {
		    driver.navigate().to(url);
        }
		//36
		public static void vp(WebElement ok,String value) {
			ok.sendKeys(value);
        }
		//36
		public static void vpenter() throws AWTException {
			Robot R = new Robot();
			R.keyPress(KeyEvent.VK_ENTER);
			R.keyRelease(KeyEvent.VK_ENTER);
        }
//		public static void img(WebElement ok) {
//			ok.click();
//        }
//		public static void fully(WebElement ok) {
//			ok.click();
//
//		}
		
		
}
