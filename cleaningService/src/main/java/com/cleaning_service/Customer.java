package com.cleaning_service;



import java.util.ArrayList;
import java.util.List;

public class Customer {


//add time work  ( time startb ,time end )
		private String name;
		private String username;
		private String password;
		private String phoneNumber;
		private String address;
		private Boolean logState=false;
		public static List<Request> requests=new ArrayList<Request>();
		public static List<Request> requestsDone=new ArrayList<Request>();
		public static List<Request> requestsStill=new ArrayList<Request>();

		public Customer() 
		{
			
		}
		public Customer(String s1,String s2,String s3,String s4,String s5)// user name,pass,name,address,phone
		{
			this.username=s1;
			this.password=s2;
			this.name=s3;
			this.address=s4;
			this.phoneNumber=s5;
		}
		public String getName() 
		{
			return this.name;
		}
		public void setName(String name) 
		{
			this.name = name;
		}
		public String getUsername() 
		{
			return this.username;
		}
		public void setUsername(String username)
		{
			this.username = username;
		}
		public String getPassword() 
		{
			return this.password;
		}
		public void setPassword(String password) 
		{
			this.password = password;
		}
		public Boolean getLogState() {
			return this.logState;
		}
		public void setLogState(Boolean logStat) {
			this.logState = logStat;
		}
		public String getPhoneNumber() {
			return this.phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getAddress() {
			return this.address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public List<Request> getRequests() {
			return this.requests;
		}
		public void setRequests(List<Request> Requests) {
			this.requests = Requests;
		}
	
		public void addToCustomerRequest(Request r)
		{
			this.requests.add(r);
		}
		public void removeRequest(int i)
		{
			this.requests.remove(i);
		}
		public void addToCustomerRequestDone(Request r)
		{
			this.requestsDone.add(r);
		}
		public static void resorRequestStill()
		{
			requestsDone.removeAll(requestsDone);
			requestsStill.removeAll(requestsStill);
			for(int i=0;i<requests.size();i++)
			{
				if(requests.get(i).getStatus()==1)
					requestsDone.add(requests.get(i));
				else
					requestsStill.add(requests.get(i));
			}
		}
		
		 @Override
		    public String toString() {
		        return "customer{" +
		                "username =" + username +
		                ", name ='" + name + '\'' +
		                ", phone Number ='" + phoneNumber + '\'' +
		                ", address ='" + address + '\'' +
		                '}';
		}
		

}

