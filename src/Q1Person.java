
// Q1 Qa 1 - Implement a class Person with fields name and age. Add a method to return a greeting message using the person's name.

public class Q1Person {
	private String name ; 
	
	private int age ; 
	
	
	public Q1Person (String name , int age ) {
		this.name = name ; 
		
		this.age = age ; 
		
	}
	
	public String greet () {
		return "hello , my name is "+ name ; 
	}
	
	
	

	public static void main(String[] args) {
		Q1Person person = new Q1Person("ahmad", 20); 
		System.out.println(person.greet());
	
		
	}

}
