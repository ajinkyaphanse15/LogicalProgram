package NewExamples;

public class RemoveSpecailChar {
	public static void main(String[]args) {
		String str="U are my #EX H&usba@nd 345";
		
//		str=str.replaceAll("[^a-zA-Z]", "");
//		
//		System.out.println("after Removing special char string looks like:"+str);
//		
		//==================================================================
		//REMOVING SPACES FROM STRING
		str=str.replaceAll("[^a-zA-Z]", "");
		str=str.replaceAll("\\s","");
		System.out.println(str);
		
		
		
	}

}
