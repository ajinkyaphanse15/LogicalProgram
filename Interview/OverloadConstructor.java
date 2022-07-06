package Interview;

public class OverloadConstructor {
	
	public OverloadConstructor() {
		System.out.println("this is zero arrgumental constructor");
	}
	
	public OverloadConstructor(int a, int b) {
		a=20;
		b=30;
		System.out.println(a+b);
	}
	
	//public static void main(String[] args) {
//		OverloadConstructor o=new OverloadConstructor();
//		OverloadConstructor o1= new OverloadConstructor(20,30);
//		
	//}
	
	public static void main() {
		System.out.println("1");
	}
	
	public static void main(int a) {
		a=20;
		System.out.println("a");
	}
	
	public static void main(String[] args) {
	 
		OverloadConstructor.main();
		OverloadConstructor.main(30);
		//OverloadConstructor.main(null);
		
		// "good it is very impressive keep it up";
		
	}
	
	
	
	
	
	

}
