package testNGFlag;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupExecution {
  
	@Test(groups = "FUNCTIONAL")
  public void f1() {
	  
	Reporter.log(" FTC1 is executed!!", true);  
 
 }
  
	@Test(groups = "SMOKE")
  public void st1() {
	  
	Reporter.log(" STC1 is executed!!", true);  
 }
  @Test(groups = "INTEGRATION")
  public void it1() {
	  
	Reporter.log(" ITC1 is executed!!", true);  
 }
  
	@Test(groups = "FUNCTIONAL")
	  public void f2() {
		  
		Reporter.log(" FTC2 is executed!!", true);  
	 
	 }
	  @Test(groups = "SMOKE")
	  public void st2() {
		  
		Reporter.log(" STC2 is executed!!", true);  
	 }
	  @Test(groups = "INTEGRATION")
	  public void it2() {
		  
		Reporter.log(" ITC2 is executed!!", true);  
	 }

}