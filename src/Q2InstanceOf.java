//Q2- Use pattern matching for instanceof to write a method that accepts an Object and prints a different message based on whether the object is a String, Integer, or something else.
public class Q2InstanceOf {

	public static void main(String[] args) {
		
		Object s = 99.3; 

		printObjecType(s); 
		
	}
	
	public static void printObjecType(Object obj) {
		
		if(obj instanceof String s) {
			System.out.println("this is a string :"+ s );
			
		}
		else if (obj instanceof Integer i ) {
			System.out.println(" this is an integer:"+i);
			
		} else  {
			System.out.println("unknown type ");
			
		}
	}

}
