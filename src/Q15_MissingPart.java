
public class Q15_MissingPart {

    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor();
        int[] numbers = {1, 2, 3, 4, 5,6,10,15,17,19,25};
        System.out.println("Sum of even numbers: " + processor.sumEvenNumbers(numbers));
    }
}

class NumberProcessor {
    public int sumEvenNumbers(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
            	sum += number ; 
            }
        }
        return sum;
    }
}



