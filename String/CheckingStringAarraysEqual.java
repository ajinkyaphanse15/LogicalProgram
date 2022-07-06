package String;

import java.util.Arrays;

public class CheckingStringAarraysEqual {
	public static void main(String[]args) {
		
		
		String a[]= {"java","C","C#","RUBY","PHYTHON"};
		String b[]= {"java","C","C#","RUBY","PHYTHON"};
//		
//		
//		//APPROCH FIRST==>
//		boolean status = Arrays.equals(a, b);
//		
//		if(status==true) {
//			System.out.println("arrays are equlas");
//		}
//		else
//		{
//			System.out.println("arrays are not equlas");
//		}
//		
		//approch 2
		
		boolean status=true;
		
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					status=false;
				}
			}
		}
		else
		{
			status=false;
		}
		
		if(status==true) {
			System.out.println("arrays are equals");
		}
		else
		{
			System.out.println("arrays are not equals");
		}
		
		
		
		
		
		
		
	}

}
