import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.edge.EdgeDriver;
public class MyTestCaseLUMA extends ParametersLUMA{

	 @BeforeTest
	 
	 public void BeforeTest() throws InterruptedException {
		 WebDriver driver =new ChromeDriver();
		 //WebDriver driver =new EdgeDriver();
		//driver.get(TheWebSiteURL);
		driver.manage().window().maximize();
			
	 }
	
@Test(description="number 1" , priority = 1)
	public void SignUp() throws InterruptedException {
	String create="https://magento.softwaretestingboard.com/customer/account/create/";
	driver.get(create);
 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		 
		 WebElement FirstName =driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
		 WebElement LastName =driver.findElement(By.xpath("//*[@id=\"lastname\"]"));
		 
		 WebElement Email =driver.findElement(By.xpath("//*[@id=\"email_address\"]"));
		 WebElement password =driver.findElement(By.xpath("//*[@id=\"password\"]"));
		 
		 WebElement ConfirmPassword=driver.findElement(By.xpath("//*[@id=\"password-confirmation\"]"));
		 
		 Thread.sleep(3000);
		
		 FirstName.sendKeys(firstName[NameIndex]);
		 LastName.sendKeys(lastName[NameIndex]);
		
		 Email.sendKeys(Emailuser+EmailIndex+Email);
		 
		 password.sendKeys( passwordLab);
		 
		 ConfirmPassword.sendKeys(Emailuser+EmailIndex+Email);
		 Thread.sleep(3000);
	
	}
/*
	 @Test(description="number 2" , priority = 2)
		public void SearchHotel() {
			
		 WebElement ButtonAcount =driver.findElement(By.xpath("//*[@id=\"form-validate\"]/div/div[1]/button/span"));
		 ButtonAcount.click();
			
		}
		*/
	 /*
	 @Test(description="number 3" , priority = 3)
	 public void DoneCreate() {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 WebElement Acount =driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div "));
		
		 String TextOfTheCreate =Acount.getText();
		 System.out.println(TextOfTheCreate);
		 
		 boolean ActualCreateWebSit =TextOfTheCreate.contains("Thank you for registering with Main Website Store.");
		 org.testng.Assert.assertEquals(ActualCreateWebSit, false);
		 
		 
	 }
	 
	*/

  
 /*
 @Test(description="number 1", priority = 1)
 public void RandomlySelectClothes() throws InterruptedException  {
	 
 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
 	WebElement Search_Bar =driver.findElement(By.xpath("//*[@id=\"search\"]"));
 	String [] cloths= {"Jacket" ,"t-shirt" ,"jeans for men" ,"jeans for women" ,"pants"};
 	int clothsIndex= raNdom.nextInt(0,5);
 	
 	Search_Bar.sendKeys(cloths[clothsIndex]+ Keys.ARROW_DOWN+ Keys.ENTER);
 	
 }
 

 @Test(description="number 1", priority = 1)
 public void Add_Items() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	List< WebElement> Add=driver.findElements(By.className("toCart"));
	for (int i=0; i<Add.size()-1;i++) {
		
        
 
 

 }
 
}*/
 
}