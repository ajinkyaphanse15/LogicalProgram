package String;

public class HowToFindMissingNO {
	public static void main(String[]args) {
//		
	//int ar[]= {1,2,3,4,5,8,10};
	
//		int sum=0;
//		for(int i=0;i<ar.length;i++) {
//			sum=sum+ar[i];
//					
//		}
//		System.out.println(sum);
//		int sum1=0;
//		for(int j=1;j<=10;j++) {
//			sum1=sum1+j;
//		}
//		System.out.println(sum1);
//		
//		System.out.println("missing no is:"+(sum1-sum));
////	
//    int count =0;
//	for(int i=0;i<10;i++) {
//		for(int j=1;j<=10;j++) {
//			if(ar[i]!=j) {
//				System.out.println("missing no is :"+);
//			}
//		}
//	}
//	
//		System.out.println("no missing no");
////	
//		int a[]= {1,2,3,4,6,7,8,9,10};
//		int sum=0;
//		
//		for(int i=0;i<a.length;i++) {
//			sum=sum+a[i];
//		}
//		System.out.println(sum);
//		int sum1 = 0;
//		for(int i=1;i<=10;i++) {
//			sum1=sum1+i;
//		}
//		System.out.println(sum1);
//		
//		System.out.println("MISSING NO IS"+ (sum1-sum));
//		======================================================
		//EXAMPLE NO5
		int a[]= {1,2,3,4,5,6,8,9,10};
		int MissingNo=0;
		int sum=0;
		  for(int i=0;i<a.length;i++) {
			  sum=sum+a[i];
		  }
		 
		  int sum1=0;
		  
		  for(int j=1;j<=10;j++) {
			  sum1=sum1+j;
		  }
		
		 System.out.println("MISSING NO IN THIS ARRAY IS:"+(sum1-sum));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
