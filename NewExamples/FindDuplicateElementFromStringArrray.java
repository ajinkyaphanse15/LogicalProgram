package NewExamples;

import java.util.Arrays;

public class FindDuplicateElementFromStringArrray {
	public static void main(String[]args) {
		String a[]= {"ajinkya","sanket","shankar","ajay","shankar","ajinkya"};
		boolean status = false;
		System.out.println(a.length);
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("DUPLICATE ELEMENT IS FOUND :"+a[i]);
					status=true;
				}
			}
			
			if(status==false) {
				System.out.println("not found");
			}
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
