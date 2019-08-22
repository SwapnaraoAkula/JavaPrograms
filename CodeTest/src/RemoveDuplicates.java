import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of array:");
		int length = sc.nextInt();
		Integer [] arr = new Integer[length];
		for(int i=0;i<length;i++) {
			arr[i]=sc.nextInt();
		}
		for(Integer i:arr) {
			System.out.println(i);
		}
		Set<Integer> set=new HashSet<Integer>();
		Collections.addAll(set,arr);
		System.out.println("Set without duplicates");
		System.out.println(set);
//		System.out.println("Duplicate elements:");
//
//		for(Integer i:arr) {
//			if(!set.add(i)) {
//				System.out.println(i);
//			}
//		}
	}

}
