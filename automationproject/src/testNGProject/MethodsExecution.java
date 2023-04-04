package testNGProject;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MethodsExecution {
  @Test
  public void method1() {
  long threadid = Thread.currentThread().getId();
  Reporter.log(threadid+"is the threadid");
	  
  }
}
