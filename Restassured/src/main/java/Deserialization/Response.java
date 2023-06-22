package Deserialization;

import java.util.List;

import io.restassured.RestAssured;

public class Response {

	public static void main (String args[]) {
	RestAssured.baseURI = "https://reqres.in/api/users?page=2"; // YOU NEED MAIN METHOD
	
	// create json object
	
	mainpojo userdata =given().log().all().header("Content-Type","application/json").qureyParam("page","2").pathParam("path","users")
	.when().get("api/users").then().log().all().extract().as(mainpojo.class);
	
	// validation
	userdata.getPage();
	userdata.getPer_page();
	userdata.getTotal();
	userdata.getTotal_pages();
	// DATA OBJECT KA VALIDATION
	userdata.getData().getId();
	userdata.getData().getEmail();
	userdata.getData().getFirst_name();
	userdata.getData().getLast_name();
	userdata.getData().getAvatar();
	
	
	// for loop
	for (int i=0 , i<userdata.size(),i++)
	{
		userdata.get(i).getpage();
		userdata.get(i).getPage();
		userdata.get(i).getPer_page();
		userdata.get(i).getTotal();
		userdata.get(i).getTotal_pages();
		userdata.getData().get(i).getId();
		userdata.getData().get(i).getEmail();
		userdata.getData().get(i).getFirst_name();
		userdata.getData().get(i).getLast_name();
		userdata.getData().get(i).getAvatar();	
		
		
		// while loop
		List <UserData> itr =userdata.iterator();
		
		while(itr.hasnext())
		{
			UserData response =itr.Next();
			response.getText();
		}
	}
	}
}