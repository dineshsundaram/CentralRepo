package calculator;

import cucumber.api.java.en.When;

public class Steps {
	
	@When("^I call addition$")
	public void step1()
	{
		addition a1 = new addition();
		a1.add();
	}

}
