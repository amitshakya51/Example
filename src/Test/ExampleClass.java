package Test;

import Info.LamdaCheck;

public class ExampleClass extends Employee {
	
	static String collage="its";
	
	private String name;
	
	
	
	public static void main(String[] args) {
		
	ExampleClass ex=new ExampleClass();
	ex.work();
	LamdaCheck n=new LamdaCheck();
	
	

	}

	@Override
	void work() {
		System.out.println("running");
		
	}
	
}
