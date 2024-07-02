
public class Q16incrementUntil {

	public static void main(String[] args) {

        Counter counter = new Counter();
        System.out.println("Count: " + counter.incrementUntil(100));
    }
}

class Counter {
    public int incrementUntil(int limit) {
    	
        int count = 0;
        int sum = 0;
        while (count < limit) {
            sum += count;
            count++;
        }
        return sum;
    	
     
    }
}


