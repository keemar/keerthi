package Base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;


public class BaseScreen {

public static WebDriver driver;
public static Properties prop;
public static String Env_propertyfilepath = System.getProperty("user.dir")+"//src/main/resources//Configurations/Enviroinment.properties";
public static String TestData_Excelfilepath = System.getProperty("user.dir")+"//src/test/resources//TestData/TestData.xlsx";


@BeforeSuite
public static void readprop() throws Exception {
	 prop = new Properties();
	File f = new File(Env_propertyfilepath);
	FileInputStream fis = new FileInputStream(f);
	prop.load(fis);

}


@BeforeClass
public static void instantiateDriver() {
	if(prop.getProperty("Browser").equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if(prop.getProperty("Browser").equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
		driver = new FirefoxDriver();

	}
	else if(prop.getProperty("Browser").equalsIgnoreCase("ie")) {
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Drivers//IEDriverServer.exe");
		driver = new InternetExplorerDriver();

	}

}

	public static void openurl() {
		driver.get(prop.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(8000, TimeUnit.MILLISECONDS);

	}
	
	
	@AfterSuite
	public void teardown() {
		driver.quit();
	}

}
