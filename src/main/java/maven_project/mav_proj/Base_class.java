package maven_project.mav_proj;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_class {
	public static WebDriver driver;
	public static void setproperty() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\eclipse-workspace\\mav_proj\\chrome driver\\chromedriver.exe");
		driver=new 	ChromeDriver();

	}
	
	public static void maximize() 
	{
		driver.manage().window().maximize();
	}
	
	public static void url_launch(String a) 
	{
		driver.get(a);
	}
	public static void quit() 
	{
		driver.quit();
	}

	public static void close() 
	{
		driver.close();
	}

	public static void sendkeys(WebElement b,String value) 
	{
		b.sendKeys(value);
	}

	public static void click(WebElement a) 
	{
		a.click();
	}

	public static void clear (WebElement a) 
	{
		a.clear();
	}

	public static void screenshot(String file) throws IOException 
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File Destination= new File("C:\\Users\\ADMIN\\eclipse-workspace\\mav_proj\\screen_shot\\pic.png");
		org.openqa.selenium.io.FileHandler.copy(source, Destination);

	}

	public static void waiting(int a) 
	{
		driver.manage().timeouts().implicitlyWait(a,TimeUnit.SECONDS);
	}

	public static void navigate_back() 
	{
		driver.navigate().back();
	}

	public static void navigate_to(String url) 
	{
		driver.navigate().to(url);
	}

	public static void navigate_forward() 
	{
		driver.navigate().forward();
	}

	public static void drop_down(WebElement type, String a , String b) 
	{
		Select s= new Select(type);
		if(a.equalsIgnoreCase("index")) 
		{
			int index = Integer.parseInt(b);
			s.selectByIndex(index);
		}
		else if (a.equalsIgnoreCase("value")) 
		{
			s.selectByValue(b);
		}
		else if (a.equalsIgnoreCase("text")) 
		{
			s.selectByVisibleText(b);
		}
	}

	public static void right_click(WebElement a,String b,String c) 
	{
		Actions act= new Actions(driver);
		if(b.equalsIgnoreCase("only right click")) 
		{
			act.contextClick().build().perform();
		}
		else if (b.equalsIgnoreCase("right click at webelement"))
		{
			act.moveToElement(a).contextClick().build().perform();
		}
	}

	public static void alert(WebElement a , String value,String b) 
	{
		if(value.equalsIgnoreCase("accept"))
		{
			a.click();
			waiting(3);
			driver.switchTo().alert().accept();
		}
		else if(value.equalsIgnoreCase("dismiss"))
		{
			a.click();
			waiting(3);
			driver.switchTo().alert().dismiss();
		}
		else if (value.equalsIgnoreCase("sendkeys")) 
		{
			driver.switchTo().alert().sendKeys(b);
			waiting(5);
			driver.switchTo().alert().accept();
		}
	}

	public static void enabled(WebElement a,boolean b)
	{
		b = a.isEnabled();
		System.out.println(b);
	}


	public static void displayed(WebElement web, boolean b ) 
	{
		b=web.isDisplayed();
		System.out.println(b);
	}
	public static void selected(WebElement web, boolean b ) 
	{
		b=web.isSelected();
		System.out.println(b);
	}
}

