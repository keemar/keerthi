package PageTest;

import org.testng.annotations.Test;

import Base.BaseScreen;
import Pages.JobsPage;
import Pages.LoginPage;

public class JobSearchPage extends BaseScreen{
	@Test
	  public void LoginTest() {
		openurl();
		new LoginPage().Login();
			new JobsPage().JobSearch();
	  }
}
