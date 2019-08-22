import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		for(Integer i:al) {
			System.out.println("ArrayList elements:"+i);
		}
		Integer [] arr = new Integer[al.size()];
		arr = al.toArray(arr);
		for(Integer i:arr) {
			System.out.println("Elements of Array:"+i);
		}
	}

}
