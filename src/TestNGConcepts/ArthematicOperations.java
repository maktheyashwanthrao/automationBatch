package TestNGConcepts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ArthematicOperations {
	
	
  @Test
  @Parameters({"val1", "val2"})
  public void addition(int a, int b) {
	  int add = a+ b;
	  System.out.println("addition of two numbers is " + add);
  }
  
  @Test
  @Parameters({"val1", "val2"})
  public void multiplication(int a, int b) {
	  int mul = a * b;
	  System.out.println("addition of two numbers is " + mul);
  }
  
}
