package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class TestClass {
	public static void main(String[] args) {
		
		String str1="My name is Vikas.", temp= "";
		
		String lastchar=(Character.toString(str1.charAt(str1.length()-1)));
		
		
		str1=str1.replace(lastchar, "");
		
		List<String> mylist=new ArrayList<String>(Arrays.asList(str1.split(" ")));
		//Collections.reverse(mylist);
		System.out.println(mylist);
		List<String> olist=new ArrayList<String>();
		for(int j=mylist.size()-1;j>=0;j--) {
			
			if(j==0) {
				olist.add(mylist.get(j).concat(lastchar));
			}
			else
			{
				olist.add(mylist.get(j));
			}
		}
		
		System.out.println(olist);
		List<String> list1= mylist.stream().collect(Collectors
				.collectingAndThen
				(Collectors.toList(),
						l->{Collections.reverse(l);return l;}));
		Stream<String> slist=mylist.parallelStream();
		//System.out.println(slist.collect());
		System.out.println("Stream ouput"+list1);
		
		
	
	
	}
}
