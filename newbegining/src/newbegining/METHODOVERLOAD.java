package newbegining;

public class METHODOVERLOAD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		METHODOVERLOAD obj=new METHODOVERLOAD();
		obj.hello(1);
		
		//obj.hello(short(10));// error
		obj.hello((short)10);
		obj.hello((byte)55);
	}
	public void hello(short a) {
		System.out.println("short");	
	}

	public void hello(byte t) {
		System.out.println("byte");	
	}
	public void hello(long b) {
		System.out.println("long");	
	}
	public void hello(int c) {
	System.out.println("integer");	
	}
	
	public void hello(int...k) {
		System.out.println("integer array");	
		}
	
	public void hello(Integer n) {
		System.out.println("wrapper");	
		}
		

}