package Assignment7;
import java.util.*;
public class SortArrylistDecendingOrder {
	
	public static void main(String args[]) {
		ArrayList<Integer> list= new ArrayList<Integer>();
		
		list.add(3);
		list.add(0);
		list.add(12);
		list.add(4);
		list.add(2);
		list.add(9);
		Collections.sort(list, Collections.reverseOrder());
		
		System.out.println(list);
	}
}
