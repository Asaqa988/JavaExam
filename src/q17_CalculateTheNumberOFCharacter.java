
public class q17_CalculateTheNumberOFCharacter {

	public static void main(String[] args) {
		
		
		
		System.out.println(getCharactersNumber("ahmad"));;
		System.out.println(getCharactersNumber("ali"));;

		
}
	
	public static 	String  getCharactersNumber (String word) {
		
		return "number of character is " + word.length() + " for the word "+word; 
	}
}