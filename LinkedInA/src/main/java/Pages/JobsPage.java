package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.BaseScreen;

public class JobsPage extends BaseScreen{
	
	  @FindBy(xpath= "//span[@id='jobs-tab-icon']")
	    WebElement jobsmenu;
	  
	  @FindBy(xpath= "//input[contains(@id,'jobs-search-box-keyword-id')]")
	    WebElement jobsearch;

	  
	  @FindBy(xpath= "//input[contains(@id,'jobs-search-box-location-id')]")
	    WebElement joblocation;

	  @FindBy(xpath= "//button[text()='Search']")
	    WebElement search;


	    public JobsPage(){
			PageFactory.initElements(driver, this); 

	        
	    }


	  public void JobSearch() {
		  
		  jobsmenu.click();
		  jobsearch.sendKeys("selenium");
		  joblocation.sendKeys("Alpharetta");
		  search.click();

		  
	  }
	  
}
