package String;

import java.util.Arrays;

public class CheckArrayEqulas {
	public static void main(String[]args) {
		
//		int a[]= {1,2,3,4,5,6};
//		int b[]= {1,2,3,4,5,6};
//		
//		boolean status = Arrays.equals(a, b);
//		
//		if(status==true) {
//			System.out.println("array are equals");
//		}else
//		{
//		System.out.println("array not equals");
//		}
		
		
//		//approch2
//		boolean status = true;

		//		if(a.length==b.length) {
//			for(int i=0;i<a.length;i++) {
//				if(a[i]!=b[i]) {
//				 status = false;
//				}
//			}
//		}
//			else {
//				status=false;
//			}
//		
//		if(status==true) {
//			System.out.println("array equal");
//		}
//		else {
//			System.out.println("nt equal");
//		}
//		
		//if we want to check to arrays are equal are or not for that we have two approches
		
		//APPROCH 1==> we are directly use arrays. equlas method
//		int a[]= {1,2,3,4,5,6};
//		int b[]= {1,2,3,4,5,6};
		
		
		//boolean status = Arrays.equals(a, b);
		
//		if(status==true) {
//			System.out.println("both arrays are equlas");
//		}
//		else {
//			System.out.println("both arrays are nt equlas");
//		}
		
//		boolean status=true;
//		//APPROCH 2==>
//		if(a.length==b.length) {
//			for(int i=0;i<a.length;i++) {
//				if(a[i]!=b[i]) {
//					status=false;
//				}
//			}
//		}
//		else {
//			status=false;
//		}
//		
//		if(status==true) {
//			System.out.println("arrays are equals");
//		}
//		else
//		{
//			System.out.println("arrays are not equlas");
//		}
//		===============================================================
		
		//Example 3
		//First approch to check that arrays are equals or not;
//		String a[]= {"java","phython","ruby","c#"};
//		String b[]= {"java","phython","ruby","c#"};
//		
//		boolean status = Arrays.equals(a, b);
//		
//		if(status==true) {
//			System.out.println("arrays are equlas");
//		}
//		else
//		{
//			System.out.println("arrays are not equals");
//		}
//	//	===========================================================
//		boolean status = true;
//		if(a.length==b.length) {
//		   for(int i=0;i<a.length;i++) {
//			   if(a[i]!=b[i]) {
//				    status = false;
//			   }
//		   }
//		}
//			
//		else {
//			status=false;
//		}
//		
//		if(status==true) {
//			System.out.println("arrays are equlas");
//		}
//		else {
//			System.out.println("arrays are not equlas");
//		}
//		=================================================================
		int a[]= {1,2,3,4,5,6,7,8,9};
		int b[]= {1,2,3,4,5,6,7,8,9};
		
//		boolean status = Arrays.equals(a, b);
//		
//		if(status==true) {
//			System.out.println("arrays are equals");
//		}else {
//			System.out.println("arrays are not equals");
//		}
//		
		boolean status = true;
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
		}else {
			System.out.println("arrays are not equals");
		}
		
		
		
		
		
		
		
		
	}

}
