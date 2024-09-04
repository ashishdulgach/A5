package Check;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryPom {
	@FindBy(name="firstname")
	private WebElement firstnameTF;
	
	@FindBy(name="email")
	private WebElement emailTF;
	
	@FindBy(name="repassword")
	private WebElement repasswordTF;
	
	@FindBy(name="lastname")
	private WebElement lastnameTF;
	
	@FindBy(name="password")
	private WebElement passwordTF;
	
	@FindBy(xpath="//a[text()='I Already have a membership']")
	private WebElement AlreadyAccLink;
	
	@FindBy(xpath="//i[@class=\"fa fa-bars\"]")
	private WebElement homeLink;
	
	@FindBy(name="signup")
	private WebElement registerBTN;
	
	//Initialzation
	public SkillRaryPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Utilization
	public void setFirstname(String firstname)
	firstnameTF.sendKeys(firstname);
	
	public void setEmail(String emailTF)
	emailTF.sendKeys(email);
	
	public void setEmail(String emailTF)
	emailTF.sendKeys(email);
	
	
	
	
	
	
	

}
