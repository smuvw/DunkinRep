package LoginPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String a=driver.getTitle();
 System.out.println(a);
		 System.out.println("welcome");
		 System.out.println("welcome");
	}

}
