package CommonFunLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OhrmExcl {

	WebDriver driver;
	String res ="";
	public String launchapp( String url){
		System.setProperty("webdriver.chrome.driver","E:\\LiveTech\\eclipse-workspace\\StockAccountingDDF\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		String res="";
		driver.get(url);
		if (driver.findElement(By.id("btnLogin")).isDisplayed()) {
			res="pass";
		} else {
            res="fail";
		}
		return res;
		
		}
	public String login(String username,String password){
		 String res="";
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
		if (driver.findElement(By.linkText("Welcome Suresh")).isDisplayed()) {
			res="pass";
		} else {
                res="fail";
		}
		return res;
		
	}
	public String admin(String userrole,String empname,String username,String status,String password,String cpassword){
		
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("btnAdd")).click();
		 Select blist=new Select (driver.findElement(By.id("systemUser_userType")));
		 blist.selectByVisibleText(userrole);
		 driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(empname);
		 driver.findElement(By.id("systemUser_userName")).sendKeys(username);
		 Select dat=new Select(driver.findElement(By.id("systemUser_status")));
		 dat.selectByVisibleText(status);
		 driver.findElement(By.id("systemUser_password")).sendKeys(password); 
		 driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(cpassword);
		 driver.findElement(By.id("btnSave")).click();
		 if (driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']/b")).isDisplayed()) {
				return res="pass";
			} else {
	         return  res="fail";
			}
		
		
	}
		  public String logout() throws Throwable{
			
			 driver.findElement(By.linkText("Welcome Suresh")).click();
			 Thread.sleep(3000);
			 driver.findElement(By.linkText("Logout")).click();
			 Thread.sleep(3000);
			 if (driver.findElement(By.id("btnLogin")).isDisplayed()) {
				res="pass";
			} else {
	           res="fail";
			}
			return res;
			
		 }
		 
			
		
	public void clobrowser(){
		driver.close();
	}
}
