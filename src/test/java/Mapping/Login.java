package Mapping;

import Utility.SeleniumOperations;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
	@Given ("^user launch browser with exe\"(.*)\"$")
	public void bLaunch(String exe)
	{
		//browser launch
		
				Object[] input1=new Object[2];
				input1[0]="webdriver.chrome.driver";
				input1[1]=exe;
				SeleniumOperations.browserLaunch(input1);
	}
	
@Given ("^user provide url as\"(.*)\"$")
	
	public void OpenApp(String url) throws InterruptedException
	{
		Object[] input2=new Object[1];
		input2[0]=url;
		SeleniumOperations.openApp(input2);
	}
	
@When ("^user provide \"(.*)\" as username$")
	
	public void uname(String userN)
	{
		Object[] input3=new Object[2];
		input3[0]="//*[@id='txtuId']";
		input3[1]=userN;
		SeleniumOperations.sendText(input3);
		
	}
@When ("^user provide \"(.*)\" as password$")
	public void pass(String passW)
	{
		Object[] input4=new Object[2];
		input4[0]="//*[@id='txtPword']";
		input4[1]=passW;
		SeleniumOperations.sendText(input4);
	}

@When ("^user click on login button$") 
	public void loginc()
	{
		Object[] input5=new Object[1];
		input5[0]="//*[@id='login']";
		SeleniumOperations.ClickElement(input5);
	}
	
@Then("^application shows user profile to user$")
public void application_shows_user_profile_to_user() throws Throwable {
  
	Object[] input6=new Object[2];
	input6[0]="Admin";
	input6[1]="//*[text()='Admin']";
	SeleniumOperations.Validation(input6);
}

@When("^user click on Branches$")
public void user_click_on_Branches() throws Throwable {
   
	Object[] input6=new Object[1];
	input6[0]="(//*[@width='132'])[1]";
	SeleniumOperations.ClickElement(input6);
	
}

@When("^user provide \"([^\"]*)\" as country$")
public void user_provide_as_country(String value) throws Throwable {
	
	Object[] input7=new Object[2];
	input7[0]="//*[@name='lst_countryS']";
	input7[1]=value;
	SeleniumOperations.selectElement(input7);
	
 
}

@When("^user provide \"([^\"]*)\" as state$")
public void user_provide_as_state(String value1) throws Throwable {
    
	Object[] input8=new Object[2];
	input8[0]="//*[@name='lst_stateS']";
	input8[1]=value1;
	SeleniumOperations.selectElement(input8);
	
}

@When("^user provide \"([^\"]*)\" as city$")
public void user_provide_as_city(String value2) throws Throwable {
  
	Object[] input9=new Object[2];
	input9[0]="//*[@name='lst_cityS']";
	input9[1]=value2;
	SeleniumOperations.selectElement(input9);
}

@When("^user click on search$")
public void user_click_on_search() throws Throwable {
	
	Object[] input10=new Object[1];
	input10[0]="//*[@id='btn_search']";
	SeleniumOperations.ClickElement(input10);
   
}

@Then("^user get branch details$")
public void user_get_branch_details() throws Throwable {
  
}

@Then("^user click on clear button$")
public void user_click_on_clear_button() throws Throwable {
   
	Object[] input11=new Object[1];
	input11[0]="//*[@id='btn_clsearch']";
	SeleniumOperations.ClickElement(input11);////*[@src='images/Roles_but.jpg']  
}

@Then("^user click on Roles$")
public void user_click_on_Roles() throws Throwable {
	Object[] input12=new Object[1];
	input12[0]="//*[@src='images/Roles_but.jpg']";
	SeleniumOperations.ClickElement(input12);
 
}
@Then("^user click on Users$")
public void user_click_on_Users() throws Throwable {
	Object[] input13=new Object[1];
	input13[0]="//*[@src=\"images/Users_but.jpg\"]";
	SeleniumOperations.ClickElement(input13);
}

@Then("^user click employee$")
public void user_click_employee() throws Throwable {
	Object[] input14=new Object[1];
	input14[0]="//*[@src='images/emp_btn.jpg']";
	SeleniumOperations.ClickElement(input14);
}
// 

@When("^user click on new employee$")
public void user_click_on_new_employee() throws Throwable {
	Object[] input15=new Object[1];
	input15[0]="//*[@id='BtnNew']";
	SeleniumOperations.ClickElement(input15);
}

@When("^user provide  \"([^\"]*)\" as Employer Name$")
public void user_provide_as_Employer_Name(String empname) throws Throwable {
    
	Object[] input16=new Object[2];
	input16[0]="//*[@id='txtUname']";
	input16[1]=empname;
	SeleniumOperations.sendText(input16);
}

@When("^user provide  \"([^\"]*)\" as Login Password$")
public void user_provide_as_Login_Password(String emppwd) throws Throwable {
	Object[] input17=new Object[2];
	input17[0]="//*[@id='txtLpwd']";
	input17[1]=emppwd;
	SeleniumOperations.sendText(input17);
}

@When("^user provide  \"([^\"]*)\" as Role$")
public void user_provide_as_Role(String role) throws Throwable {
	Object[] input18=new Object[2];
	input18[0]="//*[@id='lst_Roles']";
	input18[1]=role;
	SeleniumOperations.selectElement(input18);
}

@When("^user provide  \"([^\"]*)\" asBranch$")
public void user_provide_asBranch(String branch) throws Throwable {
	Object[] input19=new Object[2];
	input19[0]="//*[@id='lst_Branch']";
	input19[1]=branch;
	SeleniumOperations.selectElement(input19);
    
}

@Then("^user click on submit button$")
public void user_click_on_submit_button() throws Throwable {
	Object[] input20=new Object[1];
	input20[0]="//*[@id='BtnSubmit']";
	SeleniumOperations.ClickElement(input20);
}
@Then("^user click on ok$")
public void user_click_on_ok() throws Throwable {
	SeleniumOperations.AlertHandle();

}

@Then("^user click on logout button$")
public void user_click_on_logout_button() throws Throwable {
	Object[] input21=new Object[1];
	input21[0]="//*[@src='images/admin_but_03.jpg']";
	SeleniumOperations.ClickElement(input21);
}
}
