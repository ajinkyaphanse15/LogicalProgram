package String;

public class FindDuplicateInArray {
	public static void main(String[] args) {
//		
//		String ar[]= {"java","C","C++","PHYTHON","java","C"};
//		boolean flag=false;
//		
//		
//		for(int i=0;i<ar.length;i++) {
//			for(int j=i+1;j<ar.length;j++) {
//				if(ar[i]==ar[j]) {
//					System.out.println("THIS IS DUPLICATE ELEMENT IN THIS ARRAY:"+ar[i]);
//					flag=true;
//				}
//			}
//		}
//		
//		if(flag==false) {
//			System.out.println("NO DUPLICATE ELEMENT FOUND");
//		}
//		
//		String lang[]= {"java","C","C++","python","ruby"};
//		boolean flag=false;
//		
//		for(int i=0;i<lang.length;i++) {
//			for(int j=i+1; j<lang.length;j++) {
//				if(lang[i]==lang[j]) {
//					System.out.println("DUPLICATE ELEMENT IS FOUND:"+" "+lang[i]);
//					flag=true;
//				}
//			}
//		}
//		if(flag==false) {
//			System.out.println("DUPLICATE ELEMENT IS NOT PRESENT IN ARRAY");
//		}
//		
//		
//		String a[]= {"java","C","C#","RUBY","PHYTHON","java","C#"};
//		boolean status=false;
//		
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j]) {
//					System.out.println("DUPLICATE ELEMENT IS FOUND:"+a[i]);
//					status=true;
//				}
//			}
//		}
//		if(status==false) {
//			System.out.println("DUPLICATE ELEMENT IS NOT FOUND");
////		}
////		
//		String a[]= {"java","ruby","phython","c#","phython","java"};
//		boolean flag = false;
//		
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j]) {
//					System.out.println("DUPLICATE ELEMENT IS FOUNT:"+a[i]);
//					flag=true;
//				}
//			}
//		}
//		if(flag==false) {
//			System.out.println("DUPLICATE ELEMENT IS NOT FOUND");
//		}
//		===========================================================
		
		String a[]= {"SAMSUNG","VIVO","OPPO","VIVO","OPPO","ONEPLUS","IPHONE","MICROMAX"};
		boolean flag = false;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println("DUPLICATE ELEMENT IS FOUND:"+a[i]);
					flag=true;
				}
			}
		}
		
		if(flag==false) {
			System.out.println("NO DUPLICATE ELEMENT IS FOUND");
		}
		
		
		
		
		
		
		
		
		
		
	}

}
