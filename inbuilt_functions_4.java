package StringJavaPrograms;

public class inbuilt_functions_4 {
	public static void main(String[] args) {
		
		String s1= "hello";
		String s2="Whatsapp";
		String s3="hello";
		String s4="";
		String s5="HELLO HOW ARE YOU";
		
		//length
		System.out.println("string length is: "+s1.length()); 
		
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		
		//concat
		s1=s1.concat("how are you");
		System.out.println(s1);
		
		//empty or not
		System.out.println(s3.isEmpty());       //false
		System.out.println(s4.isEmpty());		// true
		
		//upper to lower case
		String s5lower=s5.toLowerCase();
		System.out.println(s5lower);
		
		//lower to upper case
		String s3upper=s3.toUpperCase();  
		System.out.println(s3upper); 
	}

}
