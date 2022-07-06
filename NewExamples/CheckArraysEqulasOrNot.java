package NewExamples;

import java.util.Arrays;

public class CheckArraysEqulasOrNot {
	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		int b[]= {10,20,30,40,60};
		
		boolean result = Arrays.equals(a, b);
		
		System.out.println(result);
		
		
		//APPROCH 2
		boolean status = true;
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				if(a[i]!=b[i]) {
					status=false;
				}
			}
		}
		else {
		   status=false;
		}
		
		
		if(status==true) {
			System.out.println("ARRAYS ARE EQULAS");
		}
		else {
			System.out.println("arrays are not equals");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
