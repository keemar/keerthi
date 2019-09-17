package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseScreen;

public class LoginPage extends BaseScreen{
	
	
	
	
    @FindBy(xpath= "//input[@id='username']")
    WebElement email;

    @FindBy(xpath= "//input[@id='password']")
    WebElement pswd;

    @FindBy(xpath= "//button[@class='btn__primary--large from__button--floating']")
    WebElement signin;

    public LoginPage(){
		PageFactory.initElements(driver, this); 

        
    }


  public void Login() {
	  
	  email.sendKeys(prop.getProperty("Email"));
	  pswd.sendKeys(prop.getProperty("Password"));
	  signin.click();

	  
  }
  
  
  
}
