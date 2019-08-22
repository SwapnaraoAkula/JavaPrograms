import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrayToSet {

	public static void main(String[] args) {
		Integer [] sourceArray = {1,2,3,4,2,3,5,6,5};
		Set <Integer> targetSet = new HashSet<Integer>();
		Collections.addAll(targetSet, sourceArray);
		System.out.println(targetSet);
		Integer [] arr1 = new Integer[targetSet.size()];
		targetSet.toArray(arr1);
		System.out.println("converted set to array again with no duplicates");
		for(Integer i:arr1)
		System.out.println(i);
		
	} 

}
