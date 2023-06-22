

public class thisKeyword {
	public int a; //declare
		int b;
		static int c;
	
		public void M1() { 
			//Reference id of this will be similar to the object which called M1 method from main
			System.out.println("Reference id of this "+ this); //if called by xyz object then this id is similar to xyz object
			//if you have a call instance variable or method , you need to create object
			//but in instance method we don't need to do that the reason is compiler will add this as shown below
			a=5;  //this.a=5---> //xyz.a=5;
			M3(this); // you can pass the this keyword as parameter as well
		}
		
		// Main use of this is when instance variable and local variable is having same name
		// to differentiate between instance varaible and local variable you need to use this keyword like below
		public void M2(int a,int b,int c) { //local variable
			this.a=a; // add this keyword to represent a instance variable and assign local a value
			this.b=b;
			thisKeyword.c=c; // no need to use this as c is static variable 
			
		}
		
		public void M3(thisKeyword obj) {
			
		}
		
		public void M1(thisKeyword test) {
			System.out.println(test);
		}
		
		public static void main(String[] args) {
			
			thisKeyword abc=new thisKeyword(); //object name is abc
			
			System.out.println("Reference Id of abc " +abc); //reference id
			
			thisKeyword xyz=new thisKeyword(); //object name is xyz
			
			System.out.println("Reference id of xyz " +xyz);
			
			xyz.M1(); //called by xyz object so this will represent the xyz
			abc.M1(); //called by abc object so now this will represent abc object
			
	
		}
	
	}
	
