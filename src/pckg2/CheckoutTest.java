package pckg2;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class CheckoutTest {
	
	@Test(groups= {"Sanity"})
	public void Test4() {
		
		System.out.println("Inside Test-4");
	}

	
	@BeforeGroups("Sanity")
	public void beforeG() {
		
		System.out.println("Inside Before Group");

	}
}
