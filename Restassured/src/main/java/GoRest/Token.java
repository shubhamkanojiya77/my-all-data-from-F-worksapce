package GoRest;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.testng.asserts.SoftAssert;
public class Token {

	public static void main(String[] args) {
		// token -   126535532c498dcfb342a0fc705d6af39436ea6d05b95b17fa56a08c34d9bf8b

		RestAssured.baseURI="https://gorest.co.in";
		
		CreateUserReqPojo createuserreqpojo = new CreateUserReqPojo();
		
		createuserreqpojo.setName("Chris");
		createuserreqpojo.setGender("27");
		createuserreqpojo.setEmail("shubhamrk77@gmail.com");
		createuserreqpojo.setStatus("Active");
		
		
		CreateUserRespPOJO createuserresppojo = given().log().all().header("Content-Type","application/json").header("Token","126535532c498dcfb342a0fc705d6af39436ea6d05b95b17fa56a08c34d9bf8b")
				.body("createuserreqpojo").when().post("public/v2/users").then().log().all().extract().as(CreateUserRespPOJO.class);
		
		String id =createuserresppojo.getId();
		System.out.println(id); // iska use get me karunga
		//********************************
		
		// get user using id
		
		
		GetUserRespPojo getuserresppojo =given().log().all().pathParam("{user id}", id).header("Token","126535532c498dcfb342a0fc705d6af39436ea6d05b95b17fa56a08c34d9bf8b")
	.when().get("public/v2/users/{user id}").then().extract().as(GetUserRespPojo.class);
	
		getuserresppojo .getName();
		getuserresppojo .getGender();
		getuserresppojo .getId();
		
		SoftAssert  softassert=new SoftAssert();
		softassert.assertEquals(getuserresppojo .getName(), "chris");
		softassert.assertEquals(getuserresppojo .getGender(), "27", "user details are correct");
		softassert.assertAll();
		
	}

}
