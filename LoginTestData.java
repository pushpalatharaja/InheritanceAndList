package week3.home_assignment;

public class LoginTestData extends TestData {
	public void enterUsername() {
		System.out.println("Pushpalatha---->This is sub class");
	}
	 public void enterPassword() {
		 System.out.println("12345---->This is sub class");
	 }
	 public void enterURL() {
		 System.out.println("https://www.google.com/---->This is sub class");
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData obj=new LoginTestData();
		obj.enterCredentials();
		obj.enterUsername();
		obj.enterPassword();
		obj.navigateToHomePage();
		obj.enterURL();

	}

}
