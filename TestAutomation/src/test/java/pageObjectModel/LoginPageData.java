package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageData {
	
	@FindBy(id="ap_email")
	public WebElement uiGlobal_email_mobileNumber;
	
	@FindBy(id="continue")
	public WebElement uiGlobal_continueButton;
	
	@FindBy(id="createAccountSubmit")
	public WebElement uiGlobal_createYourAccount;
	
	@FindBy(xpath="//span[@class='a-expander-prompt']")
	public WebElement uiGlobal_needHelp;
	
	@FindBy(id="auth-fpp-link-bottom")
	public WebElement uiGlobal_forgotPassword_LoginPage;
	
	@FindBy(id="ap-other-signin-issues-link")
	public WebElement uiGlobal_issuesWithSignIn;
	
	@FindBy(id="ap_change_login_claim")
	public WebElement uiGlobal_changeLoginOption;
	
	@FindBy(id="ap_password")
	public WebElement uiGlobal_password;
	
	@FindBy(id="auth-fpp-link-bottom")
	public WebElement uiGlobal_forgotPassword_PasswordPage;
	
	@FindBy(id="signInSubmit")
	public WebElement uiGlobal_loginButton;
	
	@FindBy(xpath="//input[@name='rememberMe']")
	public WebElement uiGlobal_keepMeSignedIn;
	
	@FindBy(id="continue")
	public WebElement uiGlobal_loginUsingOTP;
	
}
