
public class javadatatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating and initializing custom character
		char a = 'G';	
		
		// Integer data type is generally
        // used for numeric values
		
		int i = 89;
		
		// use byte and short
        // if memory is a constraint
		
		byte b = 4;
		// this will give error as number is
        // larger than byte range
        // byte b1 = 7888888955;
		
		short s = 56;
		// this will give error as number is
        // larger than short range
        // short s1 = 87878787878;
  
        // by default fraction value
        // is double in java
		
		double d = 4.567656;
		
		// for float use 'f' as suffix as standard
		float f = 4.7333434f;
		
		// need to hold big range of numbers then we need
        // this data type
		
		long l = 1212121;
		
		// Declare String without using new operator 
		String s11 = "GeeksforGeeks"; 

		// Declare String using new operator 
		String s1 = new String("GeeksforGeeks"); 
		System.out.println("char :" + a);
		System.out.println("int :" + i);
		System.out.println("byte :" + b);
		System.out.println("short :" + s);
		System.out.println("double :" + d);
		System.out.println("float :" + f);
		System.out.println("long :" + l);
		System.out.println("string :" + s11);
		System.out.println("string :" + s1);
					
	}

}
