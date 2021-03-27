package initialPackages;

public class LoginSteps {
	
	public LoginSteps(LoginPage loginPage){
		loginPage.goToHomePage();
	}

	public static void main(String[] args) {
		LoginPage loginPage = null;
		LoginSteps obj = new LoginSteps(loginPage);

	}

}
