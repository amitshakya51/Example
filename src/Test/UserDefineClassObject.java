package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class UserDefineClassObject {
	
	public static void add(int a,int b) {
		
		
		int c=a+b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		UserDefineClassObject n=new UserDefineClassObject();
		n.add(5, 6);
		System.out.println();
		List<User> ulist=new ArrayList<>();
		employeeList(ulist);
		
	List<User> hisal=ulist.stream().filter(e->e.getSalary()>75000).collect(Collectors.toList());
		
	
	System.out.println(hisal.toString());
	
	List<Integer> nlist=Arrays.asList(10,15,20,60,21);
	
	/*
	 * List<Integer> evenlist=nlist.stream() .filter(n-> n%2 == 0)
	 * .collect(Collectors.toList());
	 */
	//System.out.println(evenlist);
		
		
		
	
	}
	
	
	
	
	public static void employeeList(List<User> emplist) {
		
		User u=new User();
		u.setName("Amit Shakya");
		u.setCity("Farrukhabad");
		u.setSalary(50000);
		u.setId("5");
		
		User u1=new User();
		u1.setName("Raman");
		u1.setCity("Mathura");
		u1.setSalary(75000);
		u1.setId("4");
		
		User u2=new User();
		u2.setName("Rajesh");
		u2.setCity("Hapur");
		u2.setSalary(80000);
		u2.setId("3");
		
		User u3=new User();
		u3.setName("Rakesh");
		u3.setCity("sangam Vihar");
		u3.setSalary(85000);
		u3.setId("2");
		
		User u4=new User();
		u4.setName("Aman");
		u4.setCity("Kanpur");
		u4.setSalary(90000);
		u4.setId("1");
		
		emplist.add(u4);
		emplist.add(u3);
		emplist.add(u2);
		emplist.add(u1);
		emplist.add(u);
		
	}

}


