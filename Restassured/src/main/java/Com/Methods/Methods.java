package Com.Methods;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import io.restassured.json.path; // not found

import org.asynchttpclient.Response;
import org.testng.Assert;
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
RestAssured.baseURI= "https://reqres.in";

// post method  https://reqres.in/api/users

given().log().all().header("Content-Type","application/json").body("{ \"Name\":\"Shubham Kanojiya\",\r\n"
		+ "\"Job\":\"Senior Tester\"\r\n"
		+ "}")
.when().post("/api/users").then().assertThat().statusCode(201);

//GET method  https://reqres.in/api/users

given().log().all().when().get("/api/users")
.then().assertThat().statusCode(200);


//PUT method  https://reqres.in/api/users

given().header("Content-Type","application/json").body("{\"Name\":\"Shubham Kanojiya\",\r\n"
		+ "\"Job\":\"DEVOPS\"\r\n"
		+ "}")
.when().put("").then().assertThat().statusCode(200);

//DELETE  method  https://reqres.in/api/users
given().log().all().when().delete("/api/users").then().assertThat().statusCode(404);

// VALIDATION

io.restassured.response.Response response =given().header("Content-Type","application/json").body("{\"Name\":\"Shubham Kanojiya\",\r\n"
		+ "\"Job\":\"DEVOPS\"\r\n"
		+ "}")
.when().put("").then().assertThat().statusCode(200).extract().response();

//response time
response.getTime();

long responsetime =response.getTime();
System.out.println(responsetime);
Assert.assertTrue(responsetime<500);
// status
response.getStatusCode();

int statuscode=response.getStatusCode();
System.out.println(statuscode);
Assert.assertEquals(statuscode, 201);

// header
response.getHeader("server");

String header=response.getHeader("server");
System.out.println(header);
Assert.assertEquals(header, "");


// response body validation

Jsonpath jp=new Jsonpath("response.asString()");

jp.getString();
String username=jp.getString("name");/

System.out.println(username);// you get the value of name 



}}