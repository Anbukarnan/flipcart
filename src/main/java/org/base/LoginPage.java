package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public void Start() {
		PageFactory.initElements(driver, this);
		

	}
	@FindBy(id="email")
	private WebElement txtusername;
	@FindBy(id="pass")
	private WebElement txtpassword;
	@FindBy(name="login")
	private WebElement btnlogin;
	
	
	
	public WebElement getTxtusername() {
		return txtusername;
	}
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	

}
