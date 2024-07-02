//Q4 - Write a method using a RandomGenerator to generate and print five random integers between 1 and 100.

import java.util.Random;

public class Q4_RandomInt {

	public static void main(String[] args) {
		
		Random rand = new Random(); 
		
		for(int i = 0 ; i < 5;i++) {
			System.out.println(rand.nextInt(1, 100));
		}
		

	}

}
