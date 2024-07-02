import java.util.ArrayList;
import java.util.List;

public class q5instanceofList {

	public static void main(String[] args) {

		List <Object> list = new ArrayList<Object>();
		
		list.add("ahmad"); 
		list.add(10);
		list.add(true); 
		list.add(55.6); 
		
		processOfCheckList(list); 
		
	}
	
	
	public static void processOfCheckList(List<Object> list) {
		
		for(int i = 0 ; i < list.size();i++) {
			if(list.get(i) instanceof String s) {
				System.out.println(" String"+s);
			}
			else if (list.get(i) instanceof Integer in) {
				System.out.println("integer"+in);
			}
			else if(list.get(i) instanceof Double d) {
				System.out.println("double"+d);
			}
			else {
				System.out.println("other type but not string ,integer,double");
			}
			
		}
		
	}

}
