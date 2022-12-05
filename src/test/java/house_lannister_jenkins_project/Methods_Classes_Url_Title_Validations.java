package house_lannister_jenkins_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Methods_Classes_Url_Title_Validations {


	
	public static void main(String[] args) {
		Methods_Classes_Url_Title_Validations.TyrionLannister();
		Methods_Classes_Url_Title_Validations.JaimeLannister();
		
		Methods_Classes_Url_Title_Validations HouseLannister = new Methods_Classes_Url_Title_Validations();
		HouseLannister.CerceiLannister();
		HouseLannister.TyrionLannister();
		
		Methods_Classes_Url_Title_Validations HouseLannister1 = new Methods_Classes_Url_Title_Validations();
		HouseLannister1.TytosLannister();
	
		
			
	}
	public static void TywinLannister() {
		System.out.println("The Great Lion of the Rock");
	}
	public static void JaimeLannister() {
		System.out.println("The Kingslayer");
	}
	public static void CerceiLannister() {
		System.out.println("Queen Dowager");
	}
	public static void TyrionLannister() {
		System.out.println("The Imp");
	}
	public static void TytosLannister() {
		System.out.println("The laughing Lion");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://awoiaf.westeros.org/index.php/House_Lannister");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String actualCurrentUrl = "https://awoiaf.westeros.org/index.php/House_Lannister";
		String expectedCurrentUrl = driver.getCurrentUrl();
		
		String actualTitle = "House Lannister - A Wiki of Ice and Fire";
		String expectedTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle) && actualCurrentUrl.equals(expectedCurrentUrl)) {
			System.out.println("URL is valid & working");
		}else {
			System.out.println("Url is not valid");
			
		}
		
		
		
		
		

	}



		
		
	
		

	}


