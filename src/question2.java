import java.util.ArrayList;
import java.util.Collections;

public class question2 {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(3);
		list1.add(2);
		list1.add(5);
		list1.add(4);
		list1.add(6);
		list1.add(9);
		list1.add(7);
		list1.add(10);
		list1.add(8);
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(1+5);
		list2.add(3+5);
		list2.add(2+5);
		list2.add(5+5);
		list2.add(4+5);
		list2.add(6+5);
		list2.add(9+5);
		list2.add(7+5);
		list2.add(8+5);
		list2.add(15);
		//I could have and most likely should have done something fancy involving functions here, but I figure the function would require more than 25 lines of code, so #effort
		for (int thing : list2){
			if (!list1.contains(thing)){
				list1.add(thing);
			}
		}
		Collections.sort(list1);
		int size = list1.size();
		int middle = size/2;
		list1.remove(middle);
		size = list1.size();
		//this assumes that there's an odd number of elements in the array, because there's only one array input, the one I set up, and I know that's odd. 
		int i = 1;
		while (i<=size){
			System.out.println(list1.get(size-i));
			i++;
		}
	}

}
