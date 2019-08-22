import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateEltsFromArray {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		Integer[] arr = {20,30,40,50,10,20};

		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(Integer i:arr) {
			if(map.containsKey(i)) {
				map.put(i,map.get(i) +1);
			}else {
				map.put(i,1);
			}
			
		}
		System.out.println(map);
		System.out.println(map.values());
		for(Integer i:map.keySet()) {
			if(map.get(i)==1) {
				//System.out.println(i);
				al.add(i);
			}
		}
//		System.out.print("ArrayList without duplicate elements:");	
//		for(Integer i:al)
//		System.out.println(i);
		System.out.println("missing 20 need to fix it");
		System.out.println("Array without duplicates:");
		Integer [] arr1= new Integer [al.size()];
		al.toArray(arr1);
		for(Integer i:arr1)
		System.out.println(i);

	}

}
