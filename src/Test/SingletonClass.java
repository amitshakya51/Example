package Test;

import java.util.Arrays;
import java.util.List;

class Bike{
	final void run() {
		System.out.println("running!!!!!");
	}
}

public class SingletonClass{
	
	public static void main(String[] args) {
		String[] str= {"Amit","Sumit","Rakesh","Raman"};
		
		String s="Amit shakay",temp=" ";
		char ch;
		for(int i=0;i<s.length();i++) {
			ch=s.charAt(i);
			temp=ch+temp;
			
		}
		System.out.println(temp);
		
		List<String> list=Arrays.asList("amit","sumit","rakesh");
		
		
		

	}
	
	

}
