package AmazonProject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonProjectSL {

	public static void main(String[] args) throws InterruptedException {
		
		//To open the browser
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
	    
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement username = driver.findElement(By.id("ap_email"));
		
		//Thread.sleep(3000);
		
		username.sendKeys("9600420995");
		
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@id='continue']/descendant::input")).click();
		
		//Thread.sleep(3000);
		
        WebElement password = driver.findElement(By.id("ap_password"));
		
		//Thread.sleep(3000);
		
		password.sendKeys("Admin@1234");
		
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		Thread.sleep(3000);
		
		WebElement user = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		user.getText().contains("Hello, DemoUser");
		
		if (user.getText().contains("Hello, DemoUser")) 
			
			System.out.println("User is signed in successfully!");
            
         else 
        	
            System.out.println("Sign-in verification failed.");
		
		WebElement scroll = driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[6]/ul/li[1]/a"));
		
		
		scroll.isDisplayed();
		
        if (scroll.isDisplayed()) 
			
			System.out.println("User can successfully scroll to bottom of page!");
            
         else 
        	
            System.out.println("User unable to scroll to bottom of page!");
        
        WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));

		Select dd = new Select(dropdown);

		dd.selectByVisibleText("Electronics");
		
		Thread.sleep(3000);

        WebElement searchbar = driver.findElement(By.id("twotabsearchtextbox"));
        
        searchbar.sendKeys("Iphone 13");
        
        searchbar.submit();
        
        Thread.sleep(3000);
        
        WebElement checkfilter = driver.findElement(By.xpath("//*[@id=\"p_90/6741118031\"]/span/a/div/label/i"));
        
        checkfilter.click();
        
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
        
        Thread.sleep(3000);
        
        Set<String> s = driver.getWindowHandles();
        ArrayList ar = new ArrayList(s);
        System.out.println(ar.get(0));
        System.out.println(ar.get(1));
        
        driver.switchTo().window((String)ar.get(1));
        
        WebElement wishlist = driver.findElement(By.xpath("//*[@id=\'add-to-wishlist-button-submit\']"));
        		
        wishlist.click();
        
        driver.findElement(By.xpath("//*[@id=\"list-name\"]")).sendKeys("Apple");
        
        driver.findElement(By.xpath("//*[@id=\"wl-redesigned-create-list\"]/span/span/input")).click();
        
        //driver.close();
	    
	}
	
}
		
		