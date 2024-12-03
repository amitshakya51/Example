package StringExample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


interface drawable {
	public int add(int a,int b);
}

public class Stringtest {
	
	static String str="Amit Shakya";
	
	String name;
	
	public Stringtest() {
		this.name="Rakesh";
	}
	
	public static void main(String[] args) {
	
		List<String> list=new ArrayList<String>();
		list.add("Amit");
		list.add("Rakesh");
		list.add("Raman");
	
		Stringtest s= new Stringtest();
		System.out.println("instance "+s.name);
		System.out.println("Static "+str);
		//list.forEach((n)->System.out.println(n));
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
 	}
	
		public void test() {
			int itr;
		}
	

}
