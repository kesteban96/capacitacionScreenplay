package co.com.google.tarea1.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Tarea1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KEVIN.GUTIERREZ\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver tarea1 = new ChromeDriver();
		
		tarea1.manage().window().maximize();
		tarea1.get("http://www.newtours.demoaut.com/");
		
		tarea1.findElement(By.name("userName")).sendKeys("kevingutierrezudea1996@gmail.com");
		tarea1.findElement(By.name("password")).sendKeys("sandramilena");
		tarea1.findElement(By.name("password")).sendKeys(Keys.ENTER);;
		
		
		tarea1.findElement(By.xpath("//input[@value='roundtrip']")).click();
		 
		
		Select lista = new Select(tarea1.findElement(By.name("passCount")));
		lista.selectByIndex(2);
		
		Select lista1 = new Select(tarea1.findElement(By.name("fromPort")));
		lista1.selectByIndex(4);
	
		Select lista2 = new Select(tarea1.findElement(By.name("fromMonth")));
		lista2.selectByIndex(5);
		
		Select lista3 = new Select(tarea1.findElement(By.name("fromDay")));
		lista3.selectByIndex(3);
		
		Select lista4 = new Select(tarea1.findElement(By.name("toPort")));
		lista4.selectByIndex(3);
		
		Select lista5 = new Select(tarea1.findElement(By.name("toMonth")));
		lista5.selectByIndex(4);
		
		Select lista6 = new Select(tarea1.findElement(By.name("toDay")));
		lista6.selectByIndex(4);
		
		tarea1.findElement(By.xpath("//input[@value='First']")).click();
		 
		Select lista7 = new Select(tarea1.findElement(By.name("airline")));
		lista7.selectByIndex(1);
		
		tarea1.findElement(By.name("findFlights")).sendKeys(Keys.ENTER);;
		
		
		tarea1.findElement(By.xpath("//input[@value='Blue Skies Airlines$361$271$7:10']")).click();
		tarea1.findElement(By.xpath("//input[@value='Blue Skies Airlines$631$273$14:30']")).click();
		
		tarea1.findElement(By.name("reserveFlights")).sendKeys(Keys.ENTER);;
		
		tarea1.findElement(By.name("passFirst0")).sendKeys("sandra");
		tarea1.findElement(By.name("passLast0")).sendKeys("Gutierrez");
		Select lista8 = new Select(tarea1.findElement(By.name("pass.0.meal")));
		lista8.selectByIndex(1);
		
		
		tarea1.findElement(By.name("passFirst1")).sendKeys("Kevin");
		tarea1.findElement(By.name("passLast1")).sendKeys("Gutierrez");
		Select lista9 = new Select(tarea1.findElement(By.name("pass.1.meal")));
		lista9.selectByIndex(2);
		
		
		tarea1.findElement(By.name("passFirst2")).sendKeys("Juan");
		tarea1.findElement(By.name("passLast2")).sendKeys("Gutierrez");
		Select lista10 = new Select(tarea1.findElement(By.name("pass.2.meal")));
		lista10.selectByIndex(3);
		
		Select lista11 = new Select(tarea1.findElement(By.name("creditCard")));
		lista11.selectByIndex(2);
		
		tarea1.findElement(By.name("creditnumber")).sendKeys("12345789");

		Select lista12 = new Select(tarea1.findElement(By.name("cc_exp_dt_mn")));
		lista12.selectByIndex(1);
		
		Select lista13 = new Select(tarea1.findElement(By.name("cc_exp_dt_yr")));
		lista13.selectByIndex(5);
		
		tarea1.findElement(By.name("cc_frst_name")).sendKeys("Sandra");
		tarea1.findElement(By.name("cc_mid_name")).sendKeys("Tarjeta");
		tarea1.findElement(By.name("cc_last_name")).sendKeys("Gutierrez");
		tarea1.findElement(By.name("buyFlights")).sendKeys(Keys.ENTER);;
		//tarea1.findElement(By.name("buyFlights")).sendKeys(Keys.ENTER);;
	}

	
}
