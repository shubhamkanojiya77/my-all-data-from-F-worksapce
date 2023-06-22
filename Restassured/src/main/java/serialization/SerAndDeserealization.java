package serialization;

import io.restassured.RestAssured;
import static  io.restassured.RestAssured.*;
public class SerAndDeserealization {

	public static void main(String[] args) {
	
		RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		
		// create main pojo class object
		Requestpojo  requestpojo= new Requestpojo();
		
		// set the values of main pojo
		requestpojo.setUsername("shubham");
		requestpojo.setLastname("kanojiya");
		requestpojo.setTotalprice("55000");
		requestpojo.setDepositpaid("15000");
		requestpojo.setAdditionalneeds("40000");
		
		
		// create nested  pojo class object
		Bookingdatesnestedpojo bookingdatesnestedpojo = new Bookingdatesnestedpojo();	
		
		// set the value of nested pojo
		bookingdatesnestedpojo.setCheckin("11/02/2022");
		bookingdatesnestedpojo.setCheckout("14/02/2023");
		
		
		
		
		given().log().all().body(requestpojo).when().post("booking").then().log().all();
		
		
	}

}
