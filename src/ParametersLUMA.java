import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Random;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.asserts.Assertion;
public class ParametersLUMA {
	 WebDriver driver =new EdgeDriver();
	 Random rand=new Random();
	 Assertion MyAssert =new Assertion();
	 String TheWebSiteURL ="https://magento.softwaretestingboard.com/";
	 String create="https://magento.softwaretestingboard.com/customer/account/create/";
	
	 
	 
	 String firstName[]= {"reem","dana","amal","hala","eman","sara","maha"};
	 String lastName[]= {"mohamed","hani","ahmed","basem","warrad","abdelwahab","baraa"};
	 String passwordLab="R@20172782";
	 String Emailuser="user";
	 String Email="@gamail.com";
	 
	 int NameIndex=rand.nextInt(0,7);
	 int EmailIndex=rand.nextInt(0,100);
	 
	 
	 
}
