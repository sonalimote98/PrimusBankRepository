package Mapping;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hookable {
		
		@Before
		public void before(Scenario Scenario)
		{
		System.out.println("---------------------Scenario Start--------------------------");
			
		}
		
		@After
		public void after(Scenario Scenario)
		{
			System.out.println("---------------------Scenario finish---------------------");
			
			
		}
		
		
	}

