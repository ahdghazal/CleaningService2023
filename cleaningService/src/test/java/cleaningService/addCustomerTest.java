package cleaningService;


import static org.junit.Assert.*;

import java.io.InputStreamReader;
import java.util.Scanner;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addCustomerTest {
 boolean a = false;
	 boolean b = true;
	 String username;
	 String password;
	 String name;
	 String phone;
	 String address;
	 String email;
	 Scanner s=new Scanner(new InputStreamReader(System.in));
	 CustomerFunction cf = new CustomerFunction();
	 Customer c = new Customer() ;
	 

	@Given("these are the customer")
	public void theseAreTheCustomer(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.

		  
		 for(int i=0; i < 4;i++) {
			 username = dataTable.cell(i,1);
			 password = dataTable.cell(i,2);
			 name = dataTable.cell(i,3);
			 phone = dataTable.cell(i,4);
			 address = dataTable.cell(i,5);
		//	 email = dataTable.cell(i,6);

			 Customer c1 =  new Customer(username,password,name,address,phone);

			 CustomerFunction.customers.add(c1);
            
			 
		 }
		 System.out.print("Enter your user name: ");
		 name = s.nextLine();
		 for(int i=0;i<CustomerFunction.customers.size();i++)
			{
				
				if(	username.equalsIgnoreCase( CustomerFunction.customers.get(i).getUsername()  )) {
			//		System.out.print(cf.customers.get(i).getUsername());
					 a=true;
					
				}
				
			
			}
	
	
	
	}
	@Given("the customer<{string}> does not already exist")
	public void theCustomerDoesNotAlreadyExist(String string) {
	    // Write code here that turns the phrase above into concrete actions

	}
	@When("cutomer tries log in")
	public void cutomerTriesLogIn() {
	    // Write code here that turns the phrase above into concrete actions

	}
	@Then("the customer can be added")
	public void theCustomerCanBeAdded() {
	    // Write code here that turns the phrase above into concrete actions
	     assertEquals(false,a);
		
	//	 assertTrue(a==false);
	}
	@Then("the customer is added successful")
	public void theCustomerIsAddedSuccessful() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.print("the password : ");
		 password = s.nextLine();
		 System.out.print("the name : ");
		 name = s.nextLine();
		 System.out.print("the phone: ");
		 phone = s.nextLine();
	     System.out.print("the address: ");
		 address = s.nextLine();
	     System.out.print("the email: ");
	     email = s.nextLine();
			
	 //    Customer c1=new Customer(username,password,name,address,phone,email);
	     Customer c1=new Customer(username,password,name,address,phone);

		 CustomerFunction.customers.add( c1);
			
			 
	}



	@Given("the customer <{string}> already exists")
	public void theCustomerAlreadyExists(String string) {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("the customer cannot be added")
	public void theCustomerCannotBeAdded() {
	    // Write code here that turns the phrase above into concrete actions
		 assertEquals(ture,a);
		// assertTrue(a==true);
	}
	@Then("the customer is log in fail")
	public void theCustomerIsLogInFail() {
	    // Write code here that turns the phrase above into concrete actions

	}




	
	
	
}

