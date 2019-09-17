package PageTest;

import org.testng.annotations.Test;

import Base.BaseScreen;
import Pages.LoginPage;

public class LoginPageTest extends BaseScreen {
 
	@Test
  public void LoginTest() throws Exception {		
		openurl();
		new LoginPage().Login();
  }
  
  
  
  
}
