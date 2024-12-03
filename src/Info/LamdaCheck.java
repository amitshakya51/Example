package Info;

@FunctionalInterface
interface Sum{
	int add(int a,int b);
}

public class LamdaCheck extends Mytest {
	
	protected String test;
	public static void main(String[] args) {

		String str="hello world";
		System.out.println(str.length());
		String[] s=str.split(" ");
		
		StringBuilder str2=new StringBuilder();
		
		for(int i=s.length-1;i>=0;i--) {
			str2.append(s[i]);
			if(i>0) {
				str2.append(" ");
			}
		}
		System.out.println(str2.toString());
	
	
	}
	

}
